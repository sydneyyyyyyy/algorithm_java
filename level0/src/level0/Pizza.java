package level0;

public class Pizza {

	public static void main(String[] args) {
		int n = 30;
		int answer = (n/7) + 1;
		
		
		if(n/7==0) {
			answer = 1;
		} else {
			if(n%7==0) {
				answer = n/7;
			} else {
				answer = (n/7) + 1;
			}
		}
	
	}

}
