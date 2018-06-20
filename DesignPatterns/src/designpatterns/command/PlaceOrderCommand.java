package designpatterns.command;

public class PlaceOrderCommand implements Command {

	private Restaurants restaurants;
	
	PlaceOrderCommand(Restaurants restaurants) {
		this.restaurants = restaurants;
	}
	
	@Override
	public void execute() {
		restaurants.placeOrder();
	}

}
