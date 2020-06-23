package ex3;

public class SavaneAfricaine extends Zone {

	/**
	 * Constructeur
	 * 
	 * @param nom
	 */
	public SavaneAfricaine() {
		super();
	}

	// calcul de la nourriture non renseigné j'ai donc mis une valeur "aléatoire"
	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size();
	}
}
