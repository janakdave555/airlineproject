<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* Full-width input fields */
input[type=text], input[type=password],input[type=date]{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}


/* Set a style for all buttons */
button {
  background-color: rgb(76, 160, 175);
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  align:right; 
}

button:hover {
  opacity: 0.8;
}

/* Extra styles for the cancel button */
.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

/* Center the image and position the close button */
.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
  position: relative;
}

img.avatar {
  width: 20%;
  border-radius: 30%;
}

.container {
  
  
  padding: 40px;
}

span.psw {
  float: right;
  padding-top: 16px;
}

/* The Modal (background) */
.modal {
  display: none; /* Hidden by default */
  position: fixed; /* Stay in place */
  z-index: 1; /* Sit on top */
  left: 0;
  top: 0;
  width: 100%; /* Full width */
  height: 100%; /* Full height */
  overflow: auto; /* Enable scroll if needed */
  background-color: rgb(0,0,0); /* Fallback color */
  background-color: rgba(0,0,0,0.4); /* Black w/ opacity */
  padding-top: 60px;
}

/* Modal Content/Box */
.modal-content {
  background-color: #fefefe;
  margin: 5% auto 15% auto; /* 5% from the top, 15% from the bottom and centered */
  border: 1px solid #888;
  width: 80%; /* Could be more or less, depending on screen size */
}

/* The Close Button (x) */
.close {
  position: absolute;
  right: 25px;
  top: 0;
  color: #000;
  font-size: 35px;
  font-weight: bold;
}

.close:hover,
.close:focus {
  color: red;
  cursor: pointer;
}

/* Add Zoom Animation */
.animate {
  -webkit-animation: animatezoom 0.6s;
  animation: animatezoom 0.6s
}

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

article {
  float: left;
  padding: 20px;
  width: 40%;
  background-color: #f1f1f1;
}

@-webkit-keyframes animatezoom {
  from {-webkit-transform: scale(0)} 
  to {-webkit-transform: scale(1)}
}
  
@keyframes animatezoom {
  from {transform: scale(0)} 
  to {transform: scale(1)}
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }
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
<div>
<p align="right">
<button onclick="document.getElementById('id01').style.display='block'" style="width:auto; right:0;">Login</button>
<button onclick="document.getElementById('id02').style.display='block'" style="width:auto;">Signup</button>
<button onclick="document.getElementById('id03').style.display='block'" style="width:auto;">Admin</button></p>
</div>


<div id="id01" class="modal">
  
  <form class="modal-content animate" action="/AirlineReservationSystem/userLogin" method="post">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id01').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="resources/images/loginIcon.png" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="uname"><b>Username</b></label>
      <input type="text" placeholder="Enter Username" name="email" required>

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="password" required>
        
      <button type="submit">Login</button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id01').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
  </form>
</div>

<div id="id02" class="modal">
  
  <form class="modal-content animate" action="/AirlineReservationSystem/addUserRegister" method="post"  onSubmit = "return checkPassword(this)">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id02').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="resources/images/Register_icon.png" alt="Avatar" class="avatar">
    </div>

    <div class="container">
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
    <input type="number" placeholder="phone_no" name="phone_number" required>
     
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
</div>

<div id="id03" class="modal">
  
  <form class="modal-content animate" action="/AirlineReservationSystem/adminLogin" method="post">
    <div class="imgcontainer">
      <span onclick="document.getElementById('id03').style.display='none'" class="close" title="Close Modal">&times;</span>
      <img src="resources/images/admin.png" alt="Avatar" class="avatar">
    </div>

    <div class="container">
      <label for="uname"><b>Admin ID</b></label>
      <input type="text" placeholder="Enter Admin ID" name="admin_name" required>

      <label for="psw"><b>Password</b></label>
      <input type="password" placeholder="Enter Password" name="admin_password" required>
        
      <button type="submit">Login</button>
      <label>
        <input type="checkbox" checked="checked" name="remember"> Remember me
      </label>
    </div>

    <div class="container" style="background-color:#f1f1f1">
      <button type="button" onclick="document.getElementById('id03').style.display='none'" class="cancelbtn">Cancel</button>
      <span class="psw">Forgot <a href="#">password?</a></span>
    </div>
  </form>
</div>
</div>

<script>
// Get the modal
var modal = document.getElementById('id01');

// When the user clicks anywhere outside of the modal, close it
window.onclick = function(event) {
    if (event.target == modal) {
        modal.style.display = "none";
    }
}
</script>

<article>
<div class="container">
  <div>
    <center><h1>AE203 AIRLINES</h1></center>
  </div>
    <style>
        body {
          background-image: url('resources/images/air2.jpg');
          background-repeat: no-repeat;
          background-attachment: fixed;
        
        }
        </style>
    
  <form action="flightSearch" method="post">
  <div class="row">
    <div class="col-25">
      <label for="From"><b>From</b></label>
    </div>
    <div >
      <input type="text" id="From" name="source" placeholder="From" style="align:left;width:400px">
    </div>
  </div>
  <div>
    <div class="col-25">
      <label for="To"><b>To</b></label>
    </div>
    <div >
      <input type="text" id="To" name="destination" placeholder="To" style="align:left;width:400px">
    </div>
  </div>
  <div >
    <div >
      <label for="to"><b>Date</b></label>
    </div>
    <div >
      <input type="date" id="Date" name="date" placeholder="Date" style="align:left;width:400px">
    </div>
  </div>
  <br>
  <div >
    <div>
      <label for="to"><b>Return Date</b></label>
    </div>
    <div>
      <input type="date" id="ReturnDate" name="returndate" placeholder="Return date" style="align:left;width:400px">
    </div>
  </div>
  
  <br>
  <br>
  
  
  <div class="row">
    <div>
      <label for="passengers"><b>Passengers</b></label>
      <br>
      <br>
    </div>

    <div>
        <label for="adults"><b>Adults</b>&nbsp&nbsp&nbsp&nbsp&nbsp</label>
      
      <select id="adults" name="adults">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        <option value="9">9</option>
      
      </select>
    </div>
<br>
<br>
<p align="right">
    <div >
        <label for="children"><b>Children</b>&nbsp&nbsp</label>
     
      <select id="children" name="children">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
       
      </select>
    </div>
    </p>
<br>
<br>
    <div>
        <label for="Infants"><b>Infants</b>&nbsp&nbsp&nbsp&nbsp</label>
    
      <select id="Infants" name="Infants">
        <option value="1">1</option>
        <option value="2">2</option>
       
      </select>
    </div>
  </div>
  <br>
  <br>
  <div style="align:left;width:100px">
  <center>
    <button type="submit">Submit</button>
  </center>
  </div>
  </form>
 
</div>

</div>

</article>

</body>
</html>
    