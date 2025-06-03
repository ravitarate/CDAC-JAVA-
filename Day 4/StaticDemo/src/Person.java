
public class Person {
	//initialize all static variable
	//static block can be written anywhere in the class
	static {
		count=0;
	}
	private int pid;
	private static int count;
	
	
	private String pname;
	private String mob;
	public Person() {
		count++;
		this.pid=count;
		this.pname=null;
		this.mob=null;
	}
	/*public static void m1() {
		System.out.println(pid);
	}*/
	
	public Person(String nm,String mob) {
		count++;
		this.pid=count;
		this.pname=nm;
		this.mob=mob;
	}
	
	
	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	public String toString() {
		System.out.println("in tostring method");
		return "Id : "+pid+" Name: "+pname+" Mobile: "+mob;
		//return pid+","+pname+","+mob;
		
	}

}
