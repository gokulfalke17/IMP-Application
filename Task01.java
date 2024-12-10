/* Good Morning Pune */
class Task01 {
	public static void main(String[] args) {
		
		String str = "goOD moRNinG PuNE";
		//Good Morning Pune

		String	 s1 = str.toLowerCase();
		char ch[] = s1.toCharArray();
		ch[0] = (char)(ch[0]-32);
		for(int i =0;i<ch.length;i++){
				if(ch[i]==32){
					ch[i+1] = (char)(ch[i+1]-32);
				}	
		}

		System.out.println(new String(ch));
		
	}
}


