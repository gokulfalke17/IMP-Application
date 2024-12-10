/*	Second Heighest	 */
import java.util.Vector;
class SecondHeighestInVector {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(50);
		v.add(40);
		v.add(20);
		v.add(80);
		v.add(50);
		v.add(80);
		v.add(10);
		v.add(70);
		v.add(70);
		System.out.println("Vector List :: ");
		System.out.println(v);

		int heighest = 0;
		int second = 0;

		for(int i=0;i<v.size()-1; i++) {
			if(heighest < v.get(i)) {
				second = heighest;
				heighest = v.get(i);
			}else if(heighest > v.get(i) && second < v.get(i)) {
				second = v.get(i);
			}
		}
		System.out.println("Heighest :: "+ heighest);
		System.out.println("Second Heighest :: "+ second);
	}
}
