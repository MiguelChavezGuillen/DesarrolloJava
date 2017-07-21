<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Fjorsvartnir
  Date: 25/06/2017
  Time: 06:05 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@ include file="/Header.jsp" %>--%>
<html>
<head>
  <title>Home</title>
  <jsp:include page="i_csss.jsp" />
</head>
<body>
    <jsp:include page="i_Header.jsp"/>
<!-- Parte TUTORIAL -->
<div id="gtco-services">
  <div class="gtco-container">

    <div class="row">
      <!-- Menu Nav -->
      <div class="gtco-tabs">
        <ul class="gtco-tab-nav">
          <!-- Tabs del menu Nav -->
          <li class="active"><a href="#" data-tab="1"><span class="icon visible-xs"><i class="icon-command"></i></span><span class="hidden-xs">Crea un Perfil </span></a></li>
          <li><a href="#" data-tab="2"><span class="icon visible-xs"><i class="icon-bar-graph"></i></span><span class="hidden-xs">Busca un Tutor</span></a></li>
          <li><a href="#" data-tab="3"><span class="icon visible-xs"><i class="icon-bag"></i></span><span class="hidden-xs">Aprende</span></a></li>
          <li><a href="#" data-tab="4"><span class="icon visible-xs"><i class="icon-box"></i></span><span class="hidden-xs">Publica Videos</span></a></li>
        </ul>

        <!-- Tabs -->
        <div class="gtco-tab-content-wrap">
          <!-- tab CREA UN PERFIL -->
          <div class="gtco-tab-content tab-content active" data-tab-content="1">
            <div class="col-md-6">
              <!-- Imagen previa del video -->
              <div class="gtco-video gtco-bg" style="background-image: url(../../images/VIDEO.jpg); ">
                <!-- video -->
                <a href="https://vimeo.com/channels/staffpicks/93951774" class="popup-vimeo"><i class="icon-video"></i></a>
                <div class="overlay"></div>
              </div>
            </div>
            <div class="col-md-6">
              <h2>Crea un Perfil</h2>
              <p>Paragraph placeat quis fugiat provident veritatis quia iure a debitis adipisci dignissimos consectetur magni quas eius nobis reprehenderit soluta eligendi quo reiciendis fugit? Veritatis tenetur odio delectus quibusdam officiis est.</p>
              <p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis molestias totam fugiat soluta accusantium omnis quod similique placeat at. Dolorum ducimus libero fuga molestiae asperiores obcaecati corporis sint illo facilis.</p>
            </div>
          </div>

          <!-- tab BUSCA UN TUTOR -->
          <div class="gtco-tab-content tab-content" data-tab-content="2">
            <div class="col-md-6 col-md-push-6">
              <div class="gtco-video gtco-bg" style="background-image: url(../../images/VIDEO.jpg); ">
                <a href="https://vimeo.com/channels/staffpicks/93951774" class="popup-vimeo"><i class="icon-video"></i></a>
                <div class="overlay"></div>
              </div>
            </div>
            <div class="col-md-6 col-md-pull-6">
              <h2>Busca un Tutor</h2>
              <p>Paragraph placeat quis fugiat provident veritatis quia iure a debitis adipisci dignissimos consectetur magni quas eius nobis reprehenderit soluta eligendi quo reiciendis fugit? Veritatis tenetur odio delectus quibusdam officiis est.</p>
              <p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis molestias totam fugiat soluta accusantium omnis quod similique placeat at. Dolorum ducimus libero fuga molestiae asperiores obcaecati corporis sint illo facilis.</p>

              <div class="row">
                <div class="col-md-6">
                  <h2 class="uppercase">Niveles</h2>
                  <p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis</p>
                </div>
                <div class="col-md-6">
                  <h2 class="uppercase">Instrumentos</h2>
                  <p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis</p>
                </div>
              </div>

            </div>
          </div>

          <!-- tab APRENDE -->
          <div class="gtco-tab-content tab-content" data-tab-content="3">
            <div class="col-md-6 col-md-push-6">
              <div class="gtco-video gtco-bg" style="background-image: url(../../images/VIDEO.jpg); ">
                <a href="https://vimeo.com/channels/staffpicks/93951774" class="popup-vimeo"><i class="icon-video"></i></a>
                <div class="overlay"></div>
              </div>
            </div>
            <div class="col-md-6 col-md-pull-6">
              <div class="feature-left" data-animate-effect="fadeInLeft">
									<span class="icon">
										<i class="icon-check"></i>
									</span>
                <div class="feature-copy">
                  <h3>Novato</h3>
                  <p>Facilis ipsum reprehenderit nemo molestias. Aut cum mollitia reprehenderit.</p>
                </div>
              </div>
              <div class="feature-left" data-animate-effect="fadeInLeft">
									<span class="icon">
										<i class="icon-check"></i>
									</span>
                <div class="feature-copy">
                  <h3>Intermedio</h3>
                  <p>Facilis ipsum reprehenderit nemo molestias. Aut cum mollitia reprehenderit.</p>
                </div>
              </div>
              <div class="feature-left" data-animate-effect="fadeInLeft">
									<span class="icon">
										<i class="icon-check"></i>
									</span>
                <div class="feature-copy">
                  <h3>Avanzado</h3>
                  <p>Facilis ipsum reprehenderit nemo molestias. Aut cum mollitia reprehenderit.</p>
                </div>
              </div>
            </div>
          </div>

          <!-- tab PUBLICA VIDEOS -->
          <div class="gtco-tab-content tab-content" data-tab-content="4">
            <div class="col-md-6">
              <div class="icon icon-xlg">
                <i class="icon-box"></i>
              </div>
            </div>
            <div class="col-md-6">
              <h2>Publica Videos</h2>
              <p>Paragraph placeat quis fugiat provident veritatis quia iure a debitis adipisci dignissimos consectetur magni quas eius nobis reprehenderit soluta eligendi quo reiciendis fugit? Veritatis tenetur odio delectus quibusdam officiis est.</p>
              <p>Ullam dolorum iure dolore dicta fuga ipsa velit veritatis molestias totam fugiat soluta accusantium omnis quod similique placeat at. Dolorum ducimus libero fuga molestiae asperiores obcaecati corporis sint illo facilis.</p>

            </div>
          </div>

        </div>

      </div>
    </div>
  </div>
</div>

<!-- LISTA DE VIDEOS -->
<div id="gtco-features-2">

  <div class="gtco-container">
    <div class="row">
      <div class="text-center">
        <h2>Nuestras Clases</h2>
        <p>Musica y Audio</p>
      </div>
    </div>
    <div class="row">
        <s:iterator value="videos">
            
            <div class="col-md-4">
        <!-- IMAGEN PREVIA DE VIDEO -->
        <div class="gtco-video gtco-video-sm gtco-bg" style="background-image: url(https://i1.ytimg.com/vi/Y924hLJMEVM/hqdefault.jpg) ">
          <!-- VIDEO -->
          <a href="<s:property value="url"/>" class="popup-vimeo"><i class="icon-video"></i></a>
          <div class="overlay"></div>
        </div>
      </div>

</s:iterator>
    </div>
  </div>
</div>

<!-- INFORMACION -->
<div id="gtco-features"  >

  <div class="gtco-container">
    <div class="row">
      <div class="col-md-8 col-md-offset-2 text-center gtco-heading">
        <h2>Aprende con Nosotros</h2>
      </div>
    </div>
    <div class="row">
      <div class="col-md-4 col-sm-4">
        <div class="feature-center" data-animate-effect="fadeIn">
						<span class="icon">
							<i class="icon-eye"></i>
						</span>
          <h3>Basico</h3>
          <p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. </p>
          <p><a href="#" class="btn btn-primary btn-outline">Learn More</a></p>
        </div>
      </div>
      <div class="col-md-4 col-sm-4">
        <div class="feature-center" data-animate-effect="fadeIn">
						<span class="icon">
							<i class="icon-command"></i>
						</span>
          <h3>Intermedio</h3>
          <p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. </p>
          <p><a href="#" class="btn btn-primary btn-outline">Learn More</a></p>
        </div>
      </div>
      <div class="col-md-4 col-sm-4">
        <div class="feature-center" data-animate-effect="fadeIn">
						<span class="icon">
							<i class="icon-power"></i>
						</span>
          <h3>Avanzado</h3>
          <p>Dignissimos asperiores vitae velit veniam totam fuga molestias accusamus alias autem provident. </p>
          <p><a href="#" class="btn btn-primary btn-outline">Learn More</a></p>
        </div>
      </div>
    </div>
  </div>
</div>

<jsp:include page="i_Footer.jsp"/>
<jsp:include page="i_scripts.jsp"/>
</body>
</html>
