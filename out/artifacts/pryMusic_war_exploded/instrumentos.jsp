<%--
  Created by IntelliJ IDEA.
  User: Fjorsvartnir
  Date: 25/06/2017
  Time: 08:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>inicio</h1>
<table border="1px">
<s:iterator value="instruments">
    <tr>
        <td><s:property value="name"/></td>
        <td><s:property value="description"/></td>
        <td><s:property value="instrumentType.name"/></td>
    </tr>
</s:iterator>
</table>
<h1>final</h1>
</body>
</html>
