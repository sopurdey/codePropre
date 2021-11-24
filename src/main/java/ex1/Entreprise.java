package ex1;

import java.util.Date;

/**
 * Classe qui représente une entreprise
 * 
 * @author FormationDiginamic
 *
 */
public class Entreprise {

	/** Numéro Siret de l'entreprise */
	private int siret;
	
	/** Nom de l'entreprise */
	private String nom;
	
	/** Adresse de l'entreprise */
	private String adresse;
	
	/** Date de création d'entreprise */
	private Date dateCreation;

	/** Capital maximum de l'entreprise */
	public static final int CAPITAL_MAX = 3000000;

	/**
	 * Afficher le statut de l'entreprise
	 */
	public void afficherStatut() {

	}

	public int getSiret() {
		return siret;
	}

	public void setSiret(int siret) {
		this.siret = siret;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public static int getCapitalMax() {
		return CAPITAL_MAX;
	}

}
