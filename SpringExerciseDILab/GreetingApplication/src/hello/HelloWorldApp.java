package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloWorldApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("springconfig.xml");   
		
		/*              bean name           package.class name
		  <bean id="greetingService" class="hello.GreetingImpl">
		                  instance variable name with setter
                 <property name="greeting"><value>Hello CS525</value></property>
                                                    value
          </bean>
		 */
		
		IGreeting greetingService = context.getBean("greetingService", IGreeting.class);
		greetingService.sayHello();
	}
}
