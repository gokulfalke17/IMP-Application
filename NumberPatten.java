class NumberPatten {
	public static void main(String[] args) {
		for(int i=1; i<=4; i++) {
			int num = i+1;
			for(int j=1; j<=7; j++) {
				if(j>=5-i && j<=3+i) {
					if(j<=4) {
							System.out.print(--num);
					}else {
						System.out.print(++num);
					}
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}