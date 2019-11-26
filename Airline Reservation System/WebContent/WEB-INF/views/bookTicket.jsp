<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script type="text/javascript">

function multiply()
{
        noOfpass= document.getElementById("numberSeats").value;
        num1 = document.getElementById("economyfare").value;
        num2 = document.getElementById("businessfare").value;
		seat_class=document.getElementById("seatclass").value;
		
        //document.getElementById("result").innerHTML = num1 * num2;
          var result = document.getElementById("result");
       if(seat_class=='business')
           {
        	result.value=num2*noOfpass;
            
           }
       else if(seat_class=='economy')
            {
    	   result.value=num1*noOfpass;
           }
       else
           {
			alert("Please choose seat class");
           }
      
        
}
</script>
</head>
<body>
<h1>BOOK TICKET</h1>


<form  action="bookSuccess" method="post">

<input type="hidden" name="schedule_id" value=${scheduleId}>



Username : <input type="text" name="username" >
<br><br>

Seat Class : 

<select id="seatclass">
  <option value="economy">economy</option>
  <option value="business">business</option>
 
</select>


<br><br>
No. of Passengers : <input type="number" name="no_of_passengers" id="numberSeats">
<br><br>
Economic Fare: <input type="text" value="${economic_fare}" id="economyfare" readonly="readonly" >
<br><br>
Business Fare : <input type="text" value="${business_fare}" id="businessfare" readonly="readonly" >
<br><br>

Check Total fare: <input type="button" onClick="multiply()" value="Multiply"/>

Total fare: <input type="text" name="result" id="result" >

<br><br>
<input type="submit" value="book ticket">

</form>






</body>
</html>