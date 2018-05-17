package web.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import domain.User;

@Configuration
public class AppContext {

	@Bean(initMethod = "setup", destroyMethod = "cleanup")
	@Scope("prototype")
	public User user() {
		User user = new User();
		return user;
	}
}
