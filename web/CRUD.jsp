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


                <p>
        <a href="home.action">Atrás</a>
    </p>
    <h1>
        <s:if test="isAdd()">Nuevo</s:if>
        <s:if test="isEdit()">Editar</s:if>
        <s:if test="isDelete()">Borrar</s:if> curso
    </h1>

    <s:form action="%{#actionName}" theme="bootstrap" cssClass="form-vertical">
        <s:hidden name="id" value="%{#parameters.id}"></s:hidden>
        <s:if test="isAdd() || isEdit()">
            <s:textfield name="title" label="Titulo"></s:textfield>
            <s:textfield name="description" label="Descripcion"></s:textfield>
            <s:textfield name="url" label="Link YouTube"></s:textfield>
            <s:select label="Instrumento"
                      headerKey="-1" headerValue="Seleccione..."
                      list="instrumentos"
                      name = "instrumentoId"
                      listKey="key"
                      listValue="value"
            />
            <s:submit value="Guardar" cssClass="btn-primary btn-block"></s:submit>
        </s:if>
        <s:if test="isDelete()">
            <h2> Seguro que desea eliminar el curso?</h2>
            <s:hidden name="id" value="%{#parameters.id}"></s:hidden>
            <s:submit value="Borrar" cssClass="btn-outline btn-block"></s:submit>
        </s:if>
    </s:form>


                </div>

            </div>
        </div>
    </div>

        <jsp:include page="<%= "footer.jsp" %>" />
</body>
</html>
