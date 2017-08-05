<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Reporte Administradores</title>
    <style>
        table, td, th {border: 1px solid black;}
        table {border-collapse: collapse;width: 60%;}
        th {height: 30px;}
        .button-update {background-color: #008CBA;color: white;}
        .button-delete {background-color: red;color: white;}
    </style>
</head>
<body>
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
</body>
</html>
