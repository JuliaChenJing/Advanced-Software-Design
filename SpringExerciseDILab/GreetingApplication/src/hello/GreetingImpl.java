package hello;

public class GreetingImpl implements IGreeting {

	/*
	 * In object-oriented programming with classes, an instance variable is a
	 * variable defined in a class (i.e. a member variable ), for which each
	 * instantiated object of the class has a separate copy, or instance. An
	 * instance variable is similar to a class variable.
	 */
	private String greeting;

	// constructor
	public GreetingImpl() {
	}

	// constructor
	public GreetingImpl(String greeting) {
		this.greeting = greeting;
	}

	//implementation of sayHello in IGreeting
	public void sayHello() {
		System.out.println(greeting);
	}

	//setter
	public void setGreeting(String greetingWords) {
		this.greeting = greetingWords;
	}
}
