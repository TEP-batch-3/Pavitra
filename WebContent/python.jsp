<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="stylePython.css">
<meta charset="ISO-8859-1">
<title>Python</title>

</head>
<body>

<div class="grid-container">
	<div class="grid-item"><button class="myButton" id="btn1">Entity</button></div>
	<div class="grid-item"><button class="myButton" id="btn2">Concepts</button></div>
	<div class="grid-item"><button class="myButton" id="btn3">Operations</button></div><br><br>
</div>
<table class="grid-container" >
<tr class="grid-container" >
	
		<td class="grid-item"><label > Private Testcases : </label></td>
		<td class="grid-item"><input class="grid-item"></td>
	
</tr>
<tr class="grid-container">
	
		<td class="grid-item"><label > Public Testcases  : </label></td>
		<td class="grid-item"><input class="grid-item" ></td>
	
</tr>
<tr class="grid-container">
	
		<td  class="grid-item"><label> No Of Questions   : </label></td>
		<td class="grid-item" ><input class="grid-item"></td>
	
</tr>
<tr class="grid-container">
	
		<td class="grid-item"><label for="qo" >Question output : </label></td>
		<td  class="grid-item"><select name="qo" id="" class="grid-item">
  			<option value="volvo">Volvo</option>
  		</select></td>
	
</tr>
<tr class="grid-container">
	
		<td class="grid-item"><label for="qp">Question pattern : </label></td>
		<td  class="grid-item"><select name="qp" id="" class="grid-item">
  			<option value="volvo">Volvo</option>
		</select></td>
	
</tr>
</table>
<div class="grid-container">
<div class="grid-item"><input tpye="submit" value="SUBMIT" class=" myButton" style="text-float:center;">
</div>
</div>
</div>
</body>
</html>