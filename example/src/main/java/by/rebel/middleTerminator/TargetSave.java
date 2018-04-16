package by.rebel.middleTerminator;

public class TargetSave extends AbstractTarget {

	public TargetSave(String value) {
		super(value);
	}

	@Override
	public void showTarget() {
		System.out.println("Save: " + value);
	}

}
