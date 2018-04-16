package by.htp.spring.terminator;

public class KillTarget extends AbstractTarget {

	public KillTarget(String value) {
		super(value);
	}

	public void show() {
		System.out.println("Save: " + value);
	}
}
