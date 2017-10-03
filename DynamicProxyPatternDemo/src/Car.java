
public class Car implements IVehicle {
	private String name = "Herbie";

	public void start() {
		System.out.println("Car " + name + " started");
	}
}