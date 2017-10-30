import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListOperations {
	/*
	 * Normal Operation On List Collection
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<>();
		
		list = addOnetoThousandtoList(list);
		System.out.println("Size After Adding 1000 Elements: " + list.size());
		
		list.removeAll(list.subList(900, list.size()));
//		list = remove901To1000(list);
		System.out.println("Size After Removing 100 Elements: " + list.size());
		System.out.println(list);
		list = removeElementswhichAreMultipleOf3And5(list);
		
		System.out.println("After Removing Multiple of 3 and 5: ");
		System.out.println("Size After Removing multiple of 3 and 5: " + list.size());
		System.out.println(list);
	}

	private static List<Integer> removeElementswhichAreMultipleOf3And5(List<Integer> list) {
		// TODO Auto-generated method stub
		
		for(Iterator<Integer> itr = list.iterator();itr.hasNext();){
			int value = itr.next();
			if(value % 3 == 0 || value % 5 == 0)
				itr.remove();
		}
		return list;
	}

	private static List<Integer> remove901To1000(List<Integer> list) {
		// TODO Auto-generated method stub
		for(int i = list.size() - 1; i>=900; i--){
			list.remove(i);
		}
		return list;
	}

	private static List<Integer> addOnetoThousandtoList(List<Integer> list) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=1000; i++)
			list.add(i);
		
		return list;
	}

}
