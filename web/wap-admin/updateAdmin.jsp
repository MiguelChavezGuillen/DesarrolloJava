<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Actualizar Administradores</title>
</head>
<body>
<h2>Actualización de Administradores</h2>
<form action="updateAdmin" method="post">
    <pre>
        <input type="hidden" name="idhidden" value='<s:property value="id"/>'>

        <b>Email:</b><input type="email" name="email" value='<s:property value="email"/>'>

        <b>Password:</b><input type="password" name="password" value='<s:property value="password"/>'>

        <b>Name:</b><input type="text" name="name" value='<s:property value="name"/>'>

        <button name="submitType" value="update" type="submit">Update</button>
    </pre>
</form>
<a href="reportAdmin">
    <button type="button">Reporte</button>
</a>
<s:if test="ctr>0">
    <span style="color: red;"><s:property value="msg"/></span>
</s:if>
<s:else>
    <span style="color: red;"><s:property value="msg"/></span>
</s:else>
</body>
</html>
