package level0;

public class CountEven {

	public static void main(String[] args) {
		int[] num_list = {1, 2, 3, 4, 5};
        
        int cnt = 0;
        
        for(int i=0;i<num_list.length;i++){
            if(num_list[i]%2==0){
                cnt++;
            }
        }
        
        int[] answer = {cnt,num_list.length-cnt};
        
        for(int a:answer) {        	
        	System.out.println(a);
        }
	}

}

/* 인상 깊었던 풀이

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        for(int i = 0; i < num_list.length; i++)
            answer[num_list[i] % 2]++;

        return answer;
    }

배열 인덱스 0,1을2로 나눈 나머지 0,1과 연관지어 간단히 풀이

 */