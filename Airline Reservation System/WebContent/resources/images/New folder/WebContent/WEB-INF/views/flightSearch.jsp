<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<style>
body {font-family: Arial, Helvetica, sans-serif;}

/* Full-width input fields */
input[type=text], input[type=password],input[type=date]{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}


/* Set a style for all buttons */
button {
  background-color: rgb(76, 160, 175);
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
  align:right; 
}

button:hover {
  opacity: 0.8;
}


.container {
  padding: 16px;
}




/* Add a blue text color to links */
a {
  color: dodgerblue;
}

/* Set a grey background color and center the text of the "sign in" section */
.signin {
  background-color: #f1f1f1;
  text-align: center;
}

article {
  float: left;
  padding: 20px;
  width: 40%;
  background-color: #f1f1f1;
}



</style>
</head>
<body>



<article>
<div class="container">
  <div>
    <center><h1>AE203 AIRLINES</h1></center>
  </div>
    <style>
        body {
          background-image: url('air2.jpg');
          background-repeat: no-repeat;
          background-attachment: fixed;
          background-size: 100% 100%;
        }
        </style>
  <form action="flightSearch" method="post">
  <div class="row">
    <div class="col-25">
      <label for="From"><b>From</b></label>
    </div>
    <div >
      <input type="text" id="From" name="source" placeholder="From" style="align:left;width:400px">
    </div>
  </div>
  <div>
    <div class="col-25">
      <label for="To"><b>To</b></label>
    </div>
    <div >
      <input type="text" id="To" name="destination" placeholder="To" style="align:left;width:400px">
    </div>
  </div>
  <div >
    <div >
      <label for="to"><b>Date</b></label>
    </div>
    <div >
      <input type="date" id="Date" name="date" placeholder="Date" style="align:left;width:400px">
    </div>
  </div>
  <br>
  <div >
    <div>
      <label for="to"><b>Return Date</b></label>
    </div>
    <div>
      <input type="date" id="ReturnDate" name="returndate" placeholder="Return date" style="align:left;width:400px">
    </div>
  </div>
  
  <br>
  <br>
  
  
  <div class="row">
    <div>
      <label for="passengers"><b>Passengers</b></label>
      <br>
      <br>
    </div>

    <div>
        <label for="adults"><b>Adults</b>&nbsp&nbsp&nbsp&nbsp&nbsp</label>
      
      <select id="adults" name="adults">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
        <option value="5">5</option>
        <option value="6">6</option>
        <option value="7">7</option>
        <option value="8">8</option>
        <option value="9">9</option>
      
      </select>
    </div>
<br>
<br>
<p align="right">
    <div >
        <label for="children"><b>Children</b>&nbsp&nbsp</label>
     
      <select id="children" name="children">
        <option value="1">1</option>
        <option value="2">2</option>
        <option value="3">3</option>
        <option value="4">4</option>
       
      </select>
    </div>
    </p>
<br>
<br>
    <div>
        <label for="Infants"><b>Infants</b>&nbsp&nbsp&nbsp&nbsp</label>
    
      <select id="Infants" name="Infants">
        <option value="1">1</option>
        <option value="2">2</option>
       
      </select>
    </div>
  </div>
  <br>
  <br>
  <div style="align:left;width:100px">
  <center>
    <button type="submit">Submit</button>
  </center>
  </div>
  </form>
</div>

</div>

</article>

</body>
</html>
