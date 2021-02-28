<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="Model.Login"%>
<%@ page import="Model.Produit"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Produit</title>
</head>
<style>

form {border: 3px solid #f1f1f1;}

input[type=text], input[type=password], input[type=number], input[type=hidden]{
  width: 100%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  box-sizing: border-box;
}


button {
  background-color: #4CAF50;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  cursor: pointer;
  width: 100%;
}

button:hover {
  opacity: 0.8;
}

.cancelbtn {
  width: auto;
  padding: 10px 18px;
  background-color: #f44336;
}

.imgcontainer {
  text-align: center;
  margin: 24px 0 12px 0;
}


.container {
  padding: 16px;
}

span.psw {
  float: right;
  padding-top: 16px;
}
body {
			font-family: Arial, Helvetica, sans-serif;
 			height: 100% ;
 			background-repeat: no-repeat ;
 			background-position: center;  
 			background-size : cover ;
			}
table{
			
			border-collapse: collapse;
			min-width: 400px ;
			width: auto ; 
			color: #070708;
			font-family: monospace;
			font-size: 25px ;
			text-align: left;
			box-shadow: 0 5px 50px rgba(0,0,0,0.15) ;
			cursor: pointer;
			margin: 100px auto ;
			border: 2px solid midnightblue ;

				}
th {
			background-color:#A4A4A4;
			color: white ; 
			text-align: left;
		}
th , td {
			padding: 15px 20px ;
		}
tbody ,tr ,td, th {
			border: 1px solid #ddd; 
		}
tr:nth-child(even) {background-color: #f2f2f2}
}

/* Change styles for span and cancel button on extra small screens */
@media screen and (max-width: 300px) {
  span.psw {
     display: block;
     float: none;
  }
  .cancelbtn {
     width: 100%;
  }

</style>
<body >

<div > 
      <h2>Gestion des produits</h2>
    <table >
                <thead>
                    <tr>
                        <th>Produit</th>
                        <th>Prix</th>
                        <th>Fournisseur</th>
                        <th>Actions</th>                       
                    </tr>
                </thead>
                
            </table>  
</div>                   
<div>                       
    <form action="AddProduit" method="GET">
      <h4 >Ajouter un produit</h4>
      <div> 
       <label>Produit</label>
       <input type="text"  name="produit" required>    
       </div>
       <div> 
       <label>Prix</label>
       <input type="number"  name="prix" required>   
      </div>
      <div> 
       <label>Fournisseur</label>
       <input type="text" name="fournisseur" required>   
       </div> 
      <input type="submit" value="Add">
    </form>
 </div>
</body>