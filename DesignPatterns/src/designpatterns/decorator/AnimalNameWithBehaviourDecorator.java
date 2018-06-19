package designpatterns.decorator;

public class AnimalNameWithBehaviourDecorator implements AnimalName {

	private AnimalName animalName;

	public AnimalNameWithBehaviourDecorator(AnimalName animalName) {
		this.animalName = animalName;
	}
	
	@Override
	public String getAnumalName() {
		return animalName.getAnumalName() + ": Lively animal";
	}

}
