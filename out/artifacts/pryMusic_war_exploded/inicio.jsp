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
    <div id="gtco-features-2">

        <div class="gtco-container">
            <div class="row">
                <div class="text-center">
                    <h1>Nuestras Clases</h1>

                </div>
            </div>
            <div class="row">
                <s:if test="%{#session.admin}">
                    <div class="col-md-12">
                        <a href="add.action" class="btn btn-primary btn-block">Agregar</a>
                    </div>
                </s:if>
                <br/>
                <s:iterator value="data" status="videosStatus">

                    <div class="col-md-6">
                        <!-- IMAGEN PREVIA DE VIDEO -->
                        <div class="gtco-video gtco-video-sm gtco-bg" style="background-image: url(images/<s:property value="id"/>.jpg) ">
                            <!-- VIDEO -->
                            <a href="<s:property value="url"/>" class="popup-vimeo"><i class="icon-video"></i></a>
                            <div class="overlay"></div>
                        </div>
                        <strong><s:property value="tittle"/> (<s:property value="instrumento"/>)</strong>
                        <p><s:property value="description"/></p>
                        <s:if test="%{#session.admin}">
                            <div class="row">
                                <div class="col-md-6"> <a href="edit.action?id=<s:property value="id"/>" class="btn btn-default btn-sm btn-group-justified" >Editar</a></div>
                                <div class="col-md-6"><a href="delete.action?id=<s:property value="id"/>" class="btn btn-danger btn-sm btn-group-justified">Borrar</a></div>
                            </div>

                        </s:if>
                    </div>

                </s:iterator>

            </div>
        </div>
    </div>







        <jsp:include page="<%= "footer.jsp" %>" />
</body>
</html>
