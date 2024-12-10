import java.util.*;
class CustomSortLogic implements Comparator{

	public int compare(Object obj1, Object obj2) {
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;

		if(i1 < i2) {
			return +1;
		}else if(i1 > i2){
			return -1;
		}else {
			return 0;
		}
	}
}
class CustomSort {
	public static void main(String[] args) {
		TreeSet<Object> ts = new TreeSet<>(new CustomSortLogic());
		ts.add(5);
		ts.add(2);
		ts.add(7);
		ts.add(6);
		ts.add(1);
		ts.add(3);
		ts.add(8);
		ts.add(4);
		ts.add(10);
		ts.add(9);
		System.out.println("List is :: ");
		System.out.println(ts);
	}
}