package bank.dao;

public class AccountDAOFactory {

public IAccountDAO makeAccountDAO(String newAccountDAOType){
		
		
		if (newAccountDAOType.equals("P")){
			
			return new AccountDAO();
			
		} else 
		
		if (newAccountDAOType.equals("T")){
			
			return new MockAccountDAO();
			
		} else return null;
		
	}
}
