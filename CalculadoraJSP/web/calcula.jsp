<%@page import="br.uninove.Matematica"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculadora</title>
    </head>
    <body>
        <h1>Resultado</h1>
        <hr>
        
        <%
            String a, b, operacao;
            float vA, vB, resultado;
            Matematica mat;
            
            a = request.getParameter("valor1");
            b = request.getParameter("valor2");
            operacao = request.getParameter("operacao");
            
            vA = Float.parseFloat(a);
            vB = Float.parseFloat(b);
            
            mat = new Matematica(vA, vB);
            
            if(operacao.equalsIgnoreCase("somar")) resultado = mat.somar();
            else if(operacao.equalsIgnoreCase("subtrair")) resultado = mat.subtrair();
            else if(operacao.equalsIgnoreCase("multiplicar")) resultado = mat.multiplicar();
            else resultado = mat.subtrair();

        %>
        <p><strong>Valor 1: </strong><%=a%></p>
        <p><strong>Valor 2: </strong><%=b%></p>
        <p><strong>Operação: </strong><%=operacao%></p>
        <p><strong>Resultado: </strong><%=resultado%></p>
        <br>
        <a href="/CalculadoraJSP">Calcular novamente</a>
    </body>
</html>
