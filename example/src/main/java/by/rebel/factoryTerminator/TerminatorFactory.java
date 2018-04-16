package by.rebel.factoryTerminator;

public class TerminatorFactory {

	public static Terminator getTerminator(String value) {
		if ("T800".equals(value)) {
			return new T800(new TargetSave("John Connor"));
		} else {
			if ("T1000".equals(value)) {
				return new T1000(new TargetKill("Sarah Connor"));
			} else {
				throw new IllegalArgumentException("Bad value");
			}
		}
	}
}