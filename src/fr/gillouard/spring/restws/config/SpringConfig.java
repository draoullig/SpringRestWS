package fr.gillouard.spring.restws.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
@ComponentScan("fr.gillouard.spring.restws")
public class SpringConfig extends WebMvcConfigurationSupport {
	
	 /**
	  * Constructeur.
	  */
	 SpringConfig() {
	 super();
	}

}
