package by.rebel.springTerminatorXML;

public abstract class Terminator {
	private Target target;

	public Terminator() {
	}

	public Terminator(Target target) {
		this.target = target;
	}

	public void showTarget() {
		this.target.showTarget();
	}

}
