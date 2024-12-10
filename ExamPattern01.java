/*
1
1 * 2
1 * 2 * 3
1 * 2 * 3 * 4
4 * 3 * 2 * 1
3 * 2 * 1 
2 *  1 
1 

*
* * *
* * * * *
* * * * * * *
* * * * * * * 
* * * * * 
* * *
*

*/


class ExamPattern01 {
	public static void main(String[] args) {
		
		for(int i=1;i<=8;i++) {
			int k=1;
			for(int j=1;j<=7;j++) {
				if(i<=8/2) {
					if(j<=i*2-1) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}else {
					if(true){
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}