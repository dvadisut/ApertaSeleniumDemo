package JavaCollections;

import java.util.HashMap;

public class hashMap {

	public static void main(String[] args) {


		HashMap<Integer,String> hmap=new HashMap<Integer,String>();
		//put
		hmap.put(1, "DHINA");
		hmap.put(2, "KEIZON");
		hmap.put(2, "benz");
		hmap.put(3, "Jackie");
		hmap.put(4, "DUCK");
		
		System.out.println(hmap);
		
		//putall
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.putAll(hmap);
		
		System.out.println(hm);
		
		//clear
		
		hm.clear();
		System.out.println(hm);
		
		//containsKey
		
		boolean status=hmap.containsKey(2);
		System.out.println(status);
		
		//isEmpty
		
		boolean status1=hmap.isEmpty();
		System.out.println(status1);
		
		//keyset
		
		System.out.println(hmap.keySet());
		
		//values
		
		System.out.println(hmap.values());
		
		

	}

}
