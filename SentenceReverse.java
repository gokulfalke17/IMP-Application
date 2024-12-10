/*
Enter String ::
welcome to girish tech hub
Before Reverse Sentence String ::
welcome to girish tech hub
After Reverse Sentence String ::
hub tech girish to welcome
*/
import java.util.Scanner;
class SentenceReverse {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		//reverse string 
		String rev = "";
		for(int i=str.length()-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}

		char ch[] = rev.toCharArray();
		int start = 0;
		int end = 0;
		for(int i=0;i<rev.length();i++) {
			if(ch[i]==' '){
				end = i-1;
				while(start<end) {
					char temp  = ch[start];
					ch[start] = ch[end];
					ch[end] = temp;
					start++;
					end--;
				}
				start = i+1;
			}
		}
		

		//last word reverse logic
		end  = ch.length-1;
		while(start<end) {
			char temp = ch[start];
			ch[start] = ch[end];
			ch[end] = temp;
			start++;
			end--;
		}
		
		//converting chr to string
		String s = new String(ch);

		System.out.println("Before Reverse Sentence String :: ");
		System.out.println(str);
		System.out.println("After Reverse Sentence String :: ");
		System.out.println(s);
	}
}
