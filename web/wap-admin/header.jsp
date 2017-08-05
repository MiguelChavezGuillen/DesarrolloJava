<%@ taglib uri="/struts-tags" prefix="s"%>
<nav class="gtco-nav" role="navigation">
    <div class="gtco-container">
        <div class="row">
            <div class="col-xs-2">
                <div id="gtco-logo"><a href="index.action">PlataformaDeMusica</a></div>
            </div>
            <div class="col-xs-10 text-right menu-1">
                <ul>
                    <li class="active"><a href="index.action">Home</a></li>
                    <li><a href="home.action">Eventos y Actividades</a></li>
                    <li class="has-dropdown">
                        <a href="#">Clases Online</a>
                        <ul class="dropdown">
                            <li><a href="#">Basico</a></li>
                            <li><a href="#">Intermedio</a></li>
                            <li><a href="#">Avanzado</a></li>
                        </ul>
                    </li>
                    <li><a href="#">Tutores</a></li>
                    <li><a href="register.action">Registrate</a></li>
                    <li>
                        <s:if test="%{#session.logged}">

                        <s:url id="logout" action="logout"></s:url>
                        <s:a href="%{logout}">Log out</s:a>
                        </s:if>
                        <s:else> <a href="login.action">SIGN IN</a></s:else>
                    </li>
                </ul>
            </div>
        </div>

    </div>
</nav>
<header id="gtco-header" class="gtco-cover" role="banner" style="background-image:url(../images/Musica-Clasica.jpg);">
    <div class="overlay"></div>
    <div class="gtco-container">
        <div class="row">
            <div class="col-md-12 col-md-offset-0 text-center">
                <div class="display-t">
                    <div class="display-tc animate-box" data-animate-effect="fadeIn">
                        <h1>Mensaje de Bienvenida</h1>
                        <h2>Si aprender de musica quieres, registrarte debes</h2>
                        <p>
                            <a href="register.action" class="btn btn-primary btn-lg">Registrarse</a>

                            <s:if test="%{#session.logged}">

                                <s:url id="logout" action="logout"></s:url>
                                <s:a cssClass="btn btn-white btn-outline btn-lg" href="%{logout}">Log out</s:a>
                            </s:if>
                            <s:else><a href="login.action" class="btn btn-white btn-outline btn-lg">Login</a></p> </s:else>

                    </div>
                </div>
            </div>
        </div>
    </div>
</header>

    <s:if test="%{#session.logged}">
        <strong>Usuario: <s:property value="%{#session.username}" /></strong>
    </s:if>
