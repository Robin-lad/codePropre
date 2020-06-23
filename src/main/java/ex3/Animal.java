/**
 * 
 */
package ex3;

/**
 * @author robin
 *
 */
public class Animal {
	private String nom;
	private String type;
	private String comportement;

	public Animal(String nom, String type, String comportement) {
		super();
		this.nom = nom;
		this.type = type;
		this.comportement = comportement;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Setter
	 * 
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * Getter
	 * 
	 * @return the comportement
	 */
	public String getComportement() {
		return comportement;
	}

	/**
	 * Setter
	 * 
	 * @param comportement the comportement to set
	 */
	public void setComportement(String comportement) {
		this.comportement = comportement;
	}

	@Override
	public String toString() {
		return nom + ", " + type + ", " + comportement;
	}

}
