/*
program2
*/
import java.util.*;
class Reverse {
	int num;
	void setValue(int num) {
		this.num = num;
	}
	//method
	boolean checkPerfect(int num){
		int sum = 0;
		//perfect Number logic
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		if(sum == num) {
			return true;
		}else {
			return false;
		}

	}
}
public class ReverseApp {
	
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		//taken by number from user
		System.out.println("Enter Number ");
		int num = scn.nextInt();
		
		//object creation
		Reverse rev = new Reverse();

		rev.setValue(num);
		
		//return boolean value as true and false
		boolean result = rev.checkPerfect(num);
		
		//print prefect or not
		if(result==true) {
			System.out.println("Is Perfect");
		}else {
			System.out.println("Is Not Perfect");
		}

	}
}