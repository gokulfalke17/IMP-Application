class CountNumberOccurrence {
	public static void main(String[] args) {
		int num = 12345234;

		for(int i=0; i<=10; i++) {
			int temp = num;
			int count = 0;
			while(temp!=0) {
				int rem = temp%10;
				if(rem == i) {
					count++;
				}	
				temp = temp/10;
			}
			if(count > 0) {
				System.out.println(i+"---->"+count);
			}
		}
	} 
}