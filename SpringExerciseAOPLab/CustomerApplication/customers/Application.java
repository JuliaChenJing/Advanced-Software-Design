package customers;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");
		
		ICustomerService customerService = context.getBean("customerService", ICustomerService.class);

		customerService.addCustomer("Julia Chen", "juliachenjing@gmail.com", "mainstreet 5", "San Leandro", "94579");
	}
}
