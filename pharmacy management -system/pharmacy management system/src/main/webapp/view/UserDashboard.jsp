<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
  <style type="text/css">
  <%@ include file="/css/userbill.css"%>
  </style>
    

</head>
<body>
    

<div class="wrapper"></div>
<div class="popup">
  <a href="#" id="pclose" class="pclose"><i class="fas fa-times fa-2x"></i></a>
  <h3>Welcome user</h3>
  
  
</div>

<div class="container">
  
  <div class="left">
    <div class="img"></div>
  </div>
  
  <div class="right">
    <div class="form">
      <div class="avatar-img"></div>
      <h2>Welcome user</h2>
      <form action="<%=request.getContextPath()%>/GenerateBillController" method="post">
      
       <input class="icon" type="text" name="Customer" placeholder="Name"> 
      <input type="date" placeholder="date" name="date">

       <input class="icon" type="number" name="qty" placeholder="Quantity"> 
       <input class="icon" type="text" name="medicine"placeholder="Medicine Name"> 
       <input class="icon" type="number" name="totalprice" placeholder="Price"> 

      <p><a href="#">Add more? </a></p>
       <button class="form-button" id="popen">Generate Bill</button>
       <input type="file"
       id="upload" name="Upload"
       accept="application/pdf,application/vnd.ms-excel">
       <button class="form-button" id="popen">Upload Prescription</button>
       </form>
       
    </div>
  </div>
</div>




<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.7.2/css/all.css" integrity="sha384-fnmOCqbTlWIlj8LyTjo7mOUStjsKC4pOpQbqyi7RrhN7udi9RwhKkMHpvLbHG9Sr" crossorigin="anonymous">
</body>
</html>