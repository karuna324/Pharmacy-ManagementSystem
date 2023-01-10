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

<table border='1'>
  <thead class="thead-dark">
    <tr>
      <th scope="col">Medicine ID</th>
      <th scope="col">Name</th>
      <th scope="col">Cost</th>
    </tr>
  </thead>
  <tbody>

<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);
statement=connection.createStatement();
String sql ="SELECT * FROM medicine";

resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>

    <tr>
      <td><%=resultSet.getString("medicineid") %></td>
      <td><%=resultSet.getString("name") %></td>
      <td><%=resultSet.getString("cost") %></td>
    </tr>
    <% 
      }
    } catch (Exception e) {
      e.printStackTrace();
    }
    %>
  </tbody>
</table>