<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Fjorsvartnir
  Date: 25/06/2017
  Time: 06:05 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Home</title>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <link href='https://fonts.googleapis.com/css?family=Raleway:400,300,600,400italic,700' rel='stylesheet' type='text/css'>
  <link rel="stylesheet" href="css/animate.css">
  <link rel="stylesheet" href="css/icomoon.css">
  <link rel="stylesheet" href="css/bootstrap.css">
  <link rel="stylesheet" href="css/magnific-popup.css">
  <link rel="stylesheet" href="css/owl.carousel.min.css">
  <link rel="stylesheet" href="css/owl.theme.default.min.css">
  <link rel="stylesheet" href="css/style.css">
  <script src="js/modernizr-2.6.2.min.js"></script>
  <script src="js/respond.min.js"></script>
</head>
<body>


  <div class="gtco-loader"></div>

<div id="page">
  <nav class="gtco-nav" role="navigation">
    <div class="gtco-container">
      <div class="row">
        <div class="col-xs-2">
          <div id="gtco-logo"><a href="index.html">PlataformaDeMusica</a></div>
        </div>
        <div class="col-xs-10 text-right menu-1">
          <ul>
            <li class="active"><a href="#">Home</a></li>
            <li><a href="#">Eventos y Actividades</a></li>
            <li class="has-dropdown">
              <a href="#">Clases Online</a>
              <ul class="dropdown">
                <li><a href="#">Basico</a></li>
                <li><a href="#">Intermedio</a></li>
                <li><a href="#">Avanzado</a></li>
              </ul>
            </li>
            <li><a href="#">Tutores</a></li>
            <li><a href="#">Registrate</a></li>
            <li><a href="#">Sign In</a></li>
          </ul>
        </div>
      </div>

    </div>
  </nav>
  <header id="gtco-header" class="gtco-cover" role="banner" style="background-image:url(images/Musica-Clasica.jpg);">
    <div class="overlay"></div>
    <div class="gtco-container">
      <div class="row">
        <div class="col-md-12 col-md-offset-0 text-center">
          <div class="display-t">
            <div class="display-tc animate-box" data-animate-effect="fadeIn">
              <h1>Mensaje de Bienvenida</h1>
              <h2>Si aprender de musica quieres, registrarte debes</h2>
              <p>
                <a href="#" class="btn btn-primary btn-lg">Registrarse</a>
                <a href="#" class="btn btn-white btn-outline btn-lg">Login</a></p>
            </div>
          </div>
        </div>
      </div>
    </div>
  </header>

  <div id="gtco-services">
    <div class="gtco-container">

      <div class="row">

        <div class="gtco-tabs">
          <ul class="gtco-tab-nav">
            <li class="active"><a href="#" data-tab="1"><span class="icon visible-xs"><i class="icon-command"></i></span><span class="hidden-xs">Crea un Perfil </span></a></li>
            <li><a href="#" data-tab="2"><span class="icon visible-xs"><i class="icon-bar-graph"></i></span><span class="hidden-xs">Busca un Tutor</span></a></li>
            <li><a href="#" data-tab="3"><span class="icon visible-xs"><i class="icon-bag"></i></span><span class="hidden-xs">Aprende</span></a></li>
            <li><a href="#" data-tab="4"><span class="icon visible-xs"><i class="icon-box"></i></span><span class="hidden-xs">Publica Videos</span></a></li>
          </ul>

          <!-- Tabs -->
          <div class="gtco-tab-content-wrap">

            <div class="gtco-tab-content tab-content active" data-tab-content="1">
              <div class="col-md-6">
                <div class="gtco-video gtco-bg" style="background-image: url(images/VIDEO.jpg); ">
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

            <div class="gtco-tab-content tab-content" data-tab-content="2">
              <div class="col-md-6 col-md-push-6">
                <div class="gtco-video gtco-bg" style="background-image: url(images/VIDEO.jpg); ">
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

            <div class="gtco-tab-content tab-content" data-tab-content="3">
              <div class="col-md-6 col-md-push-6">
                <div class="gtco-video gtco-bg" style="background-image: url(images/VIDEO.jpg); ">
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

  <div id="gtco-features-2">
    <div class="gtco-container">
      <div class="row">
        <div class="text-center">
          <h2>Nuestras Clases</h2>
          <p>Musica y Audio</p>
        </div>
      </div>
      <div class="row">
        <div class="col-md-4">
          <div class="gtco-video gtco-video-sm gtco-bg" style="background-image: url(images/VIDEO.jpg) ">
            <a href="https://vimeo.com/channels/staffpicks/93951774" class="popup-vimeo"><i class="icon-video"></i></a>
            <div class="overlay"></div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="gtco-video gtco-video-sm gtco-bg" style="background-image: url(images/Musica-Clasica.jpg); ">
            <a href="https://vimeo.com/channels/staffpicks/93951774" class="popup-vimeo"><i class="icon-video"></i></a>
            <div class="overlay"></div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="gtco-video gtco-video-sm gtco-bg" style="background-image: url(images/VIDEO.jpg); ">
            <a href="https://vimeo.com/channels/staffpicks/93951774" class="popup-vimeo"><i class="icon-video"></i></a>
            <div class="overlay"></div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="gtco-video gtco-video-sm gtco-bg" style="background-image: url(images/VIDEO.jpg) ">
            <a href="https://vimeo.com/channels/staffpicks/93951774" class="popup-vimeo"><i class="icon-video"></i></a>
            <div class="overlay"></div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="gtco-video gtco-video-sm gtco-bg" style="background-image: url(images/Musica-Clasica.jpg); ">
            <a href="https://vimeo.com/channels/staffpicks/93951774" class="popup-vimeo"><i class="icon-video"></i></a>
            <div class="overlay"></div>
          </div>
        </div>
        <div class="col-md-4">
          <div class="gtco-video gtco-video-sm gtco-bg" style="background-image: url(images/VIDEO.jpg); ">
            <a href="https://vimeo.com/channels/staffpicks/93951774" class="popup-vimeo"><i class="icon-video"></i></a>
            <div class="overlay"></div>
          </div>
        </div>
      </div>
    </div>
  </div>

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

  <div id="gtco-counter" class="gtco-bg gtco-cover gtco-counter" style="background-image:url(images/img_bg_2.jpg);">
    <div class="overlay"></div>
    <div class="gtco-container">

      <div class="row">
        <div class="display-t">
          <div class="display-tc">
            <div class="col-md-3 col-sm-6">
              <div class="feature-center">
								<span class="icon">
									<i class="icon-eye"></i>
								</span>

                <span class="counter js-counter" data-from="0" data-to="22070" data-speed="5000" data-refresh-interval="50">1</span>
                <span class="counter-label">Creativity Fuel</span>

              </div>
            </div>
            <div class="col-md-3 col-sm-6">
              <div class="feature-center">
								<span class="icon">
									<i class="icon-anchor"></i>
								</span>

                <span class="counter js-counter" data-from="0" data-to="97" data-speed="5000" data-refresh-interval="50">1</span>
                <span class="counter-label">Happy Clients</span>
              </div>
            </div>
            <div class="col-md-3 col-sm-6">
              <div class="feature-center">
								<span class="icon">
									<i class="icon-briefcase"></i>
								</span>
                <span class="counter js-counter" data-from="0" data-to="402" data-speed="5000" data-refresh-interval="50">1</span>
                <span class="counter-label">Projects Done</span>
              </div>
            </div>
            <div class="col-md-3 col-sm-6 ">
              <div class="feature-center">
								<span class="icon">
									<i class="icon-clock"></i>
								</span>

                <span class="counter js-counter" data-from="0" data-to="212023" data-speed="5000" data-refresh-interval="50">1</span>
                <span class="counter-label">Hours Spent</span>

              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="gtco-testimonial">
    <div class="gtco-container">
      <div class="row animate-box">
        <div class="col-md-8 col-md-offset-2 text-center gtco-heading">
          <h2>Testimonial</h2>
        </div>
      </div>
      <div class="row animate-box">


        <div class="owl-carousel owl-carousel-fullwidth ">
          <div class="item">
            <div class="testimony-slide active text-center">
              <figure>
                <img src="images/person_1.jpg" alt="user">
              </figure>
              <span>Jean Doe, via <a href="#" class="twitter">Twitter</a></span>
              <blockquote>
                <p>&ldquo;Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.&rdquo;</p>
              </blockquote>
            </div>
          </div>
          <div class="item">
            <div class="testimony-slide active text-center">
              <figure>
                <img src="images/person_2.jpg" alt="user">
              </figure>
              <span>John Doe, via <a href="#" class="twitter">Twitter</a></span>
              <blockquote>
                <p>&ldquo;Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.&rdquo;</p>
              </blockquote>
            </div>
          </div>
          <div class="item">
            <div class="testimony-slide active text-center">
              <figure>
                <img src="images/person_3.jpg" alt="user">
              </figure>
              <span>John Doe, via <a href="#" class="twitter">Twitter</a></span>
              <blockquote>
                <p>&ldquo;Far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.&rdquo;</p>
              </blockquote>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>

  <div id="gtco-subscribe">
    <div class="gtco-container">
      <div class="row animate-box">
        <div class="col-md-8 col-md-offset-2 text-center gtco-heading">
          <h2>Subscribe</h2>
          <p>Be the first to know about the new templates.</p>
        </div>
      </div>
      <div class="row animate-box">
        <div class="col-md-12">
          <form class="form-inline">
            <div class="col-md-4 col-sm-4">
              <div class="form-group">
                <label for="email" class="sr-only">Email</label>
                <input type="email" class="form-control" id="email" placeholder="Your email">
              </div>
            </div>
            <div class="col-md-4 col-sm-4">
              <div class="form-group">
                <label for="name" class="sr-only">Name</label>
                <input type="text" class="form-control" id="name" placeholder="Your name">
              </div>
            </div>
            <div class="col-md-4 col-sm-4">
              <button type="submit" class="btn btn-default btn-block">Subscribe</button>
            </div>
          </form>
        </div>
      </div>
    </div>
  </div>

  <footer id="gtco-footer" role="contentinfo">
    <div class="gtco-container">
      <div class="row row-pb-md">
        <div class="col-md-2 col-sm-4 col-xs-6 ">
          <ul class="gtco-footer-links">
            <li><a href="#">About</a></li>
            <li><a href="#">Help</a></li>
            <li><a href="#">Contact</a></li>
            <li><a href="#">Terms</a></li>
            <li><a href="#">Meetups</a></li>
          </ul>
        </div>
        <div class="col-md-2 col-sm-4 col-xs-6">
          <ul class="gtco-footer-links">
            <li><a href="#">Creative Design</a></li>
            <li><a href="#">Branding</a></li>
            <li><a href="#">Illustration</a></li>
            <li><a href="#">Subscribe</a></li>
            <li><a href="#">Monthly Event</a></li>
          </ul>
        </div>

        <div class="clearfix visible-xs-block"></div>

        <div class="col-md-2 col-sm-4 col-xs-6">
          <ul class="gtco-footer-links">
            <li><a href="#">About</a></li>
            <li><a href="#">Help</a></li>
            <li><a href="#">Contact</a></li>
            <li><a href="#">Terms</a></li>
            <li><a href="#">Meetups</a></li>
          </ul>
        </div>

        <div class="clearfix visible-sm-block"></div>

        <div class="col-md-2 col-sm-4 col-xs-6">
          <ul class="gtco-footer-links">
            <li><a href="#">Shop</a></li>
            <li><a href="#">Privacy</a></li>
            <li><a href="#">Testimonials</a></li>
            <li><a href="#">Handbook</a></li>
            <li><a href="#">Held Desk</a></li>
          </ul>
        </div>

        <div class="clearfix visible-xs-block"></div>

        <div class="col-md-2 col-sm-4 col-xs-6">
          <ul class="gtco-footer-links">
            <li><a href="#">Find Designers</a></li>
            <li><a href="#">Find Deelopers</a></li>
            <li><a href="#">Teams</a></li>
            <li><a href="#">Advertise</a></li>
            <li><a href="#">API</a></li>
          </ul>
        </div>

        <div class="col-md-2 col-sm-4 col-xs-6">
          <ul class="gtco-footer-links">
            <li><a href="#">About</a></li>
            <li><a href="#">Help</a></li>
            <li><a href="#">Contact</a></li>
            <li><a href="#">Terms</a></li>
            <li><a href="#">Meetups</a></li>
          </ul>
        </div>

      </div>

      <div class="row copyright">
        <div class="col-md-12">
          <p class="pull-left">
            <small class="block">&copy; 2016 Free HTML5. All Rights Reserved.</small>
            <small class="block">Designed by <a href="http://FreeHTML5.co/" target="_blank">FreeHTML5.co</a> Demo Images: <a href="http://unsplash.co/" target="_blank">Unsplash</a></small>
          </p>
          <p class="pull-right">
          <ul class="gtco-social-icons pull-right">
            <li><a href="#"><i class="icon-twitter"></i></a></li>
            <li><a href="#"><i class="icon-facebook"></i></a></li>
            <li><a href="#"><i class="icon-linkedin"></i></a></li>
            <li><a href="#"><i class="icon-dribbble"></i></a></li>
          </ul>
          </p>
        </div>
      </div>

    </div>
  </footer>
</div>

<div class="gototop js-top">
  <a href="#" class="js-gotop"><i class="icon-arrow-up"></i></a>
</div>

  <!-- jQuery -->
  <script src="js/jquery.min.js"></script>
  <!-- jQuery Easing -->
  <script src="js/jquery.easing.1.3.js"></script>
  <!-- Bootstrap -->
  <script src="js/bootstrap.min.js"></script>
  <!-- Waypoints -->
  <script src="js/jquery.waypoints.min.js"></script>
  <!-- Carousel -->
  <script src="js/owl.carousel.min.js"></script>
  <!-- countTo -->
  <script src="js/jquery.countTo.js"></script>
  <!-- Magnific Popup -->
  <script src="js/jquery.magnific-popup.min.js"></script>
  <script src="js/magnific-popup-options.js"></script>
  <!-- Main -->
  <script src="js/main.js"></script>
</body>
</html>
