package JavaProgram;

import java.util.Scanner;

public class reversenumber {

	public static void main(String[] args) {
		
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int revnum=0;
		
		while(num!=0) {  //1234
			
			revnum=revnum*10+num%10;  //0+4=4
			num=num/10;
		}

		System.out.println("reverse "+revnum);
	}

}
