package JavaCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {

	//Array list is the implementation class for interface list
	public static void main(String[] args) {
		
		ArrayList<String> arr= new ArrayList<String>();
		
		//add method
		arr.add("geetha");
		arr.add("dhina");
		System.out.println(arr);
		
		//add all method
		ArrayList<String> arr_add_all= new ArrayList<String>();
		arr_add_all.add("melwin");
		arr_add_all.addAll(arr);
		
		System.out.println(arr_add_all);
		
		//add in specific index
		ArrayList<String> arr_index= new ArrayList<String>();
		arr_index.add(0, "jackie");
		arr_index.addAll(arr_add_all);
		System.out.println(arr_index);
		
		//remove 
		ArrayList<String> arr_remove= new ArrayList<String>();
		arr_remove.add("remove");
		arr_remove.remove("remove");
		System.out.println(arr_remove);
		
		//removeAll 
				ArrayList<String> arr_removeall= new ArrayList<String>();
				arr_removeall.add("remove");
				arr_removeall.add("numble");
				System.out.println("Before using remove all");
				System.out.println(arr_removeall);
				System.out.println("After using remove all");
				arr_removeall.removeAll(arr_removeall);
				
				//Clear+set
				ArrayList<String> arr_clear= new ArrayList<String>();
				arr_clear.add("remove");
				arr_clear.add("numble");
				arr_clear.add("keiva");
				arr_clear.set(0, "im set");
				System.out.println("Before using clear");
				System.out.println(arr_clear);
				System.out.println("After using clear");
				arr_clear.removeAll(arr_clear);
				System.out.println(arr_clear);
				
				//Contains+containsAll
				ArrayList<String> arr_contain= new ArrayList<String>();
				arr_contain.addAll(arr_index);
				Boolean status =arr_contain.contains("geetha");
				System.out.println(status);
				Boolean status1=arr_contain.containsAll(arr_index);
				System.out.println(status1);
				
				//isempty
				
				System.out.println(arr_contain.isEmpty());
				
				
				//listiterator
				
				ListIterator<String> it=arr_index.listIterator();
				
				while(it.hasNext()) {
					
					System.out.println("the list displayed using listiterator "+it.next());
				}
				
               while(it.hasPrevious()) {
					
					System.out.println("the list displayed using previous listiterator "+it.previous());
				}
               
               //iterator
               
               Iterator<String> iterate=arr_index.iterator();
               
               while(iterate.hasNext()) {
            	   System.out.println("the list displayed using iterator "+iterate.next());
            	   
               }
	}

}
