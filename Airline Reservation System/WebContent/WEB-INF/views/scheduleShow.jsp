
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



  
<table border = "1" cell-padding =7>
  <tr>
  		
  		
          <th>schedule id</th>
            <th>arrival time</th>
              <th>departure time</th>
            <th>flight date</th>
            <th>flight_number</th>
            <th>economic fare</th>
            <th>business fare</th>
         	<th>book ticket</th>
         	
        </tr>
     
<c:forEach  var="s" items="${schedule}">


    
<tr>
       <form method="post" action="book" >
      <input type="hidden" name="schedule_id" value=${s.schedule_id}> 
        
		<input type="hidden" name="economic_fare" value="${s.flight.economic_fare}">
		<input type="hidden" name="business_fare" value="${s.flight.business_fare}">
       
        <td> ${s.schedule_id}<br></td>
        <td> ${s.arrival_time}<br></td>
           <td> ${s.departure_time}<br></td>
              <td> ${s.flight_date}<br></td>
              <td>${s.flight.flight_number}</td>
               <td>${s.flight.economic_fare}</td>
                <td>${s.flight.business_fare}</td>
              <td><input type="submit" value="Book this Flight"></a> 
              
        </td>
        </form>
     </tr>

   <tr>
   
   	
   </tr>
    </c:forEach>
     </table>

   
</body>
</html>