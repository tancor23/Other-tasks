package by.rebel.middleTerminator;

public class MainFactory {

	public static void main(String[] args) {
		Terminator t800 = new T800(new TargetSave("John Connor;"));
		t800.showTarget();
		Terminator t1000 = new T1000(new TargetKill("Sarah Connor;"));
		t1000.showTarget();

	}

}
