<jsp:include page="<%= "includes/header.jsp" %>" />
<%@ taglib uri="/struts-tags" prefix="s"%>

    <p><a href="/home.action">Atras</a></p>
    <h1><s:property value="title"/></h1>
    <p><s:property value="description"/></p>
    <iframe width="640" height="360" src="<s:property value="url"/>" frameborder="0" allowfullscreen></iframe>

<jsp:include page="<%= "includes/footer.jsp" %>" />
