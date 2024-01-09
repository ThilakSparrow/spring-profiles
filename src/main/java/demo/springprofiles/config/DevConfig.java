package demo.springprofiles.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevConfig {

	DevConfig() {
		System.out.println("----DevBean.DevBean()");
	}

}
