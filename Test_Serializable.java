import java.io.*;
class Player implements Serializable {
	private int id;
	private String name;
	private int run;

	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setRun(int run) {
		this.run = run;
	}
	public int getRun() {
		return run;
	}
}

class Test_Serializable {
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout = new FileOutputStream("D:\\Anonymous\\Demo123\\1.bat");
		ObjectOutput oout = new ObjectOutputStream(fout);

		Player p = new Player();
		p.setId(101);
		p.setName("ABC");
		p.setRun(5000);

		oout.writeObject(p);
		oout.close();
		fout.close();

		System.out.println("Write Data Successfully...........");
	}
}