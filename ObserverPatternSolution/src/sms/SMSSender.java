package sms;

import java.util.Date;
import bank.domain.Account;
import bank.service.IObserver;

public class SMSSender implements IObserver {

	//whenever the account amount is changed,  SMS will be sent to tell user the new balance
	public void update(Account account) {
		String string = "Account "+account.getAccountnumber()+" is changed, new balance = "+account.getBalance();
		sendSMS(string);
	}
	
	public void sendSMS(String string) {
		System.out.println("Sending SMS --------" + new Date() + " -- " + string +"\n");
	}



}

