<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h1>ADD FLIGHT</h1>

<form method="post" action="http://localhost:9090/UserMVC/AddUserController">
Flight Number:<input type="text" name="flight_number">
<br><br>
From:<input type="text" name="from">
<br><br>
To:<input type="text" name="to">
<br><br>
Departure Time:<input type="time" name="departure">

<br><br>
Arrival Time:<input type="time" name="arrival">

<br><br>
Duration:<input type="time" name="duration">


<br><br>

<input type="submit" value="Add">
<br><br>
</body>
</html>


