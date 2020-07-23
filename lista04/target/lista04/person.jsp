<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>7
<%@ page import="java.model.Person" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Pessoa</title>
</head>
<body>
    <% 
        String firstName, lastName, email, phone, birthday;

        Person contato = new Person();
        contato.setFirtName(request.getParameter("first_name"));
    %>
    <main>
        <h1>Pessoa</h1>
        <p>Nome: <%= contato.getFirtName(); %></p>
    </main>
</body>
</html>