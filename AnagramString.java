class AnagramString {
	public static void main(String[] args) {
		
		String str1 = "anuj";
		String str2 = "juna";
		boolean flag = false;
		if(str1.length()==str2.length()) {
			int count1 = 0;
			int count2 = 0;
			for(int i=0;i<str1.length();i++) {
				for(int j=0;j<str2.length();j++) {
					if(str1.charAt(i)==str1.charAt(j)) {
						count1++;
					}
					if(str1.charAt(i)==str2.charAt(j)){
						count2++;
					}
				}
				if(count1==count2) {
					flag = true;
				}else {
					flag = false;
					break;
				}
			}
			if(flag) {
				System.out.println("Is Anagram String");
			}else {
				System.out.println("Is Not Anagram String");
			}

		}else {
			System.out.println("Length is Not match Not Anagram String");
		}
	}
}	