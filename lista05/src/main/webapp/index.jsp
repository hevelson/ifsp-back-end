<%@ page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista 05</title>
</head>
<body>
    <section>
        <form method="POST" action="/lista05/form-area.jsp">
            <label for="geometric_form">Selecine a figura para calcular a área</label>
            <select name="geometric_form" id="geometric_form">
                <option value="triangle">triângulo</option>
                <option value="circle">círculo</option>
                <option value="square">quadrado</option>
            </select>
            <button>Selecionar</button>
        </form>
    </section>
</body>
</html>
