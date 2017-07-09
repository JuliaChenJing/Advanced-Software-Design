package bank.service;

import bank.domain.Account;
//there is only one abstract method update()  in the interface IObserver
public interface IObserver {
  public void update(Account account);
}
