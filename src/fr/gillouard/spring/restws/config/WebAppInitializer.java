package fr.gillouard.spring.restws.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer {

	/**
	 * Methode appelee au demarrage du serveur
	 *
	 * @param servletContext
	 *            contexte de demarrage du serveur
	 */
	@Override
	public void onStartup(final ServletContext servletContext)
			throws ServletException {

		// Creation de la configuration Spring
		final AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(SpringConfig.class);
		context.setServletContext(servletContext);

		// Mise a disposition du contexte Spring
		servletContext.addListener(new ContextLoaderListener(context));
		servletContext.setInitParameter("defaultHtmlEscape", "true");

		// Filtrage des requetes via Spring
		final Dynamic dynamic = servletContext.addServlet("dispatcher",
				new DispatcherServlet(context));
		dynamic.addMapping("/");
		dynamic.setLoadOnStartup(1);

	}

}
