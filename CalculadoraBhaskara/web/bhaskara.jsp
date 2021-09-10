<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String a, b ,c;
            double delta;
            a = request.getParameter("valorA");
            b = request.getParameter("valorB");
            c = request.getParameter("valorC");
        %>
        <jsp:useBean id="bhaskara" class="br.uninove.Bhaskara" scope="page"/>
        <jsp:setProperty name="bhaskara" property="a" value="<%=a%>" />
        <jsp:setProperty name="bhaskara" property="b" value="<%=b%>" />
        <jsp:setProperty name="bhaskara" property="c" value="<%=c%>" />
        <h1>Calculadora de Bhaskara</h1>
        <hr>
        <p>Dado: <%=a%>x² + <%=b%>x + <%=c%> = 0, temos que:</p>
        <%
            delta = bhaskara.calculaDelta();
        %>
        <p>Delta: <%=(delta < 0)? "Delta é negativo": delta%></p>
        <p>Raiz+ <%=(delta < 0)? "Não há raiz real": bhaskara.raizPositiva(delta)%></p>
        <p>Raiz- <%=(delta < 0)? "Não há raiz real": bhaskara.raizNegativa(delta)%></p>
        
        <a href="index.html">inicio</a>
        
    </body>
</html>
