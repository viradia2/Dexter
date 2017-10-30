import java.util.ArrayList;
import java.util.List;

public class FirstNonRepeated {
	
	public static void main(String[] args) {
		String s = "mahant";
		//Finding first non repeated character from the String
		List<Character> l = findFirstNonRepeatedCharacter(s);
		//Printing the first non repeated character
		System.out.println(l.get(0));
		
		System.out.println("String to Reverse: " + s);
		
		//Reversing the String Using Iteration
		String revString = reverseStringUsingIteration(s);
		System.out.println("Reve String using Iteration: " + revString);
		
		StringBuffer sb = new StringBuffer();
		//Reversing the String Using Recursion
		String revStr = reverseStringUsingRecursion(s, sb, s.length() - 1);
		System.out.println("Reversed String Using Recursion: " + revStr);
		
	}
	
	//Reversing the String Using Recursion
	private static String reverseStringUsingRecursion(String s, StringBuffer sb, int length) {
		// TODO Auto-generated method stub
		if(length >= 0){
			sb.append(s.charAt(length));
			reverseStringUsingRecursion(s, sb, length-1);
		}
		return sb.toString();
	}

	//Reversing the String Using Iteration
	private static String reverseStringUsingIteration(String s) {
		// TODO Auto-generated method stub
		StringBuffer sb = new StringBuffer();
		for(int i=s.length()-1; i>=0; i--){
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	
	//Finding non repeated characters from the String and returning as List of Characters
	private static List<Character> findFirstNonRepeatedCharacter(String s) {
		// TODO Auto-generated method stub
		char c = 0;
		List<Character> list = new ArrayList<>();
		for(int i=0; i<s.length(); i++){
			for(int j=i + 1; j<s.length(); j++){
				if(s.charAt(i) == s.charAt(j)){
					list.remove(i);
					break;
				}else{
					list.add(s.charAt(i));
				}
			}
		}
		return list;
	}
}
