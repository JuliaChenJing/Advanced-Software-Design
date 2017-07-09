package logging;

import java.util.Date;
import bank.domain.Account;
import bank.service.*;

public class Logger implements IObserver {


	public void log(String logstring) {
		System.out.println("log--------" + new Date() + " -- " + logstring);
	}

	public void update(Account account) {
		String logstring = "Account "+account.getAccountnumber()+" is changed, new balance = "+account.getBalance();
		log(logstring);

	}

}
