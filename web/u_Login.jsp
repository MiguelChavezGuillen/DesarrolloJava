
<%--
  Created by IntelliJ IDEA.
  User: juanmendieta
  Date: 09/07/17
  Time: 05:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>LOG IN</title>
    <jsp:include page="i_csss.jsp"/>
</head>
<body>
<div id="gtco-features"  >
    <div class="gtco-container">
        <div class="row">
            <h2>Sign In</h2>
            <form action="<s:url value="login.action"/>" class="form-horizontal" method="post">
                <div class="form-group">
                    <label for="mail" class="col-sm-2 control-label">Email:</label>
                    <div class="col-sm-10">
                        <input name="user" type="email" class="form-control" id="mail" >
                    </div>

                </div>
                <div class="form-group">
                    <label for="pass" class="col-sm-2 control-label">Contraseña:</label>
                    <div class="col-sm-10">
                        <input name="pass" type="password" class="form-control" id="pass">
                    </div>
                </div>

                <div class="col-md-12 text-center">
                    <button type="submit" class="btn btn-primary btn-lg">Ingresar</button>
                </div>
            </form>
            <p>&nbsp;</p>
            <div class="col-md-12 text-right">
                <p> Si aun no te haz registrado dale click en el boton &nbsp; &nbsp; &nbsp; &nbsp; <a type="button" class="btn btn-success btn-lg">Registrar</a> </p>
            </div>

        </div>
    </div>
</div>
<jsp:include page="i_Footer.jsp"/>
<jsp:include page="i_scripts.jsp"/>
</body>
</html>
