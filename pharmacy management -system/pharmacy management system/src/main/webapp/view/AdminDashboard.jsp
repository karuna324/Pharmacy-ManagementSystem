<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
    
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Adminstyle.css" />
    
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

    <div class="image">
        <img src="image/home-img.svg" alt="">
    </div>

    <div class="content">
        <h3>Welcome Admin,</h3>
        
        <a href="#" class="btn"> Scroll down <span class="fas fa-chevron-right"></span> </a>
    </div>

</section>

<!-- home section ends -->

<!-- icons section starts  -->

<section class="icons-container">
	
	
    <div class="icons">
        <i class="fas fa-user-md"></i>
        <h3>ADD</h3>
        <p>Add Medicine</p>
      <a href="<%=request.getContextPath()%>/view/AddMedicine.jsp"><button>Add</button></a>
      
    </div>
     

    <div class="icons">
        <i class="fas fa-users"></i>
        <h3>Remove</h3>
        <p>Medicine</p>
<a href="<%=request.getContextPath()%>/view/RemoveMedicine.jsp"><button>Remove</button></a>
    </div>
   
    
	
    
    <div class="icons">
        <i class="fas fa-procedures"></i>
        <h3>View</h3>
        <p>All medicines</p>
        <a href="<%=request.getContextPath()%>/view/DisplayMedicine.jsp"><button>View</button></a>

    </div>
   
    

    <div class="icons">
        <i class="fas fa-hospital"></i>
        <h3>Upload</h3>
        <p>Prescription</p>
        <button>Upload</button>
    </div>

</section>
</html>
