package designpatterns.command;

public class Waiter {

	private Command command;

	public Waiter(Command command) {
		this.command = command;
	}

	public void giveCommandToWaiter() {
		command.execute();
	}
	
}
