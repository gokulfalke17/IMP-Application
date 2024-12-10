class LCM {
	public static void main(String[] args) {
		
		int num1 = 28;
		int num2 = 30;
		int lcm=0;

	/*	if(num1>num2) {
			lcm = num1;
		}else {
			lcm = num2;
		}

		while(true) {
			if(lcm%num1==0 && lcm%num2==0) {
				break;
			}
			lcm++;
		}  */

		for(int i=num1; ;i++) {
			if(i%num1==0 && i%num2==0) {
				lcm = i;
				break;
			}
		}
		System.out.println("LCM of "+num1+" & "+num2+" is "+lcm);
	}
}