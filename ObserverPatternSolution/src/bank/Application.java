package bank;

import java.util.Collection;

import sms.SMSSender;

import email.EmailSender;

import logging.Logger;

import bank.domain.Account;
import bank.domain.AccountEntry;
import bank.domain.Customer;
import bank.service.AccountService;
import bank.service.IAccountService;

public class Application {
	public static void main(String[] args) {
		
		//create an object of accountService
		IAccountService accountService = new AccountService();


		accountService.createAccount(111111, "Julia Chen");
		accountService.createAccount(222222, "Bimal Parajuli");
		
	
		accountService.deposit(111111, 100);
		accountService.deposit(111111, 200);
		accountService.withdraw(111111, 1);
		
	
		accountService.deposit(222222, 300);
		accountService.transferFunds(111111, 222222, 100, "payment of invoice 100");
		
		
		Collection<Account> accountlist = accountService.getAllAccounts();
		Customer customer = null;
		for (Account account : accountlist) {
			customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountnumber());
			System.out.println("Account Holder: " + customer.getName());
			System.out.println("-Date-------------------------"
							+ "-Description------------------"
							+ "-Amount-------------");
			for (AccountEntry entry : account.getEntryList()) {
				System.out.printf("%30s%30s%20.2f\n", entry.getDate()
						.toString(), entry.getDescription(), entry.getAmount());
			}
			System.out.println("----------------------------------------"
					+ "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:",
					account.getBalance());
		}
	}

}


