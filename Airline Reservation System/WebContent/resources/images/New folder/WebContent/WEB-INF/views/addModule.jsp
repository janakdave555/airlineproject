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
             
                <form method="POST" action="/AirlineReservationSystem/add1" >
                    <button type="AddAircraft">Add Aircraft</button>
                </form>

                <form method="POST" action="/AirlineReservationSystem/add2">
                        <button type="AddAircraftType" >Add AircraftType</button>
                    </form>

                    <form method="POST" action="/AirlineReservationSystem/add3">
                            <button type="AddAirport" >Add Airport</button>
                        </form>

                        <form method="POST" action="/AirlineReservationSystem/add4">
                                <button type="AddFlight" >Add Flight</button>
                            </form>

                            <form method="POST" action="/AirlineReservationSystem/add5">
                                    <button type="Schedule" >Add Schedule</button>
                                </form>
            
                        <form method="POST" action="/AirlineReservationSystem/add6">
                            <button type="Sector">Add Sector</button>


                            

                      
        </body>
   
</html>