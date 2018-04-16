package by.htp.spring.entity;

public class Engine {

	private String power;

	public Engine() {
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public static Engine getInstance() {
		System.out.println("in getInstance!");
		return new Engine();
	}

	public void initEngine() {
		System.out.println("InitEngine");
	}

	public void destroyEngine() {
		System.out.println("DestroyEngine");
	}
}
