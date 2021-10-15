<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sessão</title>
    </head>
    <body>
        <h1>Trabalhando com a "Sessão"</h1>
        <hr>
        <br><br>
        <form method="post" action="gera_sessao.jsp">
            Informe seu nome: <input type="text" name="nome"/><br>
            <br>
            Informe seu sobrenome: <input type="text" name="sobrenome"/><br>
            <br>
            <input type="submit" value="Colocar dados na Sessão"/>
            
        </form>
    </body>
</html>
