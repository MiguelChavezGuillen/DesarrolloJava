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
            <h2>Registrate</h2>
            <form class="form-horizontal">
                <div class="form-group">
                    <label for="apepat" class="col-sm-2 control-label">Apellido Paterno:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="apepat" >
                    </div>
                </div>
                <div class="form-group">
                    <label for="apemat" class="col-sm-2 control-label">Apellido Materno:</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="apemat" >
                    </div>
                </div>
                <div class="form-group">
                    <label for="nombre" class="col-sm-2 control-label">Nombres</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="nombre" >
                    </div>
                </div>
                <div class="form-group">
                    <label for="mail" class="col-sm-2 control-label">Email:</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="mail" >
                    </div>
                </div>
                <div class="form-group">
                    <label for="pass" class="col-sm-2 control-label">Contraseña:</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="pass">
                    </div>
                </div>
                <div class="form-group">
                    <label for="conpass" class="col-sm-2 control-label">Confirmar Contraseña:</label>
                    <div class="col-sm-10">
                        <input type="password" class="form-control" id="conpass">
                    </div>
                </div>
                <div class="form-group">
                    <label for="type" class="col-sm-2 control-label">Localidad: </label>
                    <div class="col-sm-10">
                    <select class="form-control" id="type">
                        <option>Lince</option>
                        <option>jesus Maria</option>
                        <option>San Isidro</option>
                    </select>
                    </div>

                </div>
                <div class="form-group">
                    <label for="des" class="col-sm-2 control-label">Descripcion:</label>
                    <div class="col-sm-10">
                        <textarea class="form-control" rows="3" id="des"></textarea>
                    </div>
                </div>
                <div class="col-md-12 text-right">
                    <button type="submit" class="btn btn-primary btn-lg">Registrar</button>
                </div>
            </form>
        </div>
    </div>
</div>

<%@ include file="../../Footer.jsp" %>
</body>
</html>
