import java.util.*;
class SetClasses {
	public static void main(String[] args) {
		//HashSet list = new HashSet();		//It stores elements in hashing order and it stores only unique object,  
																			//dose not maintain insertion order
		//LinkedHashSet list = new LinkedHashSet();	//it stores elements in insertion order and stores 
																							  //only unique object	
		TreeSet list = new TreeSet();	//It stores elements in sorting order and it stores only unique objects,
																	//it maintain sorting order
		list.add(10);
		list.add(100);
		list.add(20);
		list.add(5);
		list.add(500);
		list.add(1000);
		list.add(5);
		list.add(23000);
		list.add(10);
		list.add(35);
		System.out.println("List is ");
		System.out.println(list);

		
	}
}