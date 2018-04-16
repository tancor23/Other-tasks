package by.htp.spring.terminator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainSpring {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Terminator t800 = context.getBean(T800.class);
		t800.showTarget();

		Terminator t1000 = context.getBean(T1000.class);
		t1000.showTarget();

	}
}
