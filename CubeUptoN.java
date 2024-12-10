import java.util.Scanner;
class CubeUptoN {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Limit :: ");
		int limit = scn.nextInt();
		int cube = 0;
		System.out.println("Cubes Are :: ");
		for(int i=1; i<=limit; i++) {
			cube = i*i*i;
			System.out.print(cube+" ");
		}
		System.out.println();
	}
}