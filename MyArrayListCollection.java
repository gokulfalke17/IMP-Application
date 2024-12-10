import java.util.ArrayList;

class MyArrayListCollection {
	
	private Object data[];

	private int dataCount;

	public MyArrayListCollection() {
		data = new Object[10];
	}


	public void add(Object obj) {
		if(size() == data.length) {
			increaseCapacity();
		}
		data[dataCount] = obj;
		dataCount++;
	}

	public boolean isEmpty() {
		if(size()==0) 
			return true;

		return false;
	}


	public void increaseCapacity() {
		Object newData[] = new Object[data.length + (data.length >> 1)];

		for(int i=0; i<data.length; i++) {
			newData[i] = data[i];
		}

		data = newData;
	}


	public int size() {
		return dataCount;
	}

	@Override
	public String toString() {
		if(dataCount == 0) {
			return "[]";
		}
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<dataCount; i++) {
			sb.append(data[i]);
			sb.append(", ");
		}
		int index = sb.lastIndexOf(", ");
		sb.delete(index, index+2);
		sb.append("]");
		return sb.toString();
	}


	public boolean contains(Object obj) {
		return indexOf(obj)>=0;
	}
	

	public int indexOf(Object obj) {
		if(obj == null) {
			for(int i=0; i<data.length; i++) {
				if(obj == data[i]) 
					return i;
			}
			return -1;
		}else {
			for(int i=0; i<data.length; i++) {
				if(obj.equals(data[i])) 
					return i;
			}
		}
		return -1;
	}

	public int lastIndexOf(Object obj) {
		if(obj == null) {
			for(int i=data.length-1; i>0; i--) {
				if(obj == data[i]) 
					return i;
			}
			return -1;
		}else {
			for(int i=data.length-1; i>0; i--) {
				if(obj.equals(data[i])) 
					return i;
			}
		}
		return -1;
	}

	public Object get(int index) {
		checkIndex(index);

		return data[index];
	}

	public Object remove(int index) {
		checkIndex(index);

		Object element = data[index];
		for(int i=index; i<dataCount-1; i++) {
			data[i] = data[i+1];
		}
		data[dataCount-1] = null;
		dataCount--;
		return element;
	}

	public boolean remove(Object obj) {
		int index = indexOf(obj);
		if(index>0) {
			checkIndex(index);

			Object element = data[index];
			for(int i=index; i<dataCount-1; i++) {
				data[i] = data[i+1];
			}
			data[dataCount-1] = null;
			dataCount--;

			return true;
		}
		return false;
	}

	public void insert(int index, Object obj) {
		if(index < 0 || index >  dataCount)
			throw new IndexOutOfBoundsException(index);

		if(size() == dataCount) {
			increaseCapacity();
		}

		for(int i=dataCount-1; i>=index; i--) {
			data[i+1] = data[i];
		}
		data[index] = obj;
		dataCount++;

	}	


	public Object set(int index, Object obj) {
		if(index < 0 || index > dataCount) 
			throw new IndexOutOfBoundsException(index);

		Object ele = data[index];
		data[index] = obj;

		return ele;
	}

	
	public void checkIndex(int index) {
		if(index < 0 || index >= dataCount) {
				throw new IndexOutOfBoundsException(index);
			}
	}

	//array capacity manually there is not inbuilt method in array list
	public void capacityLen() {
		int count = 0;
		for(int i=0;i<data.length; i++) {
			count++;
		}
		System.out.println("Array List Capacity is :: " +count);
	}

	public static void main(String[] args) {
		
		MyArrayListCollection al = new MyArrayListCollection();
		//ArrayList al = new ArrayList();
		System.out.println("Size :: "+ al.size());
		System.out.println("Elements :: "+ al);
		System.out.println();

		al.add(10);	
		al.add("a");	
		al.add("b");
		al.add(20);
		al.add(true);
		al.add(null);
		al.add('p');
		al.add("a");
		al.add(null);
		al.add(10);
		System.out.println();
		System.out.println("Size :: "+ al.size());
		System.out.println("Elements :: "+ al);
		System.out.println();

		al.add("a");
		System.out.println("Elements :: "+ al);
		System.out.println();
		System.out.println(al.isEmpty());	//false
		
		System.out.println();
		System.out.println(al.contains("a"));		//true		
		System.out.println(al.contains(null));	//true
		System.out.println(al.contains(new String("a")));	//true
		System.out.println(al.contains(5));	//false
		System.out.println();

		System.out.println(al.indexOf("a"));	//1
		System.out.println(al.indexOf(new Integer(10)));	//0
		System.out.println(al.indexOf(null));	//5
		System.out.println(al.indexOf(5));	//-1
		System.out.println();
		
		System.out.println(al.lastIndexOf("a"));	//10
		System.out.println(al.lastIndexOf(10));	//9
		System.out.println(al.lastIndexOf(new Character('p')));	//6
		System.out.println();

		System.out.println(al.get(5));	//null
		System.out.println(al.get(1));	//a
		System.out.println(al.get(9));	//10
		//System.out.println(al.get(-1));		//IndexOutOfBoundsException
		//System.out.println(al.get(15));	//IndexOutOfBoundsException
		System.out.println();
		
		System.out.println(al);
		System.out.println(al.remove(3));	// 3 index element 20 is removed
		System.out.println(al);
		System.out.println();
			
		System.out.println(al);
		System.out.println(al.remove("b"));	//b is removed
		System.out.println(al);
		System.out.println();
		
		al.insert(5, "XYZ");	//5 index insert XYZ object
		System.out.println(al);
		System.out.println();

		al.set(3, "PPP");	//3 index elements replace and stored values PPP object
		System.out.println(al);
		System.out.println();
		
		//array capacity 
		al.capacityLen();
		System.out.println();

	}

}