package JavaProgram;

public class numberSum {

	public static void main(String[] args) {


		int num=12;
		
		int sum=0;
		
		while(num!=0) {
			
			sum=sum+num%10;    //0+6=6 //6+5=11 //11+4
			num=num/10;
		}

		System.out.println(sum);
	}

}
