package designpatterns.command;

public class TestCommand {

	public static void main(String[] args) {
		
		Restaurants taj = new AscentBizRestaurant();
		Command command = new PlaceOrderCommand(taj);
		Waiter waiter = new Waiter(command);
		waiter.giveCommandToWaiter();
		
		command = new GenerateBillCommand(taj);
		waiter = new Waiter(command);
		waiter.giveCommandToWaiter();
		
	}
	
}
