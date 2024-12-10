//Remove Duplicate Elements int Given Array
//1,2,3,1,2,3,4,5

class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		int arr[] = new int[]{1,2,3,1,2,3,4,5};
		System.out.println("Without Doing Any Operations on Array ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
			
		int length = 0;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-count;j++) {
				if(arr[i]==arr[j]) {
					for(int k=j;k<(arr.length-1)-count;k++) {
						
						arr[k] = arr[k+1];
					}
					j--;
					count++;
				}
			}
		}
		System.out.println("After Removing Duplicate in Array ");
		for(int i=0;i<arr.length-count;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}