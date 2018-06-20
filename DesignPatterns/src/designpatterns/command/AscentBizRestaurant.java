package designpatterns.command;

public class AscentBizRestaurant implements Restaurants {
	
	@Override
	public void placeOrder() {
		System.out.println("Order Placed");
	}

	@Override
	public void requestForBill() {
		System.out.println("Bill Generated");
	}

}
