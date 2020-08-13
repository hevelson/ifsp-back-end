<%@ page import="java.sql.SQLException" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dao.ClientDao" %>
<%@ page import="model.Pessoa" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Cadastrar cliente</title>
</head>
<body>
    <h1>Listagem de clientes</h1>
    <%
        out.println("Consulta ao banco");
        List<Client> listClients = new ArrayList<Pessoa>();

        try {
            ClientDao dao = new ClientDao();
            listClients = dao.list();
            out.println("ok");
        } catch (SQLException e) {
            out.println("<p>Erro " + e.getMessage() + "</p>");   
        }
    %>
    <table>
        <tbody>
            <% for (Pessoa client : listClients) { %>
                <tr>
                    <td><%= client.getIdClient() %></td>
                    <td><%= client.getName() %></td>
                    <td><%= client.getAddress() %></td>
                    <td><%= client.getPhone() %></td>
                    <td><%= client.getCEP() %></td>
                </tr>
            <% } %>
        </tbody>
    </table>
</body>
</html>