package by.rebel.springTerminatorXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSpring {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		Terminator t800 = context.getBean(T800.class);
		t800.showTarget();
		Terminator t1000 = context.getBean(T1000.class);
		t1000.showTarget();
	}
}
