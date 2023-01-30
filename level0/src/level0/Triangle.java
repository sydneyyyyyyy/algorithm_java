package level0;

public class Triangle {

	public static void main(String[] args) {
		int[] sides = {1,2,3};
		int answer = 0;
		
		//최댓값구하기
		int max = sides[0];
		
		for(int i = 0; i<sides.length; i++) {
			if(max < sides[i]) {
				max = sides[i];
			}
		}
		
		//총합
		int sum = 0;
		for (int s:sides) {
			sum+=s;
		}
		
		if(max <sum - max) {
			answer = 1;
		} else {
			answer = 2;
		}
		
		System.out.print(answer);
	}

}

/*
Arrays 의 sort 메서드를 이용해 정렬한 후 인덱스 번호로만 구함
 
  Arrays.sort(sides);
  return sides[2] >= sides[0]+sides[1] ? 2 : 1;
 */
