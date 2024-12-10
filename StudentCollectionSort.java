import java.util.*;
class SortById implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		//DESC order By Id Wise
		if(s1.getId() < s2.getId()) {
			return +1;
		}else if(s1.getId() > s2.getId()) {
			return-1;
		}else {
			return 0;
		}
	}
}

class SortByPer implements Comparator {
	public int compare(Object obj1, Object obj2) {
		Student s1 = (Student)obj1;
		Student s2 = (Student)obj2;
		//DESC order By Per Wise
		if(s1.getPer() > s2.getPer()) {
			return +1;
		}else if(s1.getPer() < s2.getPer()) {
			return -1;
		}else {
			return 0;
		}
	}
}

class Student {
	int id;
	String name;
	double per;

	public Student(int id, String name, double per) {
		this.id = id;
		this.name = name;
		this.per = per;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setPer(int per){
		this.per = per;
	}

	public double getPer() {
		return per;
	}
}
class StudentCollectionSort {
	public static void main(String[] args) {
		Student s1 = new Student(101, "ABC", 90.35);
		Student s2 = new Student(105, "MNO", 47.10);
		Student s3 = new Student(103, "PQR", 50.39);
		Student s4 = new Student(102, "STV", 80.00);
		Student s5 = new Student(104, "XYZ", 69.89);
		ArrayList al = new ArrayList();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		System.out.println("List Before Sorting :: ");
		for(Object obj : al) {
			Student s = (Student)obj;
			System.out.println(s.getId()+" "+s.getName()+" "+s.getPer());
		}
		System.out.println();

		SortById sid = new SortById();
		Collections.sort(al, sid);
		
		System.out.println("List After Sorting By Id Wise :: (DESC Order ) ");
		for(Object obj : al) {
			Student s = (Student)obj;
			System.out.println(s.getId()+" "+s.getName()+" "+s.getPer()); 
		}
		System.out.println();

		SortByPer sper = new SortByPer();
		Collections.sort(al, sper);

		System.out.println("List After Sorting By Per Wise :: (ASC Order ) ");
		for(Object obj : al) {
			Student s = (Student)obj;
			System.out.println(s.getId()+" "+s.getName()+" "+s.getPer());
		}


	}
}