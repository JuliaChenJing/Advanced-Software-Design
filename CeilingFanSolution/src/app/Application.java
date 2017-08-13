package app;

public class Application {


	public static void main(String[] args) {
		
		Fan fan = new Fan();
		fan.setState(new Off(fan, true));
		
		System.out.println( "\n1" );
		fan.pullgreen();
		fan.pullgreen();
		fan.pullgreen();
		fan.pullgreen();
		
		System.out.println( "\n2" );
		fan.pullred();
		fan.pullred();
	}
}
