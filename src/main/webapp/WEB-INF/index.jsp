<html>
<head>
    <title>Angular 2 QuickStart JS</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <link rel="stylesheet" href="/styles/material-design-lite/material.green-red.min.css">
    <script src="/styles/material-design-lite/material.min.js"></script>
    <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">


    <script src="https://rawgithub.com/systemjs/systemjs/0.19.6/dist/system.js"></script>
    <script src="https://code.angularjs.org/2.0.0-beta.0/angular2-polyfills.js"></script>
    <script src="https://code.angularjs.org/2.0.0-beta.0/Rx.js"></script>
    <script src="https://code.angularjs.org/2.0.0-beta.0/angular2.dev.js"></script>
    <!-- 2. Load our 'modules' -->
    <script src='/js/app/app.component.js'></script>
    <script src='/js/app/main.js'></script>
	
</head>

<!-- 3. Display the application -->
<body>
    <%--<my-app>Loading...</my-app>--%>
	<!-- Simple header -->
	<div class="mdl-layout mdl-js-layout mdl-layout--fixed-header">
		<header class="mdl-layout__header">
			<div class="mdl-layout__header-row">
				<!-- Title -->
				<span class="mdl-layout-title">Rulers of Bulgaria</span>
			</div>
			<!-- Tabs -->
			<div class="mdl-layout__tab-bar mdl-js-ripple-effect">
				<a href="#fixed-tab-1" class="mdl-layout__tab is-active">Home</a>
				<a href="#fixed-tab-2" class="mdl-layout__tab">Rulers</a>
				<a href="#fixed-tab-3" class="mdl-layout__tab">Timeline</a>
			</div>
		</header>
		<div class="mdl-layout__drawer">
			<span class="mdl-layout-title">Title</span>
		</div>
		<main class="mdl-layout__content">
			<section class="mdl-layout__tab-panel is-active" id="fixed-tab-1">

                <div class="page-content mdl-grid">
                    <!-- Your content goes here -->
                    <div class="mdl-cell mdl-cell--3-col">
                        <div class="mdl-card mdl-shadow--2dp">
                            <div class="mdl-card__title">
                                <h2 class="mdl-card__title-text">Ruler Name Here</h2>
                                <h4 class="mdl-card__subtitle-text">start-end</h4>
                            </div>
                            <div class="mdl-card__supporting-text">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                Mauris sagittis pellentesque lacus eleifend lacinia...
                            </div>
                            <div class="mdl-card__actions mdl-card--border">
                                <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                                    Get Started
                                </a>
                            </div>
                            <div class="mdl-card__menu">
                                <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                                    <i class="material-icons">share</i>
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="mdl-cell mdl-cell--3-col">
                        <div class="mdl-card mdl-shadow--2dp">
                            <div class="mdl-card__title">
                                <h2 class="mdl-card__title-text">Welcome</h2>
                            </div>
                            <div class="mdl-card__supporting-text">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                Mauris sagittis pellentesque lacus eleifend lacinia...
                            </div>
                            <div class="mdl-card__actions mdl-card--border">
                                <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                                    Get Started
                                </a>
                            </div>
                            <div class="mdl-card__menu">
                                <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                                    <i class="material-icons">share</i>
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="mdl-cell mdl-cell--3-col">
                        <div class="mdl-card mdl-shadow--2dp">
                            <div class="mdl-card__title">
                                <h2 class="mdl-card__title-text">Welcome</h2>
                            </div>
                            <div class="mdl-card__supporting-text">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                Mauris sagittis pellentesque lacus eleifend lacinia...
                            </div>
                            <div class="mdl-card__actions mdl-card--border">
                                <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                                    Get Started
                                </a>
                            </div>
                            <div class="mdl-card__menu">
                                <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                                    <i class="material-icons">share</i>
                                </button>
                            </div>
                        </div>
                    </div>
                    <div class="mdl-cell mdl-cell--3-col">
                        <div class="mdl-card mdl-shadow--2dp">
                            <div class="mdl-card__title">
                                <h2 class="mdl-card__title-text">Welcome</h2>
                            </div>
                            <div class="mdl-card__supporting-text">
                                Lorem ipsum dolor sit amet, consectetur adipiscing elit.
                                Mauris sagittis pellentesque lacus eleifend lacinia...
                            </div>
                            <div class="mdl-card__actions mdl-card--border">
                                <a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
                                    Get Started
                                </a>
                            </div>
                            <div class="mdl-card__menu">
                                <button class="mdl-button mdl-button--icon mdl-js-button mdl-js-ripple-effect">
                                    <i class="material-icons">share</i>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
			</section>
			<section class="mdl-layout__tab-panel" id="fixed-tab-2">
				<!-- Your content goes here -->
				<div class="page-content mdl-grid">
					<div class="mdl-cell mdl-cell--12-col">
						<div class="demo-card-square mdl-card mdl-shadow--2dp">
							<div class="mdl-card__title mdl-card--expand">
								<h2 class="mdl-card__title-text">Update</h2>
							</div>
							<div class="mdl-card__supporting-text">
								Lorem ipsum dolor sit amet, consectetur adipiscing elit.
								Aenan convallis.
							</div>
							<div class="mdl-card__actions mdl-card--border">
								<a class="mdl-button mdl-button--colored mdl-js-button mdl-js-ripple-effect">
									View Updates
								</a>
							</div>
						</div>
					</div>
				</div>
			</section>
			<section class="mdl-layout__tab-panel" id="fixed-tab-3">
				
				<div class="page-content mdl-grid">
					<!-- Your content goes here -->
					<div class="mdl-cell mdl-cell--2-col">
						<div class="container mdl-shadow--2dp">
                            <i class="material-icons">watch_later</i>
						</div>
					</div>
				</div>
			</section>
		</main>
	</div>
    
</body>

</html>
