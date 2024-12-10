import java.util.*;
class  SortArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(50);
		list.add(30);
		list.add(10);
		list.add(80);
		list.add(20);
		list.add(70);
		list.add(40);
		list.add(60);
		System.out.println("List is  :: ");
		System.out.println(list);

		for(int i=0; i<list.size(); i++) {
			for(int j=i+1; j<list.size(); j++) {
				if(list.get(i) > list.get(j)) {
					int temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}

		System.out.println("After Sorting List :: ");
		System.out.println(list);
	}	
}