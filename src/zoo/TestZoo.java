package zoo;

public class TestZoo {

	public static void main(String[] args) {
	
	Zoo zoo = new Zoo("z1");
	
	zoo.addAnimalToZone(new Mammifere("Toto", "Lion", "Carnivore"));
	zoo.addAnimalToZone(new Mammifere("Titi", "Lion", "Carnivore"));
	zoo.addAnimalToZone(new Mammifere("Gaz", "Gazelle", "Herbivore"));
	zoo.addAnimalToZone(new Mammifere("Ata", "Antilope", "Herbivore"));
	zoo.addAnimalToZone(new Mammifere("Zaza", "Zèbre", "Herbivore"));
	zoo.addAnimalToZone(new Poisson("Roro", "Requin", "Herbivore"));
	zoo.addAnimalToZone(new Poisson("Momo", "Morue", "Carnivore"));
	zoo.addAnimalToZone(new Reptile("Ana", "Anaconda", "Omnivore"));
	zoo.addAnimalToZone(new Reptile("Bobo", "Boa", "Carnivore"));
	
	System.out.println(zoo.toString());
	

	}

}
