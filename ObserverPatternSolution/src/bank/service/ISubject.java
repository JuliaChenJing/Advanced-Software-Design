package bank.service;

import bank.domain.Account;

public interface ISubject {

	public abstract void addObserver(IObserver addObserver);

	public abstract void deleteObserver(IObserver deleteObserver);
	
	public abstract void notify(Account account);

}