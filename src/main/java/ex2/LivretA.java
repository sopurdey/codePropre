package ex2;

public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	/**
	 * Ce constructeur est utilisé pour créer un compte de type Livret A
	 * 
	 * @param type             = LA
	 * @param solde            représente le solde du compte
	 * @param decouvert        représente le découvert autorisé (= 0)
	 * @param tauxRemuneration représente le taux de rémunération du livret A
	 */
	public LivretA(String type, double solde, double decouvert, double tauxRemuneration) {
		super(type, solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	/**
	 * Applique le taux de rémunération annuelle pour un compte de type Livret A
	 * 
	 */
	public void appliquerRemuAnnuelle() {
		if (this.type.equals("LA")) {
			this.solde = solde + solde * tauxRemuneration / 100;
		}
	}
	
	/**
	 * Getter for tauxRemuneration
	 * 
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	/**
	 * Setter
	 * 
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

}
