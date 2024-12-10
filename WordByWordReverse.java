/*
Enter String ::
welcome to girish tech hub
Before Reverse Word By Word String
welcome to girish tech hub
After Reverse Word By Word String
emoclew ot hsirig hcet buh
*/

import java.util.Scanner;
class WordByWordReverse  {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String :: ");
		String str = scn.nextLine();

		char ch[] = str.toCharArray();
		//reverse word by word
		int start = 0;
		int end = 0;
		for(int i=0;i<str.length();i++) {
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

		 // reverse last word
        end = ch.length-1;
        while(start<end) {
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }


		String s = new String(ch);
		System.out.println("Before Reverse Word By Word String");
		System.out.println(str);
		System.out.println("After Reverse Word By Word String");
		System.out.println(s);
	}
}
