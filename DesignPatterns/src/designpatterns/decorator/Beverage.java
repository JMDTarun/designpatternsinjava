package designpatterns.decorator;

public abstract class Beverage {

	public String description() {
		return "Here is your beverage description : ";
	}

	public abstract int cost();

	public static void main(String[] args) {
		Beverage b = new Cherry(new Nuts(new MangoShake()));
		System.out.println(b.description());
		System.out.println(b.cost());
	}

}

class MangoShake extends Beverage {

	@Override
	public int cost() {
		return 20;
	}

	@Override
	public String description() {
		return super.description() + "Mango Shake, ";
	}

}

class BananaShake extends Beverage {

	@Override
	public int cost() {
		return 30;
	}

	@Override
	public String description() {
		return super.description() + "Banana Shake";
	}

}

//class BeverageDecorator extends Beverage {
//	private Beverage beverage;
//	
//	public BeverageDecorator(Beverage beverage) {
//		this.beverage = beverage;
//	}
//
//	@Override
//	public int cost() {
//		return super;
//	}
//	
//}

class Nuts extends Beverage {
	private Beverage beverage;

	public Nuts(Beverage beverage) {
		this.beverage = beverage;
	}

	public int cost() {
		return 10 + beverage.cost();
	}

	public String description() {
		return beverage.description() + "Nuts,";
	}
}

class Cherry extends Beverage {
	private Beverage beverage;

	public Cherry(Beverage beverage) {
		this.beverage = beverage;
	}

	public int cost() {
		return 15 + beverage.cost();
	}

	public String description() {
		return beverage.description() + "Cherry,";
	}
}