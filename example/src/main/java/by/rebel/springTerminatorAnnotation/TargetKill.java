package by.rebel.springTerminatorAnnotation;

public class TargetKill extends AbstractTarget {

	public TargetKill(String value) {
		super(value);
	}

	@Override
	public void showTarget() {
		System.out.println("Kill: " + value);
	}

}
