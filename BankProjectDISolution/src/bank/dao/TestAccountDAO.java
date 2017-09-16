package bank.dao;

import java.util.*;
import bank.domain.Account;

public class TestAccountDAO implements IAccountDAO {
	Collection<Account> accountlist = new ArrayList<Account>();

	public void saveAccount(Account account) {
		System.out.println("saveAccount");
		accountlist.add(account); // add the new
	}

	public void updateAccount(Account account) {
		System.out.println("updateAccount");
		Account accountexist = loadAccount(account.getAccountnumber());
		if (accountexist != null) {
			accountlist.remove(accountexist); // remove the old
			accountlist.add(account); // add the new
		}

	}

	public Account loadAccount(long accountnumber) {
		System.out.println("loadAccount");
		for (Account account : accountlist) {
			if (account.getAccountnumber() == accountnumber) {
				return account;
			}
		}
		return null;
	}

	public Collection<Account> getAccounts() {
		System.out.println("getAccounts");
		return accountlist;
	}

}
