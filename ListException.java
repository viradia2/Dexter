import java.util.ArrayList;
import java.util.List;

public class ListException {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		list.add("27562");
		list.add("3147483647");
		list.add("2a756");
		/********************************************
		 * Checking and Handling Different Exceptions
		 * i.e NumberFormatException,
		 * 	   ArrayIndexOutOfBoundException
		 *     UserDefindeException or Exception
		 ********************************************/
		
		for(int i=0; i<4; i++){
			try{
				if(list.get(i).contains("a"))
					throw new NumberFormatException();
				else if(list.get(i).length() > 10){
					long value = Long.parseLong(list.get(i));
					if(value > Integer.MAX_VALUE)
						throw new ArithmeticException();
				}
			}catch(NumberFormatException|ArrayIndexOutOfBoundsException|ArithmeticException e){
				e.printStackTrace();
			}
		}
	}

}
