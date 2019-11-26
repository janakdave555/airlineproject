<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: black;
}

* {
  box-sizing: border-box;
}

/* Add padding to containers */
.container {
  padding: 16px;
  background-color: white;
}

/* Full-width input fields */
input[type=text], input[type=password] {
  width: 100%;
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus, input[type=password]:focus {
  background-color: #ddd;
  outline: none;
}

/* Overwrite default styles of hr */
hr {
  border: 1px solid #f1f1f1;
  margin-bottom: 25px;
}

/* Set a style for the submit button */
.registerbtn {
  background-color: #4CAF50;
  color: white;
  padding: 16px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  opacity: 0.9;
}

.registerbtn:hover {
  opacity: 1;
}

/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}
</style>


 <script> 
          
            // Function to check Whether both passwords 
            // is same or not. 
            function checkPassword(form) { 
            	password = form.password.value; 
            	confirm_password = form.confirm_password.value; 
  
                // If password not entered 
                if (password == '') 
                    alert ("Please enter Password"); 
                      
                // If confirm password not entered 
                else if (confirm_password == '') 
                    alert ("Please enter confirm password"); 
                      
                // If Not same return False.     
                else if (password != confirm_password) { 
                    alert ("\nPassword did not match: Please try again...");
                    return false; 
                } 
  
                // If same return True. 
                else{ 
                    alert("Password Match: Welcome!");
                    return null;
                } 
            } 
        </script> 

</head>
<body>

<form action="addUserRegister" method="Post" onSubmit = "return checkPassword(this)">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="email"><b>Email</b></label>
    <input type="text" placeholder="Enter Email" name="email" required>

    <label for="title"><b>Title</b></label>
    <input type="text" placeholder="title" name="title" required>

<label for="First Name"><b>First Name</b></label>
    <input type="text" placeholder="Enter First Name" name="first_name" required>

<label for="Last Name"><b>Last Name</b></label>
    <input type="text" placeholder="Enter Last Name" name="last_name" required>
   
    <label for="gender"><b>Gender</b></label>
    <input type="text" placeholder="Gender" name="gender" required>
    

<label for="DOB"><b>Date Of Birth</b></label>
    <input type="text" placeholder="Enter Date Of Birth" name="date_of_birth" required>

 

   
    <label for="status"><b>Status</b></label>
    <input type="text" placeholder="Status" name="status" required>
    
    <label for="phone_no"><b>Phone Number</b></label>
    <input type="text" placeholder="phone_no" name="phone_number" required>
     
   <label for="psw"><b>Password</b></label>
    <input type="password" placeholder="Enter Password" name="password" required>
    
    <label for="confirm-repeat"><b>Confirm Password</b></label>
    <input type="password" placeholder="Confirm Password" name="confirm_password" required>
    <hr>
    <p>By creating an account you agree to our <a href="#">Terms & Privacy</a>.</p>

    <button type="submit" class="registerbtn">Register</button>
  </div>
  
  <div class="container signin">
    <p>Already have an account? <a href="#">Sign in</a>.</p>
  </div>
</form>

</body>
</html>
    