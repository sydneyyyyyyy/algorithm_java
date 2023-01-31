package level0;

import java.util.ArrayList;

public class OddArr {

	public static void main(String[] args) {
		int n = 10;
		ArrayList<Integer> arr = new ArrayList<>();
		
		for(int i=1;i<=n;i+=2) {
			arr.add(i);
		}
		int[] result = new int[arr.size()];
		for(int i=0; i<result.length;i++) {
			result[i] = arr.get(i);
		}
		
		//Integer[] answer = arr.toArray(new Integer[arr.size()]);
		
		for(int r:result) {
			System.out.print(r);
		}
		
		
		
	}

}
