
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "vivek";
		String l = "Vivek Vivek Vivek";
		String[] arr = l.split(" ");
		System.out.println(arr[0] + " " + arr[1] + " " + arr[2]);
		System.out.println(l.toLowerCase().replace(" ", ""));
		System.out.println();
		
		String file = "c/Users/Vivek/vvviradia/vivek.txt";
		String[] ar = file.split("/");
		System.out.println(ar[ar.length - 1]);
		if(s == l)
			System.out.println("same");
		else
			System.out.println("Not same");
		
		
		int sum = 0;
		for(int i=1; i<=5; i++){
			for(int j=1; j<=i; j++){
				sum += j;
				System.out.print(j);
				if(j == i)
					break;
				else
					System.out.print("+");
			}
			System.out.print(" = "+ sum);
			sum = 0;
			System.out.println();
		}
		
		String r = "alarm_reminder";
		String t = "timer_reminder";
		
		if(r.equals("alarm_reminder") || r.startsWith("a"))
			alarmReminder(r);
		else
			timerReminder(t);
		int value = 1243421;
		System.out.println("Check this  number is Palindrome or not: " + value);
		palindrome(Integer.toString(value));
	}

	private static void palindrome(String string) {
		// TODO Auto-generated method stub
		int length = string.length()-1;
		boolean flag = true;
		int ii = string.length()/2;
		for(int i=0; i<string.length(); i++){
			if(string.charAt(i) == string.charAt(length)){
				length--;
				if(i == string.length()/2) {
					break;
				}
				else
					continue;
			}else{
				flag = false;
			}
		}
		
		if(flag)
			System.out.println("Given number is Palindrome");
		else
			System.out.println("Given number is Not Palindrome");
	}

	private static void timerReminder(String t) {
		// TODO Auto-generated method stub
		System.out.println("Timer Reminder Method is Called: " + t);
	}

	private static void alarmReminder(String r) {
		// TODO Auto-generated method stub
		System.out.println("Alarm Reminder Method is Called: " + r);
	}

}
