package by.rebel.springTerminatorXML;

public class T1000 extends Terminator {

	public T1000() {
	}

	public T1000(Target target) {
		super(target);
	}

	@Override
	public void showTarget() {
		System.out.println(T1000.class.getSimpleName() + " target is : ");
		super.showTarget();
	}

}
