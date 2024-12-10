class ReverseEachWord {
	public static void main(String[] args) {
		
		String str = "welcome to india";

		char ch[] = str.toCharArray();

		int start = 0;
		int end = 0;

		for(int i=0;i<ch.length;i++) {
			if(ch[i]==' ') { 
				end = i-1;
				while(start<end) {
					char temp = ch[start];
					ch[start] = ch[end];
					ch[end] = temp;
					start++;
					end--;
				}
				start = i+1;
			}
			

		}

			end = ch.length-1;
			while(start<end) {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end] = temp;
				start++;
				end--;
			}

		String s = new String(ch);
		System.out.println(s);
	}
}