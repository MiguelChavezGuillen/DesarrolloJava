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
<h2>Mantenimiento Tipos de Instrumentos</h2>
<a href="reportInstrument"><button class="btn btn-primary" type="button">Reporte</button></a>
<s:form action="registerInstrument" method="POST" theme="bootstrap" cssClass="form-vertical">
    <s:textfield label="name" name="name"/>
    <s:textfield label="description" name="description"/>
    <s:submit cssClass="btn btn-primary btn-block" value="Register"/>
</s:form>
<s:if test="ctr>0">
    <span style="color:green;"><s:property value="msg" /></span>
</s:if>
<s:else>
    <span style="color:red;"><s:property value="msg" /></span>
</s:else>

                </div>

            </div>
        </div>
    </div>

        <jsp:include page="<%= "footer.jsp" %>" />
</body>
</html>