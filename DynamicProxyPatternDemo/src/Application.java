import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Application {
	public static void main(String[] args) {
		IVehicle c = new Car();
		ClassLoader cl = IVehicle.class.getClassLoader();
		IVehicle v1 = (IVehicle) Proxy.newProxyInstance(cl, new Class[] { IVehicle.class },
				(InvocationHandler) new Logger(c));
		IVehicle v2 = (IVehicle) Proxy.newProxyInstance(cl, new Class[] { IVehicle.class }, new Notifier(v1));
		v2.start();
	}
}