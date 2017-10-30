import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SetOP {

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
		
		String[] arr1 = colourset1.toArray(new String[0]);
		String[] arr2 = colourset2.toArray(new String[0]);
		
		List<String> list = new ArrayList<>();
		
		int biglength = arr1.length > arr2.length ? arr1.length : arr2.length;
		int smalllength = arr1.length < arr2.length ? arr1.length : arr2.length;
		

		for(int i=0; i<biglength; i++){
			for(int j=0; j<smalllength; j++){
				if(arr1[i].equalsIgnoreCase(arr2[j])){
					colourset1.remove(arr1[i]);
					colourset2.remove(arr2[j]);
				}
			}
		}
		
		colourset1.addAll(colourset2);
		System.out.println(colourset1);
		
//		printAmericanFlag();
	}

	private static void printAmericanFlag() {
		// TODO Auto-generated method stub
		int count = 0;
		while(count < 7){
			if(count < 7){
				for(int i=0; i<6; i++){
					System.out.print("* ");
				}
				for(int i=0; i<8; i++){
					System.out.print("= ");
				}
			}
			
			System.out.println();
			if(count<7){
				for(int j=0; j<5; j++){
					System.out.print(" *");
				}
				System.out.print(" ");
				for(int i=0; i<8; i++){
					System.out.print(" =");
				}
			}
			
			System.out.println();
			count = count + 2;
		}
		int c =0;
		while(c < 4){
			for(int i=0; i<14; i++){
				System.out.print("= ");
			}
			System.out.println();
			c++;
		}
	}

}
