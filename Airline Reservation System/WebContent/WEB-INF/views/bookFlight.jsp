<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

  
<table border = "1" cell-padding =5>
  <tr>
  		
  		
          <th>schedule id</th>
            <th>arrival time</th>
              <th>departure time</th>
            <th>flight date</th>
         	<th>book ticket</th>
        </tr>


 <td> ${tickets.schedule_id}<br></td>
        <td> ${tickets.arrival_time}<br></td>
           <td> ${tickets.departure_time}<br></td>
              <td> ${tickets.flight_date}<br></td>
             



<form>
<h1>Book your flight</h1>


Username : <input type="text" name="username" >
<br><br>

Seat Class : <input type="text" name="seat_class" >
<br><br>
No. of Passengers : <input type="text" name="no_of_passengers">


</form>


</body>
</html>