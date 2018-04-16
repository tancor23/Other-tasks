package by.htp.spring.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Car {

	private String model;
	private Engine engine;
	private List <String> owners;
	private Set<Integer> vins;
	private Map<String, Integer> locations;



	public Car(List<String> owners, Set<Integer> vins, Map<String, Integer> locations) {
		super();
		this.owners = owners;
		this.vins = vins;
		this.locations = locations;
	}

	
	
	public Car(Set<Integer> vins, Map<String, Integer> locations) {
		super();
		this.vins = vins;
		this.locations = locations;
	}



	public Car(Map<String, Integer> locations) {
		super();
		this.locations = locations;
	}



	public Car(Set<Integer> vins) {
		super();
		this.vins = vins;
	}



	public List<String> getOwners() {
		return owners;
	}

	public Set<Integer> getVins() {
		return vins;
	}

	public void setVins(Set<Integer> vins) {
		this.vins = vins;
	}

	public Map<String, Integer> getLocations() {
		return locations;
	}

	public void setLocations(Map<String, Integer> locations) {
		this.locations = locations;
	}

	public void setOwners(List<String> owners) {
		this.owners = owners;
	}

	public Car() {
	}

	public Car(String model) {
		this.model = model;
	}

	public Car(String model, Engine engine) {
		this.model = model;
		this.engine = engine;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void init() {
		System.out.println("default - init car");
	}
	
	public void destroy() {
		System.out.println("default - destroy car");
	}
}
