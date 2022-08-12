package JavaProgram;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {


		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		if(num%2==0 && num==2) {
			
			System.out.println("prime");
		}else
		{
			
			System.out.println("not prime");
		}

	}

}
