package JavaCollections;

import java.util.HashSet;

public class hastSet {

	public static void main(String[] args) {


		HashSet<String> hs=new HashSet<String>();
		HashSet<String> ht=new HashSet<String>();
		//add
		hs.add("geetha");
		hs.add("melwin");
		hs.add("algebra");
		hs.add("maths");
		
		ht.add("geetha");
		ht.add("melwin");
		ht.add("algebra");
		ht.add("maths");
		System.out.println(hs);
		
		//remove
		hs.remove("maths");
		System.out.println(hs);
		
		//removeAll
		hs.removeAll(hs);
		System.out.println(hs);
		
		//contains
		Boolean b=hs.contains("melwin");
		System.out.println(b);
		
		//containsAll
		Boolean b1=hs.containsAll(ht);
		System.out.println(b1);
		
		
		
	}

}
