package ex3;

public class Aquarium extends Zone {

	/** Constructeur
	 * @param nom
	 */
	public Aquarium() {
		super();
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 0.2;
	}
}
