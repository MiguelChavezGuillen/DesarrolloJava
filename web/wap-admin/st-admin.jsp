<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Administrador</title>
    <jsp:include page="<%= "styles.jsp" %>" />
</head>
<body>

<div class="gtco-loader"></div>

<div id="page">
    <jsp:include page="<%= "header.jsp" %>" />
    <div id="gtco-services">
        <div class="gtco-container">

            <div class="row">
                <div class="col-md-12">
<h1>Mantenimiento de Base de Datos</h1>
<table>
    <tr><ul><a href="reportAdmin.action">Administradores</a></ul>
        <ul><a href="reportInstrument.action">Tipos de Instrumentos</a></ul>
    </tr>
</table>
                </div>

            </div>
        </div>
    </div>

        <jsp:include page="<%= "footer.jsp" %>" />
</body>
</html>