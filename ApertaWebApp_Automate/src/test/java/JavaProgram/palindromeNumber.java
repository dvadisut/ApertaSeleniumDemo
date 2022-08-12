package JavaProgram;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class palindromeNumber {

	public static void main(String[] args) {
		
		int num=101;
		int revnum=0;
		int orgnum=num;
		
		while(num!=0) {
			
			revnum=revnum*10+num%10;
			
			num=num/10;
		}
		
		System.out.println(orgnum);
		System.out.println(revnum);
			if(orgnum==revnum) {
				
				System.out.println("palindrome");
			}
			else {
				
				System.out.println("NOT Palindrome");
				
			}
		}

	}


