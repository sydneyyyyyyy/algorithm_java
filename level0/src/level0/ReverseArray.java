package level0;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
    	int[] num_list = { 1, 2, 3, 4, 5 };
        int[] answer = new int[num_list.length];
        int idx =0;
        for (int i=num_list.length-1; i>=0;i--){
            answer[idx] = num_list[i];
            idx++;
        }
        System.out.println(Arrays.toString(answer));
    }
    
    
}
