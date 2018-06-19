package designpatterns.decorator;

public class AnimalMain {

	public static void main(String[] args) {
		AnimalName animalName = new AnimalNameWithBehaviourDecorator(new AnimalNameDecorator(new ElephantImpl()));
		System.out.println(animalName.getAnumalName());
	}

}
