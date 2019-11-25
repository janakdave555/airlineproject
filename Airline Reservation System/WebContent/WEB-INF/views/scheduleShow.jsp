
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core"  prefix = "c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<caption>
<h2>Schedule of Flights</h2></caption>

<form action="scheduleShow" >

  
<table border = "1" cell-padding =5>
  <tr>
  		
  		
          <th>schedule id</th>
            <th>arrival time</th>
              <th>departure time</th>
            <th>flight date</th>
            <th>flight_number</th>
         	<th>book ticket</th>
        </tr>
     
<c:forEach  var="s" items="${schedule}">


    
<tr>
       
      
        <td> ${s.schedule_id}<br></td>
        <td> ${s.arrival_time}<br></td>
           <td> ${s.departure_time}<br></td>
              <td> ${s.flight_date}<br></td>
              <td>${s.flight_number}</td>
              <td><a href="bookTicket?schedule_id=${s.schedule_id}">Book this Flight</a> 
        
     </tr>

   <tr>
   
   	
   </tr>
    </c:forEach>
     </table>
   </form>
   
</body>
</html>