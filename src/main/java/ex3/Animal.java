package ex3;

/**
 * Classe concept animal
 * 
 * @author FormationDiginamic
 *
 */
public class Animal {

	/** Nom d'animal (Gazelle, Zèbre...) */
	private String nom;
	
	/** Type d'animal (Mamifère, Carnivore, Poisson...) */
	private String type;
	
	/** Type de comportement alimentaire (Carnivore, Herbivore, Omnivore) */
	private String comportementAlimentaire;

	/** Constructeur 
	 * @param nom 						nom de l'animal
	 * @param type						type d'animal
	 * @param comportementAlimentaire	comportement alimentaire
	 */
	public Animal(String nom, String type, String comportementAlimentaire) {
		this.nom = nom;
		this.type = type;
		this.comportementAlimentaire = comportementAlimentaire;
	}

	@Override
	public String toString() {
		return "nom=" + nom + ", type=" + type + ", comportementAlimentaire=" + comportementAlimentaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getComportementAlimentaire() {
		return comportementAlimentaire;
	}

	public void setComportementAlimentaire(String comportementAlimentaire) {
		this.comportementAlimentaire = comportementAlimentaire;
	}

}
