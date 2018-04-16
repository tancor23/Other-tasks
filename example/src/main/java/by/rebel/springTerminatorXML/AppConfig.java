package by.rebel.springTerminatorXML;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:spring-config.properties")
public class AppConfig {
	
	@Value("${target.kill}")
	private String targetKill;
	
	@Value("${target.save}")
	private String targetSave;

	@Bean
	TargetKill targetKill() {
		return new TargetKill(targetKill);
	}
	
	@Bean 
	TargetSave targetSave() {
		return new TargetSave(targetSave);
	}
	
	@Bean
	T800 t800() {
		return new T800 (targetSave());
	}
	
	@Bean
	T1000 t1000() {
		return new T1000(targetKill());
	}
}
