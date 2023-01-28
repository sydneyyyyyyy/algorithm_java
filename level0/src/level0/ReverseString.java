package level0;

public class ReverseString {

	public static void main(String[] args) {
		String my_string = "jaron";
		String answer = "";
	       for(int i=my_string.length()-1;i>=0;i--){
	           answer+=my_string.substring(i,i+1);
	       }
	      System.out.print(answer); 
	}

}
