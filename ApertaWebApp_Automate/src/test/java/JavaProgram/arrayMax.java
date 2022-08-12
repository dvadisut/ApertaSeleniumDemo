package JavaProgram;

public class arrayMax {

	public static void main(String[] args) {


		int a[]= {10,30,40,20,60};
		
		int len=a.length;
		int max=a[0];
		
		for(int i=1;i<len;i++) {
			
			if(a[i]>max) {
				
				max=a[i];
				System.out.println(max);
			}
		}

	}

}
