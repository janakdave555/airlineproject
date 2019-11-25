<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
</head>
<body>
<caption>
<h2>List of all Aircraft Types</h2></caption>
<table border = "1" cellpadding = "5">
	
        <tr>
            <th>aircraft_typeid</th>
            <th>aircraft_name</th>
            <th>aircraft_company</th>
            <th>aircraft_capacity</th>
            <th>aircraft_business_seats</th>
             <th>aircraft_economy_seats</th>
        </tr>
      <c:forEach items="${list}" var="AircraftType">
<tr>
          <td> ${AircraftType.aircraft_typeid}<br></td>
          <td>${AircraftType.aircraft_name}<br></td>
         <td>${AircraftType.aircraft_company}<br></td>
         <td>${AircraftType.aircraft_capacity}<br></td>
         <td>${AircraftType.aircraft_business_seats}<br></td>
     	 <td>${AircraftType.aircraft_economy_seats}<br></td>
     </tr>
</c:forEach>
    </table>
   
</body>
</html>