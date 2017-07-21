<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: juanmendieta
  Date: 09/07/17
  Time: 04:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<div class="gtco-loader"></div>

<div id="page">
    <nav class="gtco-nav" role="navigation">
        <div class="gtco-container">
            <div class="row">
                <div class="col-xs-2">
                    <div id="gtco-logo"><a href="index.html">PlataformaDeMusica</a></div>
                </div>
                <div class="col-xs-10 text-right menu-1">
                    <ul>
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#">Eventos y Actividades</a></li>
                        <li class="has-dropdown">
                            <a href="#">Clases Online</a>
                            <ul class="dropdown">
                                <li><a href="#">Basico</a></li>
                                <li><a href="#">Intermedio</a></li>
                                <li><a href="#">Avanzado</a></li>
                            </ul>
                        </li>
                        <li><a href="#">Tutores</a></li>
                        <li><a href="registro">Registrate</a></li>
                        <li><a href="login">Sign In</a></li>
                    </ul>
                </div>
            </div>

        </div>
    </nav>
    <header id="gtco-header" class="gtco-cover" role="banner" style="background-image:url(../../images/Musica-Clasica.jpg);">
        <div class="overlay"></div>
        <div class="gtco-container">
            <div class="row">
                <div class="col-md-12 col-md-offset-0 text-center">
                    <div class="display-t">
                        <div class="display-tc animate-box" data-animate-effect="fadeIn">
                            <h1>Mensaje de Bienvenida</h1>
                            <h2>Si aprender de musica quieres, registrarte debes</h2>
                            <p>
                                <a href="registro" class="btn btn-primary btn-lg">Registrarse</a>
                                <a href="login" class="btn btn-white btn-outline btn-lg">Login</a></p>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </header>

