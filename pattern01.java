/*
123456789
   1234567
      12345
         123
           1
*/
class pattern01 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			int k=1;
			for(int j=1;j<=9;j++) {
				if(j>=i && j<=10-i) {
					System.out.print(k++);
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}