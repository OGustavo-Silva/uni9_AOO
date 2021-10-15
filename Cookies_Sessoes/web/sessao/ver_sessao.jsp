<%-- 
    Document   : ver_sessao
    Created on : 7 de out. de 2021, 21:06:00
    Author     : gusta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sessões</title>
    </head>
    <body>
        <%
            String nome = "";
            String sobrenome = "";
            
            if(session.getAttribute("nomeUsuario")!= null){
                nome = (String) session.getAttribute("nomeUsuario");
                sobrenome = (String) session.getAttribute("sobrenome");
            }
        %>
        <h1>Trabalhando com Sessões</h1>
        <hr>
        <br>
        <h3>Guardado na Sessão:</h3>
        <ul>
            <li>Nome: <%=nome%></li>
            <li>Sobrenome: <%=sobrenome%></li>
        </ul>
        <a href="./">Voltar para a pagina inicial</a>
    </body>
</html>
