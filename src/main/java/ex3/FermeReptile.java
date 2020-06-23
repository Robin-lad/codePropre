package ex3;

public class FermeReptile extends Zone {

	/** Constructeur
	 * @param nom
	 */
	public FermeReptile() {
		super();
	}

	@Override
	public double calculerKgsNourritureParJour() {
		return animaux.size() * 10;
	}
}
