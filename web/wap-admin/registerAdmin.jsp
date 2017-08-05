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

                <h2>Mantenimiento de Administradores</h2>
                <a href="reportAdmin"><button class="button-report" type="button">Reporte</button></a>
                <s:form action="registerAdmin" method="POST" theme="bootstrap" cssClass="form-vertical">
                    <s:textfield label="Email" name="email"/>
                    <s:password label="Password" name="password"/>
                    <s:textfield label="Nombre" name="name"/>
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