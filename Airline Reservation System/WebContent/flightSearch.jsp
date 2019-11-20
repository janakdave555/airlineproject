<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>FLIGHT SEARCH</title>

</head>
<body>
<input type="submit" value="Log In">
<input type="submit" value="Register">
<input type="submit" value="Admin">
<center>
<h1>FLIGHT SEARCH</h1>

<form method="post" action="http://localhost:9090/UserMVC/AddUserController">
From:<input type="text" name="from">
<br><br>
To:<input type="text" name="to">
<br><br>
Departure:<input type="date" name="departure">

<br><br>
Return Date:<input type="date" name="return_ date">

<br><br>
Passengers:
 <select name="passengers">
    <option value="1">1</option>
    <option value="2">2</option>
    <option value="3">3</option>
    <option value="4">4</option>
    <option value="5">5</option>
  </select>
  <br><br>
<input type="submit" value="Search">
</form>
</center>

</body>
</html>