package designpatterns.command;

public class TestCommand {

	public static void main(String[] args) {
		
		TajRestaurant taj = new TajRestaurant();
		Command command = new PlaceOrderCommand(taj);
		Waiter waiter = new Waiter(command);
		waiter.giveCommandToWaiter();
		
	}
	
}
