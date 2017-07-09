package logging;

import java.util.Date;
import bank.domain.Account;
import bank.service.*;

public class Logger implements IObserver {


	
	//whenever the account amount is changed, Log will be crated to register new balance
	public void update(Account account) {
		String logstring = "Account "+account.getAccountnumber()+" is changed, new balance = "+account.getBalance();
		log(logstring);

	}

	
	public void log(String logstring) {
		System.out.println("Sending Log--------" + new Date() + " --- " + logstring +"\n");
	}

}
