<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
<!-- include Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-5">
		<h1>Admin Registration Form</h1>
		<form action="<%=request.getContextPath()%>/AdminRegisterController" 
		method="post" class="form">
			<div class="form-group">
				<label for="name">Name</label>
				<input type="text" class="form-control" name="txtName" id="name" required>
			</div>
			<div class="form-group">
				<label for="mobile">Mobile</label>
				<input type="text" class="form-control" name="mobile" id="mobile" required>
			</div>
			
			<div class="form-group">
	<label for="email">Email</label>
	<input type="email" class="form-control" name="email" id="email" required>
</div>
<div class="form-group">
	<label for="address">Address</label>
	<input type="text" class="form-control" name="address" id="address" required>
</div>
<div class="form-group">
	<label for="username">Username</label>
	<input type="text" class="form-control" name="username" id="username" required>
</div>
<div class="form-group">
	<label for="password">Password</label>
	<input type="password" class="form-control" name="password" id="password" required>
</div>
<button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>

<!-- include Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.16.6/dist/umd/popper.min.js" integrity="sha384-7hpNU6oGp6hZU6/Y9bJpCeoD+wW8Jv+POIcZJh+LIAGJZ8dvF+nf5G5kbxhJy5M" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>
			
