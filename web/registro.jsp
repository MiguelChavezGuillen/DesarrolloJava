<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome</title>
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

    <p><a href="welcome.action">Atras</a></p>
    <h3>Registrarse como <s:property value="%{#parameters.type}" /></h3>
                        <s:form action="register" theme="bootstrap" cssClass="form-vertical">
                            <s:select
                                    label="Tipo de registro"
                                    headerKey="-1" headerValue="Seleccione..."
                                    list="types" name="type"
                                    required="true"
                                    value="defaultSubject" />
                            <s:hidden name="type" value="%{#parameters.type}"></s:hidden>
                            <s:textfield name="firstName" label="Nombre" required="true"></s:textfield>
                            <s:textfield name="lastName" label="Apellido" required="true"></s:textfield>
                            <s:textfield name="email" label="Correo" required="true"></s:textfield>
                            <s:textfield name="password" label="Clave" type="password" required="true"></s:textfield>
                            <s:textfield name="address" label="Direccion" required="true"></s:textfield>
                            <s:textfield name="description" label="Descripcion" required="true"></s:textfield>
                            <s:submit value="Registro" cssClass="btn-primary btn-block "></s:submit>
                        </s:form>
                    </div>
                </div>
            </div>
        </div>

        <jsp:include page="<%= "footer.jsp" %>" />
</body>
</html>
