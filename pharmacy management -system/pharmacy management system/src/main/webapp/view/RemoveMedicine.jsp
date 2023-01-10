<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Remove Medicine</title>
<!-- include Bootstrap CSS -->
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>
	<div class="container mt-5">
		<h1>Remove Medicine</h1>
		<form action="<%=request.getContextPath()%>/RemoveMedicineController" 
		method="post" class="form">
			<div class="form-group">
				<label for="mname">Name of Medicine</label>
				<input type="text" class="form-control" name="MName" id="mname" required>
			</div>
			

<button type="submit" id="removeMedicine" class="btn btn-primary">Remove</button>
<script>
  document.querySelector("#removeMedicine").addEventListener("click", function() {
    alert("Medicine removed successfully!");
  });
</script>

</form>
</div>

<!-- include Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.16.6/dist/umd/popper.min.js" integrity="sha384-7hpNU6oGp6hZU6/Y9bJpCeoD+wW8Jv+POIcZJh+LIAGJZ8dvF+nf5G5kbxhJy5M" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</html>
			
