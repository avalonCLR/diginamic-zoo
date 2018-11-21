package zoo;

import java.util.Arrays;

public class Zone {

	/**
	 * Attribut de la zone
	 */
	private String typeZone = null;
	private Animal[] animaux = null;

	public void addAnimal(Animal animal) {

		int tailleTab = 0;
		
		Animal[] tempAnimaux = animaux;
		
		if (animaux != null) {	
			tailleTab = tailleTab + 1;
			tempAnimaux = new Animal[tailleTab];
			for (int i = 0; i < animaux.length; i++) {
				tempAnimaux[i] = animaux[i];
				}

		} else {
			tailleTab = 1;
			tempAnimaux = new Animal[tailleTab];
			
				tempAnimaux[0] = animal;
				
			}
		animaux = tempAnimaux;
	}

	public Zone(String typeZone, Animal[] animaux) {
		super();
		this.typeZone = typeZone;
		this.animaux = animaux;
	}

	public Zone(String typeZone) {
		super();
		this.typeZone = typeZone;
	}

	
	/**
	 * Accesseurs et Mutateurs
	 * 
	 * @return
	 */
	public String getTypeZone() {
		return typeZone;
	}

	public void setTypeZone(String typeZone) {
		this.typeZone = typeZone;
	}

	@Override
	public String toString() {
		return "Zone [typeZone=" + typeZone + ", animaux=" + Arrays.toString(animaux) + "]";
	}

}
