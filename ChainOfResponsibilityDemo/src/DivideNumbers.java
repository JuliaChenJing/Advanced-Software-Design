public class DivideNumbers implements Chain{

	private  Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getCalcWanted() == "divide"){
			
			System.out.print(request.getNumber1() + " / " + request.getNumber2() + " = "+
					(request.getNumber1()/request.getNumber2()));
			
		} else {
			
			System.out.print("Only works for add, sub, mult, and div");
			
		}
	}
}