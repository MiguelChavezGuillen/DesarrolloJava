<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="sb" uri="/struts-bootstrap-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: juanmendieta
  Date: 09/07/17
  Time: 05:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LOG IN</title>
    <jsp:include page="i_csss.jsp"/>

</head>
<body>
<jsp:include page="i_Header.jsp"/>
<div id="gtco-features"  >
    <div class="gtco-container">
        <div class="row">
            <h2>Sign In</h2>
            <form class="form-horizontal">
                <s:form action="index" enctype="multipart/form-data" theme="bootstrap" cssClass="form-horizontal">
                <div class="form-group">
                    <label for="mail" class="col-sm-2 control-label">Email:</label>
                    <div class="col-sm-10">
                        <s:textfield name="mail" type="mail"/>
                    </div>
                </div>
                <div class="form-group">
                    <label for="pass" class="col-sm-2 control-label">Contraseña:</label>
                    <div class="col-sm-10">
                        <s:password name="pass"/>
                    </div>
                </div>

                <div class="col-md-12 text-center">
                    <s:submit name="Save" cssClass="btn btn-primary btn-lg"/>
                </div>
                </s:form>
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
