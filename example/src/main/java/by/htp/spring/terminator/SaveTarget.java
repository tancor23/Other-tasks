package by.htp.spring.terminator;

public class SaveTarget extends AbstractTarget {

	public SaveTarget(String value) {
		super(value);
	}

	public void show() {
		System.out.println("Save: " + value);
	}
}
