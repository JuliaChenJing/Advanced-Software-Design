import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Logger implements InvocationHandler {
	private Object v;

	public Logger(Object v) {
		this.v = v;
	}



	public Object invoke(Object proxy, Method m, Object[] args) throws Throwable {
		System.out.println("Logger: " + m.getName());
		Object object = m.invoke(v, args);
		return object;
	}
}