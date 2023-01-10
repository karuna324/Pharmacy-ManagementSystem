<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

  <!-- include Bootstrap CSS -->
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
<input type="hidden" id="status" value="<%=request.getAttribute("status") %>"/>
  <div class="container mt-5">
    <div class="row justify-content-center">
      <div class="col-6">
        <div class="card">
          <div class="card-header bg-primary text-white text-center py-2">
            <h5>User Login</h5>
          </div>
          <div class="card-body">
            <form action="<%=request.getContextPath()%>/UserLoginController" method="post">
              <div class="form-group">
                <label for="username"> Username </label>
                <input type="text" class="form-control" name="username" id="username" required>
              </div>
              <div class="form-group">
                <label for="password">Password</label>
                <input type="password" class="form-control" name="password" id="password" required>
              </div>
              <button type="submit" class="btn btn-primary btn-block">login</button>
              <br>
              
              <button type="submit" value="Register" class="btn btn-primary btn-block" onclick="window.location.href='<%= request.getContextPath() %>/view/UserRegister.jsp'"/>Register</button>
            </form>
          </div>
        </div>
      </div>
    </div>
  </div>
</body>
</html>
