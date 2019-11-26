<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<meta charset="ISO-8859-1">
<head>

<style>

input[type=text], input[type=password] {
  
  padding: 15px;
  margin: 5px 0 22px 0;
  display: inline-block;
  border: none;
  background: #f1f1f1;
}

input[type=text]:focus ,input[type=number]:focus {
  background-color: #ddd;
  outline: none;
}
button {
  background-color: rgb(76, 160, 175);
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;

  align:right; 
}

button:hover {
  opacity: 0.8;
}

</style>
</head>
<body>



<form method="Post" action="addAircraftType">


Aircraft Name:<input type="text" name="aircraft_name" value="1">
<br><br>

Aircraft Company :<input type="text" name="aircraft_company" value="1">

<br><br>
Aircraft capacity:<input type="number" name="aircraft_capacity" value="1">

<br><br>
Aircraft economy seats:<input type="number" name="aircraft_economy_seats" value="1">


<br><br>
Aircraft business seats:<input type="number" name="aircraft_business_seats" value="1">

<br><br>
<button type="submit" value="Add">Add</button>
</form>
</body>
</html>