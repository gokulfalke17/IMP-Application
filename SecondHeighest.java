class SecondHeighest {
	public static void main(String[] args) {
		
		int arr[] = new int[]{20,35,67,28,35,98,18};

		System.out.println("Array Elements Are ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		int heighest = 0;
		int second = 0;

		for(int i=0;i<arr.length;i++) {
			if(heighest < arr[i]) {
				second = heighest;
				heighest = arr[i];
			}else if(heighest>arr[i] && second<arr[i]) {
				second = arr[i];
			}
		}
		System.out.println("Heighest Elements is :"+heighest);
		System.out.println("Second Heighest Elements is :"+second);
	}
}