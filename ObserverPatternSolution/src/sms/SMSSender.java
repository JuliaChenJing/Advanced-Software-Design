package sms;

import java.util.Date;
import bank.domain.Account;
import bank.service.IObserver;

public class SMSSender implements IObserver {


	public void sendSMS(String string) {
		System.out.println("Sending SMS --------" + new Date() + " -- " + string);
	}

	public void update(Account account) {
		String string = "Account "+account.getAccountnumber()+" is changed, new balance = "+account.getBalance();
		sendSMS(string);

	}

}

