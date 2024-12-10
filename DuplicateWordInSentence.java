class  DuplicateWordInSentence {
	public static void main(String[] args) {
		
		String str = "Good Morning, Good Night";
		String s = str.toLowerCase();
		
		System.out.println("String is : \n"+ s);
		String word[] = s.split(" ");
		int count = 0;

		System.out.println("Duplicate Word is : ");
		for(int i=0; i<word.length; i++) {
			count = 1;
			for(int j=i+1; j<word.length; j++) {
				if(word[i].equals(word[j])) {
					count++;
				}
			}
			if(count > 1) {
				System.out.println(word[i]);
			}
		}
	}
}
