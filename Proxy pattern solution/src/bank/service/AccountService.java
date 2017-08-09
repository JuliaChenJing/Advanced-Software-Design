package bank.service;

import java.lang.reflect.Proxy;
import java.util.Collection;

import proxies.Logger;
import proxies.Timer;

import bank.dao.AccountDAO;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;


public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;

	
	public AccountService(){
		IAccountDAO theaccountDAO=new AccountDAO();
		ClassLoader cl = IAccountDAO.class.getClassLoader();
		IAccountDAO theloggeraccountDAO = (IAccountDAO) Proxy.newProxyInstance(cl, new Class[] { IAccountDAO.class }, new Logger(theaccountDAO));

		accountDAO = (IAccountDAO) Proxy.newProxyInstance(cl, new Class[] { IAccountDAO.class }, new Timer(theloggeraccountDAO));

	}

	public Account createAccount(long accountNumber, String customerName) {
		Account account = new Account(accountNumber);
		Customer customer = new Customer(customerName);
		account.setCustomer(customer);
		accountDAO.saveAccount(account);
		return account;
	}

	public void deposit(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.deposit(amount);
		accountDAO.updateAccount(account);
	}

	public Account getAccount(long accountNumber) {
		Account account = accountDAO.loadAccount(accountNumber);
		return account;
	}

	public Collection<Account> getAllAccounts() {
		return accountDAO.getAccounts();
	}

	public void withdraw(long accountNumber, double amount) {
		Account account = accountDAO.loadAccount(accountNumber);
		account.withdraw(amount);
		accountDAO.updateAccount(account);
	}



	public void transferFunds(long fromAccountNumber, long toAccountNumber, double amount, String description) {
		Account fromAccount = accountDAO.loadAccount(fromAccountNumber);
		Account toAccount = accountDAO.loadAccount(toAccountNumber);
		fromAccount.transferFunds(toAccount, amount, description);
		accountDAO.updateAccount(fromAccount);
		accountDAO.updateAccount(toAccount);
	}
}
