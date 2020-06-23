package ex2;

/**
 * Représente un type de compte bancaire qui est le livret A
 * 
 * @author robin
 *
 */
public class LivretA extends CompteBancaire {

	/** tauxRemuneration : taux de réunération d'un livret A */
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde, 0);
		this.tauxRemuneration = tauxRemuneration;
	}

	public void appliquerRemuAnnuelle() {

		solde += solde * (tauxRemuneration / 100);
	}

	@Override
	public void debiterMontant(double montant) {

		if (this.solde - montant > 0) {
			this.solde = solde - montant;
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
