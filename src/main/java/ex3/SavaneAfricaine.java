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

	// calcul de la nourriture non renseign� j'ai donc mis une valeur "al�atoire"
	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size();
	}
}
