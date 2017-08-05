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
    <h2>Reporte de Administradores</h2>
    <div style="margin-top: 40px;">
        <s:if test="noData=true">
            <table>
                <thead>
                <tr style="background-color: #E0E0E1;">

                    <th>Id</th>
                    <th>Email</th>
                    <th>Password</th>
                    <th>Name</th>
                    <th>Action</th>
                </tr>
                </thead>
                <s:iterator value="administratorsList">
                    <tr>
                        <td><s:property value="id" /></td>
                        <td><s:property value="email" /></td>
                        <td><s:property value="password" /></td>
                        <td><s:property value="name" /></td>
                        <td>
                            <a href="updateAdmin.action?submitType=updatedata&id=<s:property value="id"/>">
                                <button class="button-update">Update</button>
                            </a>
                            <a href="deleteAdmin.action?id=<s:property value="id"/>">
                                <button class="button-delete">Delete</button>
                            </a>
                        </td>
                    </tr>
                </s:iterator>
            </table>
        </s:if>
        <s:else>
            <div style="color: red;">No Data Found.</div>
        </s:else>
        <a href="registerAdmin.jsp">
            <button type="button">Registrar Admin</button>
        </a>
    </div>

                    <jsp:include page="<%= "footer.jsp" %>" />
</body>
</html>
