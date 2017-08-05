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
<h2>Actualización de Administradores</h2>
<form action="updateAdmin" method="post" class="form-vertical">
    <pre>
        <input type="hidden" name="idhidden" class="form-control" value='<s:property value="id"/>'>

        <b>Email:</b><input type="email" name="email" class="form-control" value='<s:property value="email"/>'>

        <b>Password:</b><input type="password" name="password" class="form-control" value='<s:property value="password"/>'>

        <b>Name:</b><input type="text" name="name" class="form-control" value='<s:property value="name"/>'>

        <button name="submitType" value="update" class="btn btn-primary" type="submit">Update</button>
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
</div>

</div>
</div>
</div>

<jsp:include page="<%= "footer.jsp" %>" />
</body>
</html>