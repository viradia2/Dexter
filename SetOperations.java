import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> colourset1 = new LinkedHashSet<>();
		colourset1.add("Red");
		colourset1.add("Blue");
		colourset1.add("pink");
		colourset1.add("Yellow");
		colourset1.add("Glue");
		colourset1.add("Green");
		colourset1.add("violet");
		colourset1.add("Orange");
		colourset1.add("Indigo");
		colourset1.add("Peach");
		colourset1.add("Brown");
		colourset1.add("Black");
		colourset1.add("White");
		System.out.println("ColourSet 1: " + colourset1);
		
		Set<String> colourset2 = new LinkedHashSet<>();
		colourset2.add("red");
		colourset2.add("blue");
		colourset2.add("pink");
		colourset2.add("Yellow");
		colourset2.add("Green");
		colourset2.add("Violet");
		colourset2.add("Orange");
		System.out.println("ColourSet 2: " + colourset2);
		
		CaseSensitiveComparision(colourset1, colourset2);
		ignoreCaseAndCreateOutputWithDifference(colourset1, colourset2);
		
		String[] arr1 = colourset1.toArray(new String[0]);
		String[] arr2 = colourset2.toArray(new String[0]);
		
		List<String> list = new ArrayList<>();
		
		int biglength = arr1.length > arr2.length ? arr1.length : arr2.length;
		int smalllength = arr1.length < arr2.length ? arr1.length : arr2.length;
		
//		int j = 0;
		System.out.println(biglength + " " + smalllength);
		for(String s1 : colourset1){
			String temp1 = s1;
			boolean flag = false;
			for(String s2 : colourset2){
				String temp2 = s2;
				if(temp1.equalsIgnoreCase(temp2)){
					flag = true;
					break;
				}
			}
			if(!flag){
				list.add(temp1);
			}
		}
		System.out.println(list);
		
		
	}

	private static void ignoreCaseAndCreateOutputWithDifference(Set<String> colourset1, Set<String> colourset2) {
		// TODO Auto-generated method stub
		Set<String> colourset3 = new HashSet<>();
		Iterator<String> itr = colourset2.iterator();
		for(String s1: colourset1){
			if(itr.hasNext()){
				String s = itr.next();
				if(s1.equalsIgnoreCase(s))
					continue;
				else
					colourset3.add(s1);
			}
			colourset3.add(s1);
		}		
		System.out.println("Difference Output: " + colourset3);
	}

	private static void CaseSensitiveComparision(Set<String> colourset1, Set<String> colourset2) {
		// TODO Auto-generated method stub
		Set<String> colourset3 = new HashSet<>();
		
		for(int i=0; i<colourset1.size(); i++){
			for(String s: colourset2){
				if(colourset1.contains(s))
					colourset3.add(s);
			}
		}
		
		System.out.println("Case Sensitive Ouput: " + colourset3);
	}

}
