import java.util.*;
class myComparator implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;

		//sorting list as per user requirements
/*
		if(I1 < I2) {
			return +1;
		}else if(I1 > I2) {
			return -1;
		}else {
			return 0;
		}
*/
		//return I1.compareTo(I2);	//default sorting Order(Ascending Order)
		//return -I1.compareTo(I2);	 //(Descending Order)
		//return I2.compareTo(I1);	//(Descending Order)
		//return -I2.compareTo(I1);		//default sorting Order(Ascending Order)
		//return +1;	//Insertion Order not maintain order
		//return -1;		//reverse of Insertion Order
		return 0;			//stores only one element			
									//here all elements considered as duplicates

	
	}
}

class ComSortList {
	public static void main(String[] args) {
		TreeSet list = new TreeSet(new myComparator());
		list.add(30);
		list.add(10);
		list.add(50);
		list.add(20);
		list.add(60);
		list.add(40);
		System.out.println("List is :: ");
		System.out.println(list);
	}
}