package designpatterns.command;

public class GenerateBillCommand implements Command {

	private Restaurants restaurants;

	GenerateBillCommand(Restaurants restaurants) {
		this.restaurants = restaurants;
	}
	
	@Override
	public void execute() {
		restaurants.requestForBill();
	}

}
