package by.htp.spring.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("app-context.xml");
		System.out.println(appContext.getBean("car"));
	}

}
