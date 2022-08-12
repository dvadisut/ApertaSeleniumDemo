package JavaProgram;

public class StringRemovespecial {

	public static void main(String[] args) {
		
		String s="LATIN hhhh";
		
		//String sremove=s.replaceAll("[^a-zA-z0-9]", "");
		String sremove=s.replaceAll("\\s", "");
		
		
		System.out.println(sremove);

	}

}
