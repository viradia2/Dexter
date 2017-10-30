import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapOperations {
	/******************************************************
	 * Map Operation using different MAp Collection Methods
	 ******************************************************/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> m1 = new HashMap<>(); 
		m1.put(1, "One");
		m1.put(2, "Two");
		m1.put(3, "Thee");
		m1.put(4, "Four");
		m1.put(5, "Five");
		m1.put(6, "Six");
		m1.put(7, "Seven");
		m1.put(8, "Eight");
		m1.put(9, "Nine");
		m1.put(10, "Ten");
		
		Map<String, Long> m2 = new HashMap<>();
		m2.put("Mark", 20000l);
		m2.put("John", 30000l);
		m2.put("Tony", 20000l);
		m2.put("Joe", 25000l);
		m2.put("Gram", 35000l);
		m2.put("Kara", 45000l);
		m2.put("Bob", 45000l);
		
		boolean flag = checkIfMaphasDuplicatesOrNot(m1);
		Map<String, Integer> myNewHashMap = new HashMap<>();
		if(flag){
			for(Map.Entry<Integer, String> entry : m1.entrySet()){
			    myNewHashMap.put(entry.getValue(), entry.getKey());
			}
			System.out.println("Reversed HashMap: ");
			System.out.println(myNewHashMap);
		}else{
			System.out.println("Map has Duplicates Values. So Can not Reverse The Map");
		}
		
		
		boolean flag2 = checkIfMaphasDuplicatesOrNotForM2(m2);
		Map<Long, String> myNewHashMap2 = new HashMap<>();
		if(flag2){
			for(Map.Entry<String, Long> entry : m2.entrySet()){
			    myNewHashMap2.put(entry.getValue(), entry.getKey());
			}
			System.out.println("Reversed HashMap: ");
			System.out.println(myNewHashMap2);
		}else{
			System.out.println("Map has Duplicates Values. So Can not Reverse The Map");
		}
		
		removeDuplicatesAndPrintUniqueOnly(m2);
		
	}

	private static void removeDuplicatesAndPrintUniqueOnly(Map<String, Long> m2) {
		// TODO Auto-generated method stub
		Map<Long, String> charMap = new HashMap<Long, String>();
		for(Map.Entry<String, Long> entry : m2.entrySet()){
			long key = entry.getValue();
			String value = entry.getKey();
			if(charMap.containsKey(key)){
				charMap.remove(key);
			}else{
				charMap.put(key, value);
			}
		}
		
		System.out.println("Map With Unique Values: " + charMap);
	}

	private static boolean checkIfMaphasDuplicatesOrNotForM2(Map<String, Long> m2) {
		// TODO Auto-generated method stub
		Map<Long, Integer> charMap = new HashMap<Long, Integer>();
		for(Map.Entry<String, Long> entry : m2.entrySet()){
			long key = entry.getValue();
			if(charMap.containsKey(key)){
				charMap.put(key, charMap.get(key) + 1);
			}else{
				charMap.put(key, 1);
			}
		}
		
		for(Map.Entry<Long, Integer> set: charMap.entrySet()){
			if(set.getValue() > 1){
				return false;
			}
		}
		return true;
	}

	private static boolean checkIfMaphasDuplicatesOrNot(Map<Integer, String> m1) {
		// TODO Auto-generated method stub
		Map<String, Integer> charMap = new HashMap<String, Integer>();
		for(Map.Entry<Integer, String> entry : m1.entrySet()){
			String key = entry.getValue();
			if(charMap.containsKey(key)){
				charMap.put(key, charMap.get(key) + 1);
			}else{
				charMap.put(key, 1);
			}
		}
		
		for(Map.Entry<String, Integer> set: charMap.entrySet()){
			if(set.getValue() > 1){
				return false;
			}
		}
		return true;
	}

}
