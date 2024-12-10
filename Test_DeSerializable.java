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

class Test_DeSerializable {
	public static void main(String[] args) throws IOException , ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream("D:\\Anonymous\\Demo123\\1.bat");
		ObjectInputStream ois = new ObjectInputStream(fis);

		Object obj = ois.readObject();

		if(obj!=null) {
			Player p = (Player)obj;
			System.out.println(p.getId()+ " "+ p.getName()+ " "+ p.getRun());
		}else {
			System.out.println("Data Not Found.......");
		}

		ois.close();
		fis.close();
	}
}