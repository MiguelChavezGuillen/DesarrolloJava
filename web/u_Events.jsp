<%@ taglib prefix="s" uri="/struts-tags" %>
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
    <title>Eventos</title>
    <jsp:include page="i_csss.jsp"/>
</head>
<body>
<div id="gtco-features">

    <div class="gtco-container">
        <!-- Titulo -->
<h1>Eventos</h1>
        <s:iterator value="events">
        
        <div class="container">
            <div class="jumbotron">
                <h2>
                    <!-- Nombre de Evento -->
                    <s:property value="title"/>
                </h2>
                <div class="row">
                    <div class="col-md-3 col-sm-3">
                        <!-- Foto de evento -->
                        <img src="images/VIDEO.jpg" class="img-responsive"/>
                    </div>
                    <div class="col-md-9 col-sm-9">
                        <div>
                            <p>
                                <!-- Descripcion de evento -->
                                <s:property value="description"/>
                            </p>
                            <p class="text-right">
                                <a href="#" class="btn btn-info btn-outline">Leer más...</a>
                            </p>

                        </div>
                    </div>
                </div>
            </div>
        </div>
        </s:iterator>
    </div>
</div>

<jsp:include page="i_Footer.jsp"/>
<jsp:include page="i_scripts.jsp"/>
</body>
</html>
