package bank.dao;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class DaoLoggingAdvice {

	@After("execution(* bank.dao.*.*(..))")
	public void log(JoinPoint joinpoint) {
		System.out.println("Call was made to:" + joinpoint.getSignature().getName()
				+ " on " + joinpoint.getTarget().getClass());
	}
}
