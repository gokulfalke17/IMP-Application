
public class ReverseEachWordFromString {
	
	public static void main(String[] args){
		String str = "Welcome    to India";

		char ch[] = str.toCharArray();

		int start = 0;
		int end = 0;
		for(int i=0;i<str.length();i++){
			
			if(i==str.length()-1 || ch[i] == ' '){
				end = i-1;
				if(i==str.length()-1)
					end = i;
					while(start < end){
						char temp = ch[start];
						ch[start] = ch[end];
						ch[end] = temp;
						start++;
						end--;
				}
				start = i+1;
			}

		}
		String rev = new String(ch);
		System.out.println(rev);
	}
}