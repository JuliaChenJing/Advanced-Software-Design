package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");   
		
		/*
		  <bean id="greetingService" class="hello.GreetingImpl">
                 <property name="greeting"><value>Hello World</value></property>
          </bean>
		 */
		
		IGreeting greetingService = context.getBean("greetingService", IGreeting.class);
		greetingService.sayHello();
	}
}
