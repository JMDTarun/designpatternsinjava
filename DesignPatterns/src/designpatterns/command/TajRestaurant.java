package designpatterns.command;

public class TajRestaurant implements Restaurants {

	@Override
	public void placeOrder() {
		System.out.println("Place order in TAJ");
	}

	@Override
	public void requestForBill() {
		System.out.println("Bill requested and paid by card.");
	}

}
