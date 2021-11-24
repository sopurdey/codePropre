package ex3;

public  class Animal {
	private String nom;
	private String type;
	private String comportementAlimentaire;

	public Animal(String nom, String type, String comportementAlimentaire, String enclos) {
		this.nom = nom;
		this.type = type;
		this.comportementAlimentaire = comportementAlimentaire;
	}

	public Animal(String nom, String type, String comportementAlimentaire) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportementAlimentaire = comportementAlimentaire;
	}

	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + ", comportementAlimentaire=" + comportementAlimentaire + "]";
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
