/**
 * 
 */
package ex3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author robin
 *
 */
public abstract class Zone {
//	protected String nom;
	protected List<Animal> animaux;

	public Zone() {
		super();
		animaux = new ArrayList<Animal>();
	}

	public void addAnimal(Animal a) {
		animaux.add(a);
	}

	public abstract double calculerKgsNourritureParJour();

	public void afficherListeAnimaux() {
		for (Animal a : animaux) {
			System.out.println(a);
		}
	}
}
