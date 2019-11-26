<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>ADMIN
<style>
button {
  background-color: rgb(76, 160, 175);
  color: white;
  padding: 10px 10px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 30%;
 
}

</style>


    </head>
        <body>
             
                <form method="POST" action="/AirlineReservationSystem/delete1" >
                    <button type="DeleteAircraft">Delete Aircraft</button>
                </form>

                <form method="POST" action="/AirlineReservationSystem/delete2">
                        <button type="DeleteAircraftType" >Delete AircraftType</button>
                    </form>

                    <form method="POST" action="/AirlineReservationSystem/delete3">
                            <button type="DeleteAirport" >Delete Airport</button>
                        </form>

                        <form method="POST" action="/AirlineReservationSystem/delete4">
                                <button type="DeleteFlight" >Delete Flight</button>
                            </form>

                            <form method="POST" action="/AirlineReservationSystem/delete5">
                                    <button type="DeleteSchedule" >Delete Schedule</button>
                                </form>
            
                        <form method="POST" action="/AirlineReservationSystem/delete6">
                            <button type="DeleteSector">Delete Sector</button>


                            

                      
        </body>
   
</html>