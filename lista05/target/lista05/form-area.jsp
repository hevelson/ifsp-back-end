<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<%@ page import="calculate.AreaCalculator" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Calcular area</title>
</head>
<body>
    <%
        AreaCalculator calculator = new AreaCalculator();

        String areaType;
        areaType = request.getParameter("geometric_form");
    %>
    
</body>
</html>