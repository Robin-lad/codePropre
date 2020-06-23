package ex3;

public class ZoneCarnivore extends Zone {

	/**
	 * Constructeur
	 * 
	 * @param nom
	 * @param animaux
	 */
	public ZoneCarnivore() {
		super();
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 10;
	}

}
