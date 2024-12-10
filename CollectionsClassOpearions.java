import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
class CollectionsClassOpearions {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(10);
		list.add(5);
		list.add(20);
		list.add(15);
		list.add(20);
		list.add(5);
		System.out.println("List Before Sorting :: ");
		System.out.println(list);

		Collections.sort(list);
		System.out.println("List After Sorting :: ");
		System.out.println(list);
		System.out.println();
		System.out.println("Min and Max Values in List :: ");
		System.out.println("Max is "+ Collections.max(list));
		System.out.println("Min is "+ Collections.min(list));
		System.out.println();
		System.out.println("Reverse List :: ");
		Collections.reverse(list);
		System.out.println(list);
	}
}