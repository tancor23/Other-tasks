package by.rebel.factoryTerminator;

public abstract class Terminator {
	private Target target;

	public Terminator(Target target) {
		this.target = target;
	}
	
	public void showTarget() {
		this.target.showTarget();
	}
	

}
