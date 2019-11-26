<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
    <head>Admin
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

#b1{
    position: absolute;
    top: 20%;
    left: 35%;
    right: 35%;
}

#b2{
    position: absolute;
    top: 30%;
    left: 35%;
    right:35%;
}

#b3{
    position: absolute;
    top: 40%;
    left: 35%;
    right:35%;
}
button:hover {
  opacity: 0.8;
}

</style>


    </head>
        <body>

                <form method="POST" action="/AirlineReservationSystem/addPage" >
                    <button type="Add" id="b1">ADD</button>
                </form>

                <form method="POST" action="deleteModule">
                        <button type="Delete" id="b2" >DELETE</button>
                    </form>

                    <form method="POST" action="adminmodule2.html">
                            <button type="View" id="b3">VIEW</button>
                        </form>

        </body>
   
</html>