package bank.domain;

import java.util.*;

import bank.service.Subject;

//Account is a publisher,its superclass Subject has a list of observer
public class Account extends Subject {
	long accountnumber;
	Collection<AccountRecord> recordList = new ArrayList<AccountRecord>();
	Customer customer;

	
	public Account (long accountnr){
		this.accountnumber = accountnr;
	}
	public long getAccountnumber() {
		return accountnumber;
	}
	public void setAccountnumber(long accountnumber) {
		this.accountnumber = accountnumber;
	}
	public double getBalance() {
		double balance=0;
		for (AccountRecord record : recordList) {
			balance+=record.getAmount();
		}
		return balance;
	}
	public void deposit(double amount){
		AccountRecord record = new AccountRecord(new Date(), amount, "deposit", "", "");
		recordList.add(record);
		notify(this);//deposit needs to notify observers

	}
	public void withdraw(double amount){
		AccountRecord record = new AccountRecord(new Date(), -amount, "withdraw", "", "");
		recordList.add(record);
		notify(this);//withdraw needs to notify observers

	}

	private void addRecord(AccountRecord record){
		recordList.add(record);
	}

	public void transferFunds(Account toAccount, double amount, String description){
		AccountRecord fromrecord = new AccountRecord(new Date(), -amount, description, ""+toAccount.getAccountnumber(), toAccount.getCustomer().getName());
		AccountRecord toRecord = new AccountRecord(new Date(), amount, description, ""+toAccount.getAccountnumber(), toAccount.getCustomer().getName());
		recordList.add(fromrecord);	
		toAccount.addRecord(toRecord);
		notify(this);//transfer needs to notify the observer where the money is taken
		notify(toAccount);//transfer needs to notify the observer where the money is given

	}
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Collection<AccountRecord> getRecordList() {
		return recordList;
	}

}
