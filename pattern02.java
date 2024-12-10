/*
1234567
   23456
      345
        4
     543
  65432
7654321
*/
class pattern02 {
	public static void main(String[] args ) {

		for(int i=1;i<=7;i++) {
			int k=i;
			int l =i;
			for(int j=1;j<=7;j++) {
				if(i<=7/2+1) {
					if(j>=i && j<=8-i) {
						System.out.print(k++);
					}else{
						System.out.print(" ");
					}
					l=k;
				}else {
					if(j>=8-i && j<=i) {
						System.out.print(l--);
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}