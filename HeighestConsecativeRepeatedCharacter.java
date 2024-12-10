/*	Heighest Consecative Repeated Character and Count  	*/
											  
class HeighestConsecativeRepeatedCharacter {
	public static void main(String[] args) {
		String str = "abaccaaadaddddbbbd";
		//String str = "aacccaacbbbbbccccccdbddd";
		char ch[] = str.toCharArray();

		int max = 0;
		char cons = 0;
		for(int i=0; i<ch.length; i++) {
			int count = 1;
			for(int j=i+1; j<ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
				}else {
					break;
				}
			}
				if(count > max) {
					max = count;
					cons = ch[i];
				}
		}
		System.out.println("Consecative Repeated Character Count is : "+ max);
		System.out.println("Consecative Repeated Character is : "+ cons);
	}
}

/*

	try{
			System.out.println("Hello");
			throw new Exception("msg");
		}catch(Exception e){
			System.out.println("e. catched");

		}catch(UserDefienedException ude){
			System.out.println("ude . catched");
		}

*/