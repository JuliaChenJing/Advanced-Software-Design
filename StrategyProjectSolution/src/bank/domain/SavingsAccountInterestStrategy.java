package bank.domain;

public class SavingsAccountInterestStrategy implements IInterestStrategy{

	public double computeInterest(double balance) {
		if (balance > 5000){
			return balance*0.04;
		}
		else{
			if (balance > 1000){
				return balance*0.02;
			}
			else{
				return balance*0.01;
			}
		}
	}

}
