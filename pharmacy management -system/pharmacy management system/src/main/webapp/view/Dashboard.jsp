
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Welcome</title>

    <!-- font awesome cdn link  -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css">

    <!-- custom css file link  -->
    
     <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Dashboard.css" />
    
    
</head>
<body>
    
<!-- header section starts  -->

<header class="header">

    <a href="#" class="logo"> <i class="fas fa-heartbeat"></i> medcare. </a>

    <nav class="navbar">
        <a href="#home">home</a>
        <a href="#services">services</a>
        <a href="#about">about</a>
        <a href="#doctors">doctors</a>
        <a href="#book">book</a>
        <a href="#review">review</a>
        <a href="#blogs">blogs</a>
    </nav>

    <div id="menu-btn" class="fas fa-bars"></div>

</header>

<!-- header section ends -->

<!-- home section starts  -->

<section class="home" id="home">

    

    <div class="content">
        <h3>Welcome to pharmacy management system</h3>
        
      
</section>

<!-- home section ends -->

<!-- icons section starts  -->

<section class="icons-container">
	
	
        
   
    <div class="icons">
        <i class="fas fa-users"></i>
        <h3>Log in as</h3>
        <form action="<%=request.getContextPath()%>/UserLoginController" method="post"> </form>

        <input class="button" type="submit" value="user"  onclick="window.location.href='<%= request.getContextPath() %>/view/UserLogin.jsp'"/>
        
        
        <form action="<%=request.getContextPath()%>/AdminLoginController" method="post"></form>
        <input  class="button" type="submit" value="admin" onclick="window.location.href='<%= request.getContextPath() %>/view/AdminLogin.jsp'"/>>
        <!-- <button onclick="window.location.href='RemoveMedicine.jsp';"> -->
      
    

    </div>
    
	

</section>
</html>
