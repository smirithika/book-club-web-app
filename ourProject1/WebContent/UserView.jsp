<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>UserDetails</title>

<!-- this is for bootstrap arshad**************************************************************************************************-->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!--****************bootstrap   ends ***************************************************************************************** -->


</head>
<body>

<div class="container">
    <h1 class="well">Hi "his name here from full name"</h1>
	<div class="col-lg-12 well">
	<div class="row">
				<form>
					<div class="col-sm-12">
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>My Name</label>
								<input type="text" class="form-control">
							</div>
						</div>					
						<div class="form-group">
							<label>Permanent Address</label>
							<textarea " rows="3" class="form-control"></textarea>
						</div>	
						<div class="form-group">
							<label>Current Address</label>
							<textarea rows="3" class="form-control"></textarea>
						</div>	
						<div class="row">
							<div class="col-sm-6 form-group">
								<label>Mobile</label>
								<input type="text" class="form-control">
							</div>		
							<div class="col-sm-6 form-group">
								<label>HomeTP No</label>
								<input type="text"  class="form-control">
							</div>	
						</div>							
					<div class="form-group">
						<label>Email Address</label>
						<input type="email"  class="form-control">
					</div>
					<div>
					<label>Tick your Interest:</label>
					
		           <div class="checkbox checkbox-success">
                    <input id="AI" name="AI" type="checkbox">
                      <label for="checkbox3">
                            Artificial Interligence
                       </label>
                     </div>
                      <div class="checkbox checkbox-success">
                    <input id="checkbox3" type="checkbox">
                      <label for="checkbox3">
                            Image Processing
                       </label>
                     </div>
                      <div class="checkbox checkbox-success">
                    <input id="checkbox3" type="checkbox">
                      <label for="checkbox3">
                          Middle Ware
                       </label>
                     </div>
                      <div class="checkbox checkbox-success">
                    <input id="checkbox3" type="checkbox">
                      <label for="checkbox3">
                            Art
                       </label>
                     </div>
                      <div class="checkbox checkbox-success">
                    <input id="checkbox3" type="checkbox">
                      <label for="checkbox3">
                            Science Fiction
                       </label>
                     </div>
                      <div class="checkbox checkbox-success">
                    <input id="checkbox3" type="checkbox">
                      <label for="checkbox3">
                           Politics
                       </label>
                     </div>
                     <div class="checkbox checkbox-success">
                    <input id="checkbox3" type="checkbox">
                      <label for="checkbox3">
                            Relegion
                       </label>
                     </div>
            
					</div>
					<div>	
					<button type="button" style="margin-left: 30%;padding-right: 20%;padding-left: 20%" class="btn btn-danger">Update</button>					
					</div>
				</form> 
				</div>
	</div>
	</div>

</body>
</html>