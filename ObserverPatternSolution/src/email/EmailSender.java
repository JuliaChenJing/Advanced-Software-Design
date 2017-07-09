package email;

import java.util.Date;
import bank.domain.Account;
import bank.service.IObserver;

public class EmailSender implements IObserver {


	

	//when new account is created, email will be sent to confirm
	public void update(Account account) {
		// check if account is new
		if (account.getBalance() == 0.0) {
			String string = "Account " + account.getAccountnumber()
					+ " is created ";
			sendEmail(string);
		}
	}

	public void sendEmail(String string) {
		System.out.println("Sending email --------" + new Date() + "---" + string +"\n");
	}
}
