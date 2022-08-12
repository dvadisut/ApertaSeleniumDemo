package JavaCollections;

import java.util.TreeSet;

public class treeSet {

	public static void main(String[] args) {
		
		TreeSet st=new TreeSet();
		
		//add
		st.add(10);
		st.add(9);
		st.add(8);
		st.add(7);
		st.add(6);
		st.add(5);
		st.add(4);
		st.add(3);
		System.out.println(st);
		
		//headset
		
		System.out.println("HEADSET "+st.headSet(5));
		
		//tailset
		System.out.println("TAILSET "+st.tailSet(9));
		
		//first
		
		System.out.println("FIRST METHOD "+st.first());
		
		//last
		
		System.out.println("FIRST METHOD "+st.last());
		
		//pollfirst
		System.out.println("POLL FIRST "+st.pollFirst());
		
		//polllast
				System.out.println("POLL LAST "+st.pollLast());
		System.out.println(st);

	}

}
