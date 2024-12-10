class ReverseIndexByIndex {
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{123, 568, 978, 751, 341, 554};
		
		System.out.println("Without Doing Any Operation in Array ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		//array reverse index by index
		for(int i=0;i<arr.length;i++) { 
			//int num = arr[i];
			int rev = 0;
			while(arr[i]!=0) { //123 //12 //1
				int rem = arr[i]%10; //3 //2 //1
				rev = rev*10+rem; //0*10+3=3 //3*10+2=32 //32*10+1=321
				arr[i] = arr[i]/10; //123/10=12 12/10=1 0
			}
			arr[i] = rev;  //321
		}

		System.out.println("After Reversing Array Index by Index Elements ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}