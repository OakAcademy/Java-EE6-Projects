<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Ajax Example</h1>

<form action="<%= request.getContextPath()%>/AjaxAction" method="get" id="SomeFormId">
<div>
 

<label for="name">Name:</label><br>

<input type="text" id="name" name="name" ><br><br>
</div>
<div>
 
<label for="surname">Surname:</label><br>
<input type="text" id="surname" name="surname"  ><br><br>

</div>
<div>
 
<label for="job">Job:</label><br>
<input type="text" id="job" name="job"  ><br><br>
</div>
<div>

 
<label for="age">Age:</label><br>
<input type="text" id="age" name="age"  ><br><br>
</div>
<input type="submit" name="submit" value="Save"><br><br> 
<div id="SomeDivId"></div>
</form>

<script type="text/javascript" src="jquery-3.6.0.js"></script>
<script type="text/javascript">

var form=$("#SomeFormId");
form.submit(function(){
	$.ajax({
		type: form.attr('method'),
		url: form.attr('action'),
		data: form.serialize(),
		success: function(data){
			var result=data;
			document.getElementById("SomeDivId").innerHTML=result;
			
		}
	});
	return false;
});

</script>

</body>
</html>