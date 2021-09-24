<%@page import="br.uninove.util.StrUtils"%>
<%@page import="br.uninove.http.Http"%>
<%@page import="br.uninove.clima.Clima"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    request.setCharacterEncoding("UTF-8");
    Clima clima = null;
    String cidade = "";
    if (request.getParameter("cidade") != null) {
        cidade = request.getParameter("cidade");
        clima = Http.DadosCLimaticos(cidade);
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-F3w7mX95PdgyTmZZMECAngseQB83DfGTowi0iMjiWaeVhAn4FJkqJByhZMI3AhiU" crossorigin="anonymous">
        <title>UniClima</title>
        <style>
            .card-clima {
                padding: 100px 0 0 0;
                width: 380px;
                margin: 0 auto;
            }
            .clima-title {
                font-size: 1.5em;
                font-style: bold;
            }
        </style>
        <link rel="shortcut icon" href="favicon.ico" />
    </head>
    <body>

        <nav class="navbar navbar-expand-lg navbar-dark bg-primary">
            <div class="container-fluid">
                <a class="navbar-brand" href="#">UniClima</a>
                <form class="d-flex" method="post">
                    <input type="search" class="form-control me-2" name="cidade" value="<%=cidade%>" placeholder="Digite a cidade">
                    <button class="btn btn-outline-warning" type="submit">Buscar</button>
                </form>
            </div>
        </nav>

        <% if (clima != null) {%>

        <div class="container">
            <div class="row">
                <div class="card-clima">
                    <div class="card">
                        <div class="card-body">
                            <div class="text-center">
                                <img src="http://openweathermap.org/img/wn/<%=clima.getWeather().get(0).getIcon()%>@2x.png">
                                <p class="clima-title">Cidade: <%=clima.getName() + ", " + clima.getSys().getCountry()%></p>
                            </div>
                            <hr>
                            <div>
                                <p><strong>Agora: </strong> <%= StrUtils.convertToTitleCaseIteratingChars(clima.getWeather().get(0).getDescription())%> </p>
                                <p><strong>Temperatura: </strong> <%= Math.round(clima.getMain().getTemp())%>ºC</p>
                                <p><strong>Máxima: </strong> <%= Math.round(clima.getMain().getTempMax())%>ºC </p>
                                <p><strong>Minima: </strong> <%= Math.round(clima.getMain().getTempMin())%>ºC </p>
                                <p><strong>Umidade: </strong> <%= clima.getMain().getHumidity()%>% </p>
                                <p><strong>Sensação térmica: </strong> <%= Math.round(clima.getMain().getFeelsLike())%>ºC </p>
                                <p><strong>Pressão: </strong> <%= clima.getMain().getPressure()%> hPa </p>
                                <p><strong>Visibilidade: </strong> <%= clima.getVisibility()%> Km </p>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <% } else {%>
        <div class="container">
            <div class="row">
                <div class="card-clima">
                    <div class="card">
                        <div class="card-body">
                            <div class="text-center">
                                <h4><%= cidade.isEmpty() ? "Digite uma cidade" : "Cidade não encontrada"%></h4>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <% }%>
        <br>
        <footer class="text-center"><p>Gustavo Silva - Aplicações OO - UNINOVE 2021</p></footer>
    </body>
</html>
