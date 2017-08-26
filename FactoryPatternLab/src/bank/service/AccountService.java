package bank.service;

import java.util.Collection;

import bank.dao.AccountDAO;
import bank.dao.AccountDAOFactory;
import bank.dao.IAccountDAO;
import bank.domain.Account;
import bank.domain.Customer;
import bank.domain.SavingsAccountInterestStrategy;
import bank.domain.CheckingsAccountInterestStrategy;

public class AccountService implements IAccountService {
	private IAccountDAO accountDAO;
	AccountDAOFactory factory = new AccountDAOFactory();

	public AccountService(String type) {

		accountDAO=factory.createAccountDAO(type);
	}

	public Account createAccount(String type, long accountNumber, String customerName) {
		Account account = new Account(accountNumber);

		// set interest strategy
		if (type.equals("checking")) {
			account.setInterestStrategy(new CheckingsAccountInterestStrategy());
		} else {
			account.setInterestStrategy(new SavingsAccountInterestStrategy());
		}

		account.setType(type);

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

	// add interest to all users
	public void addinterestToAllUsers() {
		Collection<Account> accounts = getAllAccounts();
		for (Account account : accounts) {
			account.addInterest();
		}
	}
}
