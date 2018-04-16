package by.htp.spring.terminator;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:app-config.properties")
public class AppConfig {
	
	@Value("$(kill.target")
	private String killTarget;
	
	@Value("$(save.target")
	private String saveTarget;

	@Bean
	KillTarget killTarget() {
		return new KillTarget("Sarah Connor");
	}
	
	@Bean
	SaveTarget saveTarget() {
		return new SaveTarget("John Connor");
	}
	
	@Bean 
	T800 t800() {
		return new T800(saveTarget());
	}

	@Bean 
	T1000 t1000() {
		return new T1000(killTarget());
	}

}
