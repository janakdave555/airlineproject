<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">


</head>
<body>
<h1>ADD SCHEDULE</h1>


<form method="Post" action="addSchedule">


Flight ID:<input type="text" name="flight_id" value="1">
<br><br>

Flight Date:<input type="text" name="flight_date" >
<br><br>

Departure Time :<input type="text" name="departure_time" value="1">

<br><br>
Arrival Time :<input type="text" name="arrival_time" value="1">

<br><br>
Duration :<input type="text" name="duration" value="1">


<br><br>

<input type="submit" value="Add">
</form>
</body>
</html>