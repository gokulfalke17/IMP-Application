//s3-3
import java.util.Scanner;
class Player {
	
	private int id;
	private String name;
	private int run;
	
	//contrutor
	public Player(int id, String name, int run) {
		this.id = id;
		this.name = name;
		this.run = run;
	}

	public int getId() {
		return id;
	}


	public String getName() {
		return name;
	}

	public int getRun() {
		return run;
	}
}

public class PlayerApp {
	
	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		//player array
		Player p[] = new Player[5];
		Player player;

		for(int i=0;i<p.length;i++) {
			System.out.println("Enter id ");
			int id = scn.nextInt();

			System.out.println("Enter Name ");
			String name = scn.next();
			scn.nextLine();

			System.out.println("Enter Run ");
			int run= scn.nextInt();
			p[i] = new Player(id,name,run);
		}

		//palyer details

		System.out.println("Id \t Name \t Run ");
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].getId()+" "+p[i].getName()+" "+p[i].getRun());
		}
		System.out.println();
		
		//sort id wise
		for(int i=0;i<p.length;i++) {
			for(int j=i+1;j<p.length;j++) {
				if(p[i].getId() > p[j].getId()) {
					Player temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}

		System.out.println("After Sorting Player Records By Id Wise ");
		System.out.println("Id \t Name \t Run ");
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].getId()+" "+p[i].getName()+" "+p[i].getRun());
		}
		System.out.println();


/*	//sort run wise
		for(int i=0;i<p.length;i++) {
			for(int j=i+1;j<p.length;j++) {
				if(p[i].getRun() > p[j].getRun()) {
					Player temp = p[i];
					p[i] = p[j];
					p[j] = temp;
				}
			}
		}

		System.out.println("After Sorting Player Records By Id Wise ");

		System.out.println("Id \t Name \t Run ");
		for(int i=0;i<p.length;i++) {
			System.out.println(p[i].getId()+" "+p[i].getName()+" "+p[i].getRun());
		}
		System.out.println();
*/


	}
}