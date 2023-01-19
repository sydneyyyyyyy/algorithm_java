package level0;

import java.util.Arrays;

public class ArrLength {

	public static void main(String[] args) {
		String[] strlist = {"We", "are", "the", "world!"};
		//strlist 각 원소의 길이를 담은 배열을 return
		
		int[] answer = new int[strlist.length];
		
        for(int i=0; i<strlist.length; i++){
            int cnt = strlist[i].length(); 
            answer[i] = cnt;
          }
       System.out.println(Arrays.toString(answer));
		
		
	}

}

/*length, length() 차이
 
length : 배열길이
length() : 문자열 길이
  
 */
