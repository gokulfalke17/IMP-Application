class ExamPattern02 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			char ch = 'A';
			for(int j=1;j<=10;j++) {
				if(j<=i || j>=11-i) {
					if(j<=5) {
						System.out.print(ch++);
					}else {
						System.out.print(--ch);
					}

				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}