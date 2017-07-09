package bank.service;

import bank.domain.Account;

public interface ISubject {

	public abstract void addObserver(IObserver addObserver);

	//https://www.youtube.com/watch?v=wiQdrH2YpT4&t=1035s
	//public abstract void delete Observer(IObserver deleteObserver);
	
	public abstract void notify(Account account);

}