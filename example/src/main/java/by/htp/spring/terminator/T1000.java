package by.htp.spring.terminator;

public class T1000 extends Terminator {

	public T1000(Target target) {
		super(target);
	}

	@Override
	public void showTarget() {
		System.out.println(T800.class.getSimpleName());
		super.showTarget();
	}

}
