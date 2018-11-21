package zoo;

public abstract class Animal {

	/**
	 * Attributs
	 */
	private String nomAnimal;
	private String typeAnimal;
	private String regimeAlimentaire;

	/**
	 * ?
	 */
	public static final String ALIMENT_CARNIVORE = "Carnivore";
	public static final String ALIMENT_HERBIVORE = "Herbivore";
	public static final String ALIMENT_OMNIVORE = "Omnivore";

	/**
	 * Constructeur
	 * 
	 * @param nomAnimal
	 * @param typeAnimal
	 * @param regimeAlimentaire
	 */
	public Animal(String nomAnimal, String typeAnimal, String regimeAlimentaire) {
		this.nomAnimal = nomAnimal;
		this.typeAnimal = typeAnimal;
		this.regimeAlimentaire = regimeAlimentaire;
	}

	/**
	 * Accesseurs et Mutateurs
	 * 
	 * @return
	 */
	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}

	public String getTypeAnimal() {
		return typeAnimal;
	}

	public void setTypeAnimal(String typeAnimal) {
		this.typeAnimal = typeAnimal;
	}

	public String getRegimeAlimentaire() {
		return regimeAlimentaire;
	}

	public void setRegimeAlimentaire(String regimeAlimentaire) {
		this.regimeAlimentaire = regimeAlimentaire;
	}

	/**
	 * toString() Animal
	 */
	@Override
	public String toString() {
		return "Animal [nomAnimal=" + nomAnimal + ", typeAnimal=" + typeAnimal + ", regimeAlimentaire="
				+ regimeAlimentaire + "]";
	}

	
	
}
