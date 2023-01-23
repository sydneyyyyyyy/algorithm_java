package level0;

public class IceAmericano {

	public static void main(String[] args) {
		int money = 5500;
		int[] answer = new int[2];
		answer[0] = money/5500;
		answer[1] = money%5500;
		for(int a:answer) {
			System.out.println(a);
		}
	}

}
/* 
 난이도에 비해 오래걸렸던 이유:
 나눌 수 있는 몫과 나머지를 구한 후 
 배열 선언과 동시에 초기화를 해주면 간단하게 풀리는 문제였는데,
 최댓값을 구해야한다고 생각해 오래걸림!
 */