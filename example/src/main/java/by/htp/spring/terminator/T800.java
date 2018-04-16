package by.htp.spring.terminator;

public class T800 extends Terminator {

	public T800(Target target) {
		super(target);
	}

	@Override
	public void showTarget() {
		System.out.println(T800.class.getSimpleName());
		super.showTarget();
	}

}
