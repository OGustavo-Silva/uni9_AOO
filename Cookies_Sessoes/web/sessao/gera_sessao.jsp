<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sessões</title>
    </head>
    <body>
        <h1>Trabalhando com a "Sessão"</h1>
        <hr>
        <br>
        <%
            request.setCharacterEncoding("UTF-8");
            String nome = (request.getParameter("nome") != null)?
                    request.getParameter("nome"): "";
            
            String sobrenome = (request.getParameter("sobrenome") != null)?
                    request.getParameter("sobrenome"): "";
            
            session.setAttribute("nomeUsuario", nome);
            session.setAttribute("sobrenome", sobrenome);
        %>
        <h3>
            Olá <%= nome + " " + sobrenome %>! Seja bem-vindo(a) :D
        </h3>
        <h4>Seus dados foram persistidos na Sessão</h4>
        <a href="./">Voltar para a página inicial</a>
    </body>
</html>
