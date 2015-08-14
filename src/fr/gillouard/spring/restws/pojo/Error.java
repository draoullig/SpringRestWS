package fr.gillouard.spring.restws.pojo;

public class Error {

	/**
	 * Code erreur HTTP
	 */
	private int status;

	/**
	 * Code erreur interne api
	 */
	private String code;

	/**
	 * message standart a destination de l utilisateur
	 */
	private String message;

	/**
	 * message a destination du developpeur
	 */
	private String messageDeveloppeur;

	/**
	 * Lien vers une page d informations complementaires
	 */
	private String plusDInfo;

	/**
	 * Constructeur
	 * 
	 * @param status
	 *            erreur code http
	 * @param code
	 *            erreur interne au service rest
	 * @param message
	 *            message a destination de l utilisateur
	 * @param messageDeveloppeur
	 *            message a destination du developpeur
	 * @param plusDInfo
	 *            lien vers une page explicative
	 */
	public Error(final int status, final String code, final String message,
			final String messageDeveloppeur, final String plusDInfo) {
		this.status = status;
		this.code = code;
		this.message = message;
		this.messageDeveloppeur = messageDeveloppeur;
		this.plusDInfo = plusDInfo;
	}

	/**
	 * @return the status
	 */
	public int getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(final int status) {
		this.status = status;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(final String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(final String message) {
		this.message = message;
	}

	/**
	 * @return the messageDeveloppeur
	 */
	public String getMessageDeveloppeur() {
		return messageDeveloppeur;
	}

	/**
	 * @param messageDeveloppeur
	 *            the messageDeveloppeur to set
	 */
	public void setMessageDeveloppeur(final String messageDeveloppeur) {
		this.messageDeveloppeur = messageDeveloppeur;
	}

	/**
	 * @return the plusDInfo
	 */
	public String getPlusDInfo() {
		return plusDInfo;
	}

	/**
	 * @param plusDInfo
	 *            the plusDInfo to set
	 */
	public void setPlusDInfo(final String plusDInfo) {
		this.plusDInfo = plusDInfo;
	}

}
