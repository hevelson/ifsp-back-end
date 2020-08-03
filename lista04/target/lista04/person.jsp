<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>7
<%@page import="model.Person" %>
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
        contato.setFirtName(request.getParameter("last_name"));
        contato.setFirtName(request.getParameter("email"));
        contato.setFirtName(request.getParameter("phone"));
        contato.setFirtName(request.getParameter("birthday"));
    %>
    <main>
        <h1>Pessoa</h1>
        <p>Nome: <%= contato.getFirtName(); %></p>
    </main>
</body>
</html>