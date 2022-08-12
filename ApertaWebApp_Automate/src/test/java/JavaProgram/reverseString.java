package JavaProgram;

public class reverseString {

	static String str1="dhinakaran";
	
	static String strrev="";
	
	public static void main(String[] args) {
		
		System.out.println(str1);
		
		int len=str1.length();
		
		for(int i=len-1;i>=0;i--) {
			
			
				strrev=strrev+str1.charAt(i);
			
		}
		System.out.println(strrev);    
	}
	
}
