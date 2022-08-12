package JavaProgram;

public class palindromeString {

	public static void main(String[] args) {
		
		String str1="madam";
		String revstr="";
		int len=str1.length();
		
		for(int i=len-1;i>=0;i--) {
			
			revstr=revstr+str1.charAt(i);
			
		}

		System.out.println(revstr);
		System.out.println(str1);
		if(revstr.equals(str1)) {
			
			System.out.println("PALINDROME");
		}
		else
		{
			System.out.println("NOT PALINDROME");
			
		}
	}

}
