package fr.gillouard.spring.restws.exception;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import fr.gillouard.spring.restws.pojo.Error;

@ControllerAdvice
public class ErrorHandler {

	/**
	 * Catch les exceptions en général
	 * 
	 * @param e
	 *            erreur a formater
	 * @return un objet erreur
	 */
	@ExceptionHandler(value = Exception.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public Error internalServerError(final Exception e) {
		return new Error(HttpStatus.INTERNAL_SERVER_ERROR.hashCode(),
				"ErrTechnique", e.getMessage(), getStackTrace(e), "A definir");

	}

	/**
	 * Catch les exceptions IndexOutOfBoundsException
	 * 
	 * @param e
	 *            erreur a formater
	 * @return un objet erreur
	 */
	@ExceptionHandler(value = IndexOutOfBoundsException.class)
	@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
	@ResponseBody
	public Error indexOutOfBoundsExceptionError(final Exception e) {
		return new Error(HttpStatus.INTERNAL_SERVER_ERROR.hashCode(),
				"ErrFonctionnel", e.getMessage(), getStackTrace(e), "A definir");

	}

	/**
	 * Transformation d'une stacktrace en chaine
	 * 
	 * @param e
	 *            erreur a traiter
	 * @return la stacktrace sous forme de chaine
	 */
	private String getStackTrace(final Exception e) {
		final StringWriter sw = new StringWriter();
		e.printStackTrace(new PrintWriter(sw));
		return sw.toString();
	}

}
