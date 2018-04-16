package by.rebel.simpleTerminator;

public class Terminator {
	private Target target;
	
	public Terminator() {
		this.target = new Target();
	}

	public void showTerminator() {
		this.target.showTarget();
	}
}
