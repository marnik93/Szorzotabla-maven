<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h4>Adja meg a szorzótábla méretét: (10 - 10x10, 12 - 12x12)</h4>
	<input type="text" id="widthheight">
	<button onclick="navigate()">Szorzótábla készítés</button>
	<script>
		function navigate(){
			var value = document.getElementById('widthheight').value;
			window.location.href = "szorzotablaServlet?widthheight=" + value;
			
		}
	</script>
</body>
</html>