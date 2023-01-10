<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%
String id = request.getParameter("root");
String driverName = "com.mysql.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "pharmacy";
String userId = "root";
String password = "programming";

try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}

Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<h2 align="center"><font><strong>Medicine List</strong></font></h2>

<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM bill ORDER BY billid DESC LIMIT 1";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>


<p>Bill ID: <%=resultSet.getInt("billid") %></p><hr>
<p>Customer: <%=resultSet.getString("customer") %></p><hr>
<p>DATE: <%=resultSet.getString("date") %></p><hr>
<p>Medicine: <%=resultSet.getString("medicine") %></p><hr>
<p>Quantity: <%=resultSet.getInt("qty") %></p>
<p>Total Cost: <%=resultSet.getInt("qty") * resultSet.getDouble("totalprice") %></p><hr>

<br> <br> <br>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>
</table>