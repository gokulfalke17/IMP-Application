public class HollowDiamond {
	public static void main(String[] args){
		int row = 10;
		int k= 14;
		for(int i=1;i<=row;i++){
			for(int j=1;j<=row*2;j++){
				if(i <=row/2){
					if(j==row+1-i || j==row-1+i){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else{
					if(j==i || j==row*2-i){
						System.out.print("*");
						
					}else{
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}