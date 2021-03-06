package bank;

import java.util.Collection;

import bank.domain.Account;
import bank.domain.AccountRecord;
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
		
		//transfer 100 from Julia to Bimal
		accountService.transferFunds(111111, 222222, 100, "payment of invoice 100");
		
		showAllStatements(accountService);
	
	}

	private static void showAllStatements(IAccountService accountService) {
		Collection<Account> accountlist = accountService.getAllAccounts();
		Customer customer = null;
		for (Account account : accountlist) {
			customer = account.getCustomer();
			System.out.println("Statement for Account: " + account.getAccountnumber());
			System.out.println("Account Holder: " + customer.getName());
			System.out.println("-Date-------------------------"
							+ "-Description------------------"
							+ "-Amount-------------");
			for (AccountRecord record : account.getRecordList()) {
				System.out.printf("%30s%30s%20.2f\n", record.getDate()
						.toString(), record.getDescription(), record.getAmount());
			}
			System.out.println("----------------------------------------"
					+ "----------------------------------------");
			System.out.printf("%30s%30s%20.2f\n\n", "", "Current Balance:",
					account.getBalance());
		}
		
	}

}


