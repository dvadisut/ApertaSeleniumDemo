package JavaProgram;

public class largestnum {

	public static void main(String[] args) {


		int a=10;
		int b=20;
		int c=30;
		
		int largest=a>b?a:b;

		largest=largest>c?largest:c;
		System.out.println(largest);
	}

}
