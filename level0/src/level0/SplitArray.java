package level0;

public class SplitArray {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5};
		int num1 = 1;
		int num2 = 3;
		
		int[] answer =new int[num2 - num1 +1];
		int j = 0;
		for(int i=num1;i<=num2;i++) {
			answer[j] = numbers[i];
			j++;
		}

	}

}

/*
 배열 크기 설정하는 거 잊지 말기!
 */