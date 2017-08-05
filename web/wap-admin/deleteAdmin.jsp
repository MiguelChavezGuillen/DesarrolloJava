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


                    <h2>Borrar Administradores</h2>
                    <span><s:property value="msg"/></span><br><br>
                    <a href="reportAdmin">
                        <button type="button">Reporte</button>
                    </a>



                </div>

            </div>
        </div>
    </div>

        <jsp:include page="<%= "footer.jsp" %>" />
</body>
</html>