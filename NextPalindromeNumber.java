class NextPalindromeNumber {
	public static void main(String[] args) {
		
		int num = 131;
		while(true) {
			num++;
			int temp = num;
			int rev = 0;
			 
			while(temp!=0) {
				int rem = temp%10;
				rev = rev*10+rem;
				temp = temp/10;
			}

			if(rev == num) {
				System.out.println(num);
				break;
			}
		}
	}
}