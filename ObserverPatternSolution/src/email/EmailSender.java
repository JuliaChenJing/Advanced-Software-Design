package email;

import java.util.Date;
import bank.domain.Account;
import bank.service.IObserver;

public class EmailSender implements IObserver {


	public void sendEmail(String string) {
		System.out.println("Sending email --------" + new Date() + " -- " + string);
	}

	public void update(Account account) {
		// check if account is new
		if (account.getBalance() == 0.0) {
			String string = "Account " + account.getAccountnumber()
					+ " is created ";
			sendEmail(string);
		}
	}

}
