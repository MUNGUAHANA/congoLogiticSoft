<%
if(session.getAttribute("name")==null){
	response.sendRedirect("login.jsp");
}
	%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no" />
<meta name="description" content="" />
<meta name="author" content="" />
<title>CONGO LOGISTICO SOFT</title>
<!-- Favicon-->
<link rel="icon" type="image/x-icon" href="assets/favicon.ico" />
<!-- Font Awesome icons-->
<script src="https://use.fontawesome.com/releases/v5.15.4/js/all.js"
	crossorigin="anonymous"></script>
<!-- Google fonts-->
<link href="https://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css" />
<link
	href="https://fonts.googleapis.com/css?family=Lato:400,700,400italic,700italic"
	rel="stylesheet" type="text/css" />
<!-- Core theme CSS-->
<link href="css/index-styles.css" rel="stylesheet" />
</head>
<body id="page-top">
	<!-- Navigation-->
	<nav
		class="navbar navbar-expand-lg bg-secondary text-uppercase fixed-top"
		id="mainNav">
		<div class="container">
			<a class="navbar-brand" href="#page-top">Congo Logistico Soft</a>
			<button
				class="navbar-toggler text-uppercase font-weight-bold bg-primary text-white rounded"
				type="button" data-bs-toggle="collapse"
				data-bs-target="#navbarResponsive" aria-controls="navbarResponsive"
				aria-expanded="false" aria-label="Toggle navigation">
				Menu <i class="fas fa-bars"></i>
			</button>
			<div class="collapse navbar-collapse" id="navbarResponsive">
				<ul class="navbar-nav ms-auto">
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="#portfolio">Operations</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="#about">About</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="#contact">Contact</a></li>
					<li class="nav-item mx-0 mx-lg-1"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="logout">Logout</a></li>
					
					<li class="nav-item mx-0 mx-lg-1 bg-danger"><a
						class="nav-link py-3 px-0 px-lg-3 rounded" href="logout"><%= session.getAttribute("name") %></a></li>
				</ul>
			</div>
		</div>
	</nav>
	<!-- Masthead-->
	<header class="masthead bg-primary text-white text-center">
		<div class="container d-flex align-items-center flex-column">
			<!-- Masthead Avatar Image-->
			<img class="masthead-avatar mb-5" src="assets/img/portfolio/BFOT.png"
				alt="..." />
			<!-- Masthead Heading-->
			<h1 class="masthead-heading text-uppercase mb-0">Welcome in Congo Logistico Soft</h1>
			<!-- Icon Divider-->
			<div class="divider-custom divider-light">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- Masthead Subheading-->
			<p class="masthead-subheading font-weight-light mb-0"> A software to easily manage your stock</p>
		</div>
	</header>
	
	<section class="page-section portfolio" id="portfolio">
		<div class="container">
			
			<h2
				class="page-section-heading text-center text-uppercase text-secondary mb-0">Operations</h2>
			<!-- Icon Divider-->
			<div class="divider-custom">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- Portfolio Grid Items-->
			<div class="row justify-content-center">
				<!-- Portfolio Item 1-->
				<div class="col-md-6 col-lg-4 mb-5">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal1">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div
								class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/JOURNAL.png"
							alt="..." />
					</div>
				</div>
				<!-- Portfolio Item 2-->
				<div class="col-md-6 col-lg-4 mb-5">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal2">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div
								class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/FICHE DE STOCK.png"
							alt="..." />
					</div>
				</div>
				<!-- Portfolio Item 3-->
				<div class="col-md-6 col-lg-4 mb-5">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal3">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div
								class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/BON D'ENTREE.png"
							alt="..." />
					</div>
				</div>
				<!-- Portfolio Item 4-->
				<div class="col-md-6 col-lg-4 mb-5 mb-lg-0">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal4">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div
								class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/BON DE SORTIE.png"
							alt="..." />
					</div>
				</div>
				<!-- Portfolio Item 5-->
				<div class="col-md-6 col-lg-4 mb-5 mb-md-0">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal5">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div
								class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/FICHE D'INVENTAIRE.png"
							alt="..." />
					</div>
				</div>
				<!-- Portfolio Item 6-->
				<div class="col-md-6 col-lg-4">
					<div class="portfolio-item mx-auto" data-bs-toggle="modal"
						data-bs-target="#portfolioModal6">
						<div
							class="portfolio-item-caption d-flex align-items-center justify-content-center h-100 w-100">
							<div
								class="portfolio-item-caption-content text-center text-white">
								<i class="fas fa-plus fa-3x"></i>
							</div>
						</div>
						<img class="img-fluid" src="assets/img/portfolio/PRODUITS.png"
							alt="..." />
					</div>
				</div>
			</div>
		</div>
	</section>
	<!-- About Section-->
	<section class="page-section bg-primary text-white mb-0" id="about">
		<div class="container">
			<!-- About Section Heading-->
			<h2
				class="page-section-heading text-center text-uppercase text-white">About</h2>
			<!-- Icon Divider-->
			<div class="divider-custom divider-light">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- About Section Content-->
			<div class="row">
				<div class="col-lg-4 ms-auto">
					<p class="lead">Congo Logistico Soft is a stock management software developed
					 by changesmakers: David BUJIRIRI, Bénédicte MAKELELE and Dani Hangi with support and guides of
					 his professor Dr Aaron. It is designed for businesses of all sizes
					 , active in trade, industry, or services. Congo Logistico Soft allows for efficien
					 t stock management, tracking 
					of product movements, generating detailed reports, and making informed decisions.</p>
				</div>
				<div class="col-lg-4 me-auto">
					<p class="lead">Here are some of the main features of Congo Logistico Soft:
					Item management: creation and modification 
					of items, stock tracking, price management, etc.
					Inbound and outbound management: receipts, sales, transfers, etc.
					Inventory management: physical inventories, etc.
					Reporting: performance tracking, trend analysis, etc.
					Congo Logistico Soft is an essential tool for any business that 
					wants to improve its stock management.!</p>
				</div>
			</div>
			<!-- About Section Button-->
			<div class="text-center mt-4">
				<a class="btn btn-xl btn-outline-light"
					href="https://www.instagram.com/p/Cv5iFESLrqZ/?utm_source=ig_web_copy_link&igshid=MzRlODBiNWFlZA=="> <i
					class="fas fa-download me-2"></i> see our page!
				</a>
			</div>
		</div>
	</section>
	<!-- Contact Section-->
	<section class="page-section" id="contact">
		<div class="container">
			<!-- Contact Section Heading-->
			<h2
				class="page-section-heading text-center text-uppercase text-secondary mb-0">Contact
				us</h2>
			<!-- Icon Divider-->
			<div class="divider-custom">
				<div class="divider-custom-line"></div>
				<div class="divider-custom-icon">
					<i class="fas fa-star"></i>
				</div>
				<div class="divider-custom-line"></div>
			</div>
			<!-- Contact Section Form-->
			<div class="row justify-content-center">
				<div class="col-lg-8 col-xl-7">
					<!-- * * * * * * * * * * * * * * *-->
					<!-- * * SB Forms Contact Form * *-->
					<!-- * * * * * * * * * * * * * * *-->
					<!-- This form is pre-integrated with SB Forms.-->
					<!-- To make this form functional, sign up at-->
					<!-- https://startbootstrap.com/solution/contact-forms-->
					<!-- to get an API token!-->
					<form id="contactForm" data-sb-form-api-token="API_TOKEN">
						<!-- Name input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="name" type="text"
								placeholder="Enter your name..." data-sb-validations="required" />
							<label for="name">Full name</label>
							<div class="invalid-feedback" data-sb-feedback="name:required">A
								name is required.</div>
						</div>
						<!-- Email address input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="email" type="email"
								placeholder="name@example.com"
								data-sb-validations="required,email" /> <label for="email">Email
								address</label>
							<div class="invalid-feedback" data-sb-feedback="email:required">An
								email is required.</div>
							<div class="invalid-feedback" data-sb-feedback="email:email">Email
								is not valid.</div>
						</div>
						<!-- Phone number input-->
						<div class="form-floating mb-3">
							<input class="form-control" id="phone" type="tel"
								placeholder="(123) 456-7890" data-sb-validations="required" />
							<label for="phone">Phone number</label>
							<div class="invalid-feedback" data-sb-feedback="phone:required">A
								phone number is required.</div>
						</div>
						<!-- Message input-->
						<div class="form-floating mb-3">
							<textarea class="form-control" id="message" type="text"
								placeholder="Enter your message here..." style="height: 10rem"
								data-sb-validations="required"></textarea>
							<label for="message">Message</label>
							<div class="invalid-feedback" data-sb-feedback="message:required">A
								message is required.</div>
						</div>
						<!-- Submit success message-->
						<!---->
						<!-- This is what the user will see when the form-->
						<!-- has successfully submitted-->
						<div class="d-none" id="submitSuccessMessage">
							<div class="text-center mb-3">
								<div class="fw-bolder">Form submission successful!</div>
								To activate this form, sign up at <br /> <a
									href="https://startbootstrap.com/solution/contact-forms">https://startbootstrap.com/solution/contact-forms</a>
							</div>
						</div>
						<!-- Submit error message-->
						<!---->
						<!-- This is what your users will see when there is-->
						<!-- an error submitting the form-->
						<div class="d-none" id="submitErrorMessage">
							<div class="text-center text-danger mb-3">Error sending
								message!</div>
						</div>
						<!-- Submit Button-->
						<button class="btn btn-primary btn-xl disabled" id="submitButton"
							type="submit">Send</button>
					</form>
				</div>
			</div>
		</div>
	</section>
	<!-- Footer-->
	<footer class="footer text-center">
		<div class="container">
			<div class="row">
				<!-- Footer Location-->
				<div class="col-lg-4 mb-5 mb-lg-0">
					<h4 class="text-uppercase mb-4">Location</h4>
					<p class="lead mb-0">
						BENI/DRC <br /> Students at UCBC
					</p>
				</div>
				<!-- Footer Social Icons-->
				<div class="col-lg-4 mb-5 mb-lg-0">
					<h4 class="text-uppercase mb-4">Find us around the Web</h4>
					<a class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-facebook-f"></i></a> <a
						class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-twitter"></i></a> <a
						class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-linkedin-in"></i></a> <a
						class="btn btn-outline-light btn-social mx-1" href="#!"><i
						class="fab fa-fw fa-dribbble"></i></a>
				</div>
				<!-- Footer About Text-->
				<div class="col-lg-4">
					<h4 class="text-uppercase mb-4">About UCBC</h4>
					<p class="lead mb-0">
						UCBC is a chrestian univerity in DRC offering to students way
						 to imapct and shine the world.
						 <a href="https://www.ucbc.org/">Read more</a> .
					</p>
				</div>
			</div>
		</div>
	</footer>
	<!-- Copyright Section-->
	<div class="copyright py-4 text-center text-white">
		<div class="container">
			<small>Copyright &copy;CongoSoft2023</small>
		</div>
	</div>
	<div class="portfolio-modal modal fade" id="portfolioModal1"
		tabindex="-1" aria-labelledby="portfolioModal1" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
					<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
								
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">JOURNAL DE STOCK</h2>
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								<form method="post" action="Journal" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="date"><i class="zmdi zmdi-email"></i></label> <input
									type="date" name="date" id="date" placeholder="Date" />
							</div>
							<div class="form-group">
								<label for="numCompt"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="number" name="numCompt" id="numCompt" placeholder="Num compte" />
							</div>
							<div class="form-group">
								<label for="libelle"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="libelle" id="libelle" placeholder="Libellé" />
							</div>
							<div class="form-group">
								<label for="debit"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="debit" id="debit" placeholder="Débit" />
							</div>
							
							<div class="form-group">
								<label for="credit"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="credit" id="credit" placeholder="Crédit" />
							</div>
							
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Save" />
							</div>
						</form>
								<p class="mb-4">In this table, manage daily your transactions to keep kwnowing 
								how you worked a day.</p>
								<button class="btn btn-primary" href="#!"
									data-bs-dismiss="modal">
									<i class="fas fa-times fa-fw"></i> See Sheet
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="portfolio-modal modal fade" id="portfolioModal2"
		tabindex="-1" aria-labelledby="portfolioModal2" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
					<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
								
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">FICHE DE STOCK
									</h2>
								
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								<form method="post" action="Stock" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="date"><i class="zmdi zmdi-email"></i></label> <input
									type="date" name="date" id="date" placeholder="Date" />
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Type opération" />
							</div>
							<div class="form-group">
								<label for="entree"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="entreeVal" id="entreeVal" placeholder="Input name" />
							</div>
							<div class="form-group">
								<label for="sortie"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="entreeQuant" id="entreeQuant" placeholder="Input quantity" />
							</div>
							<div class="form-group">
								<label for="entree"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="prixEntree" id="prixEntree" placeholder="price input" />
							</div>
							<div class="form-group">
								<label for="sortie"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="sortieVal" id="sortieVal" placeholder="Output name" />
							</div>
							
							<div class="form-group">
								<label for="sortie"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="sortieQuant" id="sortieQuant" placeholder="Output quantity" />
							</div>
							<div class="form-group">
								<label for="sortie"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="prixSortie" id="prixSortie" placeholder="Output price" />
							</div>
							
							<div class="form-group">
								<label for="description"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="stockVal" id="stockVal" placeholder="Stock name" />
							</div>
							<div class="form-group">
								<label for="description"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="stockQuant" id="stockQuant" placeholder="Stock quantity" />
							</div>
							<div class="form-group">
								<label for="stockFin"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="prixStock" id="pricStock" placeholder="Stock price" />
							</div>
							<div class="form-group">
								<label for="commentInv"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="comment" id="comment" placeholder="comment " />
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Save" />
							</div>
						</form>
								<p class="mb-4">In this table save all different mouvent of your aticles and save
								each input and output and store your fina stock </p>
								<button class="btn btn-primary" href="#!"
									data-bs-dismiss="modal">
									<i class="fas fa-times fa-fw"></i> See Sheet
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="portfolio-modal modal fade" id="portfolioModal3"
		tabindex="-1" aria-labelledby="portfolioModal3" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
					<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
							
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">BON D'ENTREE
								</h2>
								<!-- Icon Divider-->
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								<form method="post" action="Input" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="date"><i class="zmdi zmdi-email"></i></label> <input
									type="date" name="date" id="date" placeholder="Date" />
							</div>
							<div class="form-group">
								<label for="designation"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="designation" id="designation" placeholder="Command designation" />
							</div>
							
							<div class="form-group">
								<label for="quantiteEntree"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="quantite" id="quantite" placeholder="Quuantity" />
							</div>
							
							<div class="form-group">
								<label for="prixUn"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="prixUnit" id="prixUnit" placeholder="Unit price of the product" />
							</div>
							
							<div class="form-group">
								<label for="totPrice"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="totPrice" id="totPrice" placeholder="Total price of the product" />
							</div>
							<div class="form-group">
								<label for="commentaire"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="commentaire" id="commentaire" placeholder="Comment about the products" />
							</div>
							
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Save" />
							</div>
						</form>
								<p class="mb-4">In this table store all different input of articles in your entyreprise 
								and make sure how much you get in</p>
								<button class="btn btn-primary" href="#!"
									data-bs-dismiss="modal">
									<i class="fas fa-times fa-fw"></i> See Sheet
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Portfolio Modal 4-->
	<div class="portfolio-modal modal fade" id="portfolioModal4"
		tabindex="-1" aria-labelledby="portfolioModal4" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
					<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
								
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">BON DE SORTIE</h2>
								<!-- Icon Divider-->
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								<form method="post" action="Output" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="date"><i class="zmdi zmdi-email"></i></label> <input
									type="date" name="date" id="date" placeholder="Date" />
							</div>
							<div class="form-group">
								<label for="designation"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="designation" id="designation" placeholder="Command designation" />
							</div>
							
							<div class="form-group">
								<label for="quantiteSortie"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="quantite" id="quantite" placeholder="Quuantity" />
							</div>
							
							<div class="form-group">
								<label for="prixUn"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="prixUnit" id="prixUnit" placeholder="Unit price of the product" />
							</div>
							
							<div class="form-group">
								<label for="totPrice"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="totPrice" id="totPrice" placeholder="Total price of the product" />
							</div>
							<div class="form-group">
								<label for="commentaire"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="commentaire" id="commentaire" placeholder="Comment about the products" />
							</div>
							
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Save" />
							</div>
						</form>
								<p class="mb-4">In this table store all different output of articles in your entreprise 
								and make sure how much you get out.</p>
								<button class="btn btn-primary" href="#!"
									data-bs-dismiss="modal">
									<i class="fas fa-times fa-fw"></i> See Sheet
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="portfolio-modal modal fade" id="portfolioModal5"
		tabindex="-1" aria-labelledby="portfolioModal5" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
					<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
								
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">FICHE D'INVENTAIRE
									</h2>
								<!-- Icon Divider-->
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								<form method="post" action="INV" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="date"><i class="zmdi zmdi-email"></i></label> <input
									type="date" name="date" id="date" placeholder="Date" />
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Product Name" />
							</div>
							
							<div class="form-group">
								<label for="reference"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="reference" id="reference" placeholder="Reference of the product" />
							</div>
							
							<div class="form-group">
								<label for="model"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="model" id="model" placeholder="Model of the product" />
							</div>
							
							<div class="form-group">
								<label for="description"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="description" id="description" placeholder="Description of the product" />
							</div>
							<div class="form-group">
								<label for="quantite"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="quantite" id="quantite" placeholder="Quantité of the products" />
							</div>
							<div class="form-group">
								<label for="prix"><i class="zmdi zmdi-lock"></i></label> <input
									type="number" name="prix" id="prix" placeholder="Price of the product" />
							</div>
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Save" />
							</div>
						</form>
								<p class="mb-4">In this table inventorie all of your products.</p>
								<button class="btn btn-primary" href="#!"
									data-bs-dismiss="modal">
									<i class="fas fa-times fa-fw"></i> See Sheet
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div class="portfolio-modal modal fade" id="portfolioModal6"
		tabindex="-1" aria-labelledby="portfolioModal6" aria-hidden="true">
		<div class="modal-dialog modal-xl">
			<div class="modal-content">
				<div class="modal-header border-0">
					<button class="btn-close" type="button" data-bs-dismiss="modal"
						aria-label="Close"></button>
				</div>
				<div class="modal-body text-center pb-5">
					<div class="container">
						<div class="row justify-content-center">
							<div class="col-lg-8">
								
								<h2
									class="portfolio-modal-title text-secondary text-uppercase mb-0">PRODUITS</h2>
								<!-- Icon Divider-->
								<div class="divider-custom">
									<div class="divider-custom-line"></div>
									<div class="divider-custom-icon">
										<i class="fas fa-star"></i>
									</div>
									<div class="divider-custom-line"></div>
								</div>
								
								<form method="post" action="saver" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="date"><i class="zmdi zmdi-email"></i></label> <input
									type="date" name="date" id="date" placeholder="Date" />
							</div>
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Product Name" />
							</div>
							
							<div class="form-group">
								<label for="detail"><i class="zmdi zmdi-lock"></i></label> <input
									type="text" name="detail" id="detail" placeholder="Detail about product" />
							</div>
							
							<div class="form-group form-button">
								<input type="submit" name="saver" id="saver"
									class="form-submit" value="Save" />
							</div>
						</form>
								<p class="mb-4">In this table manage and store your products </p>
								<button class="btn btn-primary" href="#!"
									data-bs-dismiss="modal">
									<i class="fas fa-times fa-fw"></i>See Sheet
								</button>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script
		src=""></script>
	<!-- Core theme JS-->
	<script src="js/scripts.js"></script>
	
	<script src=""></script>
</body>
</html>
