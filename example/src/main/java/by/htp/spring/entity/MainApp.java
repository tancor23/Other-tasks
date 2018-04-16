package by.htp.spring.entity;

import java.util.Map.Entry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	/*public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("app-context.xml");
		Car car = context.getBean("car", Car.class);

		System.out.println("car hashCode: " + car.hashCode());
		System.out.println("car model: " + car.getModel());
		System.out.println("car engine: " + car.getEngine());
		for (String owner : car.getOwners()) {
			System.out.println("owner:" + owner);
		}
		for (Integer vin : car.getVins()) {
			System.out.println("vin:" + vin);
		}
		for(Entry<String, Integer> s : car.getLocations().entrySet()) {
			System.out.print("location:" + s.getKey());
			System.out.print("; years:" + s.getValue());
			System.out.println();
		}
		Car car2 = context.getBean("newCar", Car.class);

		System.out.println("car2 hashCode: " + car2.hashCode());
		System.out.println("car2 model: " + car2.getModel());
		System.out.println("car2 engine: " + car2.getEngine());

		((ClassPathXmlApplicationContext) context).close();
	}
*/
}
