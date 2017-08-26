
public class Test {

	public static int BalancePoint(int [] input){
		if(input==null ||input.length==0||input.length==1)
			return 0;
		int sum=0;
		
		for(int i=0;i<input.length;i++)
			sum+=input[i];
		
		for(int index=0;index<input.length;index++){
			int balance=(sum-input[index])/2;
			int firstHalfSum=0;
			for(int j=0;j<index;j++)
				firstHalfSum+=input[j];
			
			if(balance==firstHalfSum)
				return index;
		}
		
		return 0;
	}
	
	public static void main(String [] args){
		int [] array={2,9,7,4,5,-3,8,9,9,-1};
		System.out.print(BalancePoint(array));
	}
}
