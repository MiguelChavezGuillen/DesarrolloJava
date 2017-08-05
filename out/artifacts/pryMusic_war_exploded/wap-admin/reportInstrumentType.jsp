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
<h2>Reporte de Tipos de Instrumentos</h2>
<div style="margin-top: 40px;">
    <s:if test="noData=true">
        <table class="table table-hover">
            <thead>
            <tr style="background-color: #E0E0E1;">

                <th>Id</th>
                <th>Name</th>
                <th>Descripcion</th>
                <th>Action</th>
            </tr>
            </thead>
            <s:iterator value="instrumentTypesList">
                <tr>
                    <td><s:property value="id" /></td>
                    <td><s:property value="name" /></td>
                    <td><s:property value="description" /></td>
                    <td>
                        <a href="InstrumentTypesUpdate.action?submitType=updatedata&id=<s:property value="id"/>">
                            <button class="btn btn-default" >Update</button>
                        </a>
                       <a href="InstrumentTypesDelete.action?id=<s:property value="id"/>">
                            <button class="btn btn-default">Delete</button>
                        </a>
                    </td>
                </tr>
            </s:iterator>
        </table>
    </s:if>
    <s:else>
        <div style="color: red;">No Data Found.</div>
    </s:else>
    <a href="registerInstrumentType.jsp">
        <button type="btn btn-primary btn-block">Registrar Tipo de Instrumentos</button>
    </a>
</div>

</div>

</div>
</div>
</div>

<jsp:include page="<%= "footer.jsp" %>" />
</body>
</html>