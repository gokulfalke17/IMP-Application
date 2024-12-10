/*	Second Smallest	*/
import java.util.Vector;
class SecondSmallest {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(50);
		v.add(20);
		v.add(10);
		v.add(20);
		v.add(30);
		v.add(40);
		v.add(10);
		v.add(30);
		System.out.println(v);

		int smallest = v.get(0);
		int second = v.get(0);

		for(int i=0;i<v.size()-1; i++) {
			if(smallest > v.get(i)) {
				second = smallest;
				smallest = v.get(i);
			}else if(smallest < v.get(i) && second > v.get(i)) {
				second = v.get(i);
			}
		}
		System.out.println("Smallest :: "+ smallest);
		System.out.println("Second Smallest :: "+ second);
	}
}