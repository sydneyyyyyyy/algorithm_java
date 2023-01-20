package level0;

public class RepeatCharacter {

	public static void main(String[] args) {
		String my_string = "hello";
		int n = 3;
		String answer = "";
		String[] arr = my_string.split("");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<=n;j++) {
				answer += (arr[i]);
			}
		}
		System.out.print(answer);
	}

}
