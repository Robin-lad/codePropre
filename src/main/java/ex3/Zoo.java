package ex3;

/**
 * @author DIGINAMIC
 */
public class Zoo {

	private String nom;
	private ZoneCarnivore zoneCarnivore;
	private Aquarium aquarium;
	private FermeReptile fermeReptile;
	private SavaneAfricaine savaneAfricaine;

	public Zoo(String nom) {
		this.nom = nom;

		zoneCarnivore = new ZoneCarnivore();
		aquarium = new Aquarium();
		fermeReptile = new FermeReptile();
		savaneAfricaine = new SavaneAfricaine();
	}

	public void addAnimal(String nomAnimal, String typeAnimal, String comportement) {

		if (typeAnimal.equals("MAMMIFERE") && comportement.equals("CARNIVORE")) {
			zoneCarnivore.addAnimal(new Animal(nomAnimal, typeAnimal, comportement));
		} else if (typeAnimal.equals("MAMMIFERE") && comportement.equals("HERBIVORE")) {
			savaneAfricaine.addAnimal(new Animal(nomAnimal, typeAnimal, comportement));
		} else if (typeAnimal.equals("SERPENT")) {
			fermeReptile.addAnimal(new Animal(nomAnimal, typeAnimal, comportement));
		} else if (typeAnimal.equals("POISSON")) {
			aquarium.addAnimal(new Animal(nomAnimal, typeAnimal, comportement));
		}
	}

	public void afficherListeAnimaux() {
		zoneCarnivore.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		savaneAfricaine.afficherListeAnimaux();
	}

	/**
	 * Getter for nom
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
	 * @return the zoneCarnivore
	 */
	public ZoneCarnivore getZoneCarnivore() {
		return zoneCarnivore;
	}

	/**
	 * Setter
	 * 
	 * @param zoneCarnivore the zoneCarnivore to set
	 */
	public void setZoneCarnivore(ZoneCarnivore zoneCarnivore) {
		this.zoneCarnivore = zoneCarnivore;
	}

	/**
	 * Getter
	 * 
	 * @return the aquarium
	 */
	public Aquarium getAquarium() {
		return aquarium;
	}

	/**
	 * Setter
	 * 
	 * @param aquarium the aquarium to set
	 */
	public void setAquarium(Aquarium aquarium) {
		this.aquarium = aquarium;
	}

	/**
	 * Getter
	 * 
	 * @return the fermeReptile
	 */
	public FermeReptile getFermeReptile() {
		return fermeReptile;
	}

	/**
	 * Setter
	 * 
	 * @param fermeReptile the fermeReptile to set
	 */
	public void setFermeReptile(FermeReptile fermeReptile) {
		this.fermeReptile = fermeReptile;
	}

	/**
	 * Getter
	 * 
	 * @return the savaneAfricaine
	 */
	public SavaneAfricaine getSavaneAfricaine() {
		return savaneAfricaine;
	}

	/**
	 * Setter
	 * 
	 * @param savaneAfricaine the savaneAfricaine to set
	 */
	public void setSavaneAfricaine(SavaneAfricaine savaneAfricaine) {
		this.savaneAfricaine = savaneAfricaine;
	}
}
