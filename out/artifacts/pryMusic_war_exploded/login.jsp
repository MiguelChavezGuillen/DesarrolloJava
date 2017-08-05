<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Login</title>
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

    <p><a href="index.action">Atras</a></p>
    <h3>Ingresar</h3>
    <s:form action="login" method="POST" theme="bootstrap" cssClass="form-vertical">
        <s:textfield name="email" label="Correo"></s:textfield>
        <s:textfield name="password" label="Clave" type="password"></s:textfield>
        <s:submit value="Login" cssClass="btn-primary btn-block"></s:submit>
    </s:form>

    <a href="register.action" class="btn btn-block btn-success ">Registro</a>


</div>
            </div>
        </div>
    </div>
        <jsp:include page="<%= "footer.jsp" %>" />
</body>
</html>
