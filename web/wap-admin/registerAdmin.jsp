<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registro Administradores</title>
    <style type="text/css">
        .button-register {background-color: green;color: white;}
        .button-report {background-color: #000000;color: white;margin-left: 30%;}
    </style>
</head>
<body>
<h2>Mantenimiento de Administradores</h2>
<a href="reportAdmin"><button class="button-report" type="button">Reporte</button></a>
<s:form action="registerAdmin" method="POST">
    <s:textfield label="Email" name="email"/>
    <s:password label="Password" name="password"/>
    <s:textfield label="Nombre" name="name"/>
    <s:submit cssClass="button-register" value="Register"/>
</s:form>
<s:if test="ctr>0">
    <span style="color:green;"><s:property value="msg" /></span>
</s:if>
<s:else>
    <span style="color:red;"><s:property value="msg" /></span>
</s:else>
</body>
</html>
