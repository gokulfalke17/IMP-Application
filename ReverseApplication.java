//Program 02
import java.util.Scanner;
class Reverse {
	int num;
	void setValue(int num) {
		this.num = num;
	}

	boolean CheckPerfectNumber() {
		int sum = 0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				sum = sum+i;
			}
		}
		if(sum==num) {
			return true;
		}else{
			return false;
		}
	}

}
public class ReverseApplication {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter Number");
		int num = scn.nextInt();

		Reverse rev = new Reverse();
		rev.setValue(num);
		boolean result = rev.CheckPerfectNumber();

		if(result== true) {
			System.out.println("Is Perfect ");
		}else{
			System.out.println("Is Not Perfect");
		}
	}
}