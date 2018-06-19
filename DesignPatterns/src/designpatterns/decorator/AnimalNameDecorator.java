package designpatterns.decorator;

public class AnimalNameDecorator implements AnimalName {
	
	private AnimalName animalName;

	public AnimalNameDecorator(AnimalName animalName) {
		this.animalName = animalName;
	}

	@Override
	public String getAnumalName() {
		return animalName.getAnumalName().toUpperCase();
	}
	
}
