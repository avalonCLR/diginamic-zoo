package zoo;

import java.util.Arrays;

public class Zoo {

	public static final int INDICE_SAVANE_AFRICAINE = 0;
	public static final int INDICE_ZONE_CARNIVORE = 1;
	public static final int INDICE_AQUARIUM = 2;
	public static final int INDICE_FERME_AUX_REPTILES = 3;
	public static final int INDICE_VOLIERE = 4;
	
	private Zone[] z;
	private String nom;
	
	{
		z = new Zone[5];
		
		z[INDICE_SAVANE_AFRICAINE] = new Zone("savane africaine"); 
		z[INDICE_ZONE_CARNIVORE]= new Zone("zone carnivore");
		z[INDICE_AQUARIUM]= new Zone("aquarium");
		z[INDICE_FERME_AUX_REPTILES]= new Zone("ferme aux reptiles");
		z[INDICE_VOLIERE]= new Zone("volière");
	}
	
	public Zoo(String nom) {
		
		super();
		this.nom = nom;	
		
	}

	
	public void addAnimalToZone(Animal animal){
		
		if (animal instanceof Mammifere && animal.getRegimeAlimentaire().equals(Animal.ALIMENT_CARNIVORE)) {
			z[INDICE_ZONE_CARNIVORE].addAnimal(animal);
		}
		
		if (animal instanceof Mammifere && animal.getRegimeAlimentaire().equals(Animal.ALIMENT_HERBIVORE)) {
			z[INDICE_SAVANE_AFRICAINE].addAnimal(animal);
		}
		
		if (animal instanceof Reptile) {
			z[INDICE_FERME_AUX_REPTILES].addAnimal(animal);
		}
		
		if (animal instanceof Volatile) {
			z[INDICE_VOLIERE].addAnimal(animal);
		}
		
		if (animal instanceof Poisson) {
			z[INDICE_AQUARIUM].addAnimal(animal);
		}
	}
	
	public void listerAnimaux(Animal animal) {
		if(animal!=null) {
			z[INDICE_ZONE_CARNIVORE].toString();
			z[INDICE_SAVANE_AFRICAINE].toString();
			z[INDICE_FERME_AUX_REPTILES].toString();
			z[INDICE_VOLIERE].toString();
			z[INDICE_AQUARIUM].toString();
		}else {
			System.out.println("No animals in the zoo");
		}
	}
	
	
	@Override
	public String toString() {
		return "Zoo =" + Arrays.toString(z);
	}
	
		
	}


