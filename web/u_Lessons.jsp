<%--
  Created by IntelliJ IDEA.
  User: juanmendieta
  Date: 09/07/17
  Time: 05:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../../Header.jsp" %>
<html>
<head>
    <title>Clases</title>
</head>
<body>
<div id="gtco-features"  >
    <div class="gtco-container">
        <div class="row">
            <form>
                <div class="row">
                    <h1>Tutores</h1>
                    <!-- FILTROS de ISNTRUMENTO -->
                    <div class="col-md-3">
                        <div class="form-group">
                            <label for="type">Tipo de instrumento</label>
                            <select class="form-control" id="type">
                                <option>Viento</option>
                                <option>Percusion</option>
                                <option>Cuerda</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="instrument">Instrumento</label>
                            <select class="form-control" id="instrument">
                                <option>Flauta</option>
                                <option>Trompeta</option>
                                <option>Samponha</option>
                            </select>

                        </div>
                    </div>
                    <div class="col-md-9">
                        <div class="container">
                            <div class="jumbotron">
                                <div class="row">
                                    <div class="col-md-6">
                                        <!-- NOMBRE DE TTUTOR -->
                                        <h3>Tutor 1</h3>
                                        <!-- IMAGEN DE TUTOR -->
                                        <a data-toggle="modal" role="button" data-target="#myModal1">
                                            <img src="../../images/tutor_3.jpg" class="img-responsive img-rounded"/>
                                        </a>
                                        <!-- Modal -->
                                        <div class="modal fade" id="myModal1" tabindex="-1" role="dialog" aria-labelledby="myModalLabel1">
                                            <div class="modal-dialog modal-lg" role="document">
                                                <div class="modal-content">
                                                    <div class="modal-header">
                                                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                                        <h4 class="modal-title" id="myModalLabel1">Tutor 1</h4>
                                                    </div>
                                                    <div class="modal-body">
                                                        <div class="row">
                                                            <!-- imagen de tutor -->
                                                            <div class="col-md-4">
                                                                <img src="../../images/tutor_3.jpg" class="img-responsive img-rounded"/>
                                                            </div>
                                                            <!-- INFORMACION DE TUTOR -->
                                                            <div class="col-md-8">
                                                                <h3>Biografia</h3>
                                                                <p>
                                                                    Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore
                                                                    et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip
                                                                    ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore
                                                                    eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui offici
                                                                    a deserunt mollit anim id est laborum.
                                                                </p>
                                                                <h3>Instrumentos</h3>
                                                                <ul>
                                                                    <li>Guitarra Electrica</li>
                                                                    <li>Bajo</li>
                                                                    <li>Piano</li>
                                                                    <li>Saxofon</li>
                                                                </ul>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="modal-footer">
                                                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="col-md-6">
                                        <!-- RADIOBUTTONS DE NINELES -->
                                        <h3>Nivel de Ensenanza</h3>
                                        <div class="btn-group" data-toggle="buttons">
                                            <label class="btn btn-group-justified btn-success btn-outline btn-md active">
                                                <input type="radio" autocomplete="off" checked> Basico
                                            </label>
                                            <label class="btn btn-group-justified btn-success btn-outline btn-md">
                                                <input type="radio" autocomplete="off"> Intermedio
                                            </label>
                                            <label class="btn btn-group-justified btn-success btn-outline btn-md">
                                                <input type="radio" autocomplete="off"> Avanzado
                                            </label>
                                        </div>
                                        <div class="gtco-footer-links">
                                            <p class="text-right"><a href="#" class="btn btn-primary  btn-outline btn-md">Login</a></p>
                                        </div>

                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>
            </form>
        </div>
    </div>
</div>

<%@ include file="../../Footer.jsp" %>
</body>
</html>
