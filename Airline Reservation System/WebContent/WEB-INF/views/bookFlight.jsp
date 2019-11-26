<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
             
<form>

<table border = "1" cell-padding =5>
  <tr>
  		
            <th>arrival time</th>
              <th>departure time</th>
            <th>flight date</th>
         	<th>book ticket</th>
        </tr>


 <tr>
        <td> ${tickets.arrival_time}<br></td>
           <td> ${tickets.departure_time}<br></td>
              <td> ${tickets.flight_date}<br></td>
                <td><a href="bookTicket?schedule_id=${s.schedule_id}">Book this Flight</a> 
              </tr>
              <br><br>
           
              
              </table>
                 </form>
              <form action="/booked" method="post">
<h1>Book your flight</h1>


Username : <input type="text" name="username" >
<br><br>

Seat Class : <input type="text" name="seat_class" >
<br><br>
No. of Passengers : <input type="text" name="no_of_passengers">
<br><br>
    <button type="submit">Submit</button>


</form>


</body>
</html>