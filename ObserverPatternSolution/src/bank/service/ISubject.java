package bank.service;

import bank.domain.Account;

public interface ISubject {

	public abstract void addObserver(IObserver observer);

	public abstract void donotify(Account account);

}