
public class BankingException {
	private int accountBalance = 500;
	
	/*****************************************************************
	 * Defining an Account Balance and then first withdrawing 
	 * money less than account balance, at that time program 
	 * will go through the process, flow will be normal and second time 
	 * withdrawing money more than account balance at that time normal
	 * flow of program will be affected and it will throw
	 * an exception.
	 ******************************************************************/
	
	public static void main(String[] args){
		// TODO Auto-generated method stub
		BankingException b = new BankingException();
		int amount = 400;
		b.accountWithdraw(amount);
		b.accountWithdraw(amount);
	}
	
	private void accountWithdraw(int amount){
		// TODO Auto-generated method stub
		try{
			if(amount < accountBalance){
				accountBalance = accountBalance - amount;
				System.out.println(amount + " is withdrawn from Account");
			}else{
				throw new ArithmeticException();
			}
		}catch(ArithmeticException e){
			e.printStackTrace();
			System.out.println("Amount higher than Balance");
		}
	}
	
}
