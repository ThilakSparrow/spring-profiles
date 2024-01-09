package demo.springprofiles.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("qa")
public class QaBean {

	QaBean() {
		System.out.println("----QaBean.QaBean()");
	}
}
