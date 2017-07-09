package bank.service;

import bank.domain.Account;

public interface IObserver {
  public void update(Account account);
}
