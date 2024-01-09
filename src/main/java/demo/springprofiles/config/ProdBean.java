package demo.springprofiles.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdBean {

	ProdBean() {
		System.out.println("----ProdBean.ProdBean()");
	}
}
