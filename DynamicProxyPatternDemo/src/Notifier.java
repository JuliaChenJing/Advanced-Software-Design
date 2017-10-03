import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Notifier implements InvocationHandler {
	private Object v;

	public Notifier(Object v) {
		this.v = v;
	}

	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		System.out.println("Notifier: " + m.getName());
		Object object = m.invoke(v, args);
		System.out.println("Notifier: " + m.getName());
		return object;
	}
}