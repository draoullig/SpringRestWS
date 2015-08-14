package fr.gillouard.spring.restws.pojo;

public class Client {

	/**
	 * Identifiant du client.
	 */
	private String identifiant;

	/**
	 * Nom du client.
	 */
	private String nom;

	/**
	 * Prénom du client.
	 */
	private String prenom;

	/**
	 * Constructeur par defaut.
	 */
	public Client() {
	}

	/**
	 * Constructeur.
	 *
	 * @param identifiant
	 *            du client
	 * @param nom
	 *            du client
	 * @param prenom
	 *            du client
	 */
	public Client(final String identifiant, final String nom,
			final String prenom) {
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
	}

	/**
	 * @return the identifiant
	 */
	public String getIdentifiant() {
		return identifiant;
	}

	/**
	 * @param identifiant
	 *            the identifiant to set
	 */
	public void setIdentifiant(final String identifiant) {
		this.identifiant = identifiant;
	}

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom
	 *            the nom to set
	 */
	public void setNom(final String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom
	 *            the prenom to set
	 */
	public void setPrenom(final String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Surcharge de la fonction equals pour comparer les objets clients
	 * uniquement sur leur propriété identifiant
	 * 
	 * @param obj
	 *            obj client à comparer à celui-ci
	 */
	@Override
	public boolean equals(final Object obj) {
		if (((Client) obj).getIdentifiant().equals(this.getIdentifiant())) {
			return true;
		}
		return false;
	}
}
