
public class Person {
	private int pid;
	private String pname;
	private String mob;
	//default constructor
	//1 parameter is implicitly passed
	public Person(){
		pid=0;
		pname=null;
		mob=null;
		
	}
	//parametrized constructor
	public Person(int pid,String nm,String mob){
		this.pid=pid;
		this.pname=nm;
		this.mob=mob;
		
	}
	//parametrized constructor
		public Person(int pid){
			this.pid=pid;
			this.pname=null;
			this.mob=null;
			
		}
		//setter methods
		public void setPid(int p) {
			this.pid=p;
		}
		public void setPname(String pnm) {
			this.pname=pnm;
		}
		public void setMobile(String m) {
			this.mob=m;
		}
		//getter method
		public int getPid() {
			return this.pid;
		}
		
		public String getPname() {
			return pname;
		}
		public String getMobile() {
			return mob;
		}
		
		public String toString() {
			System.out.println("in tostring method");
			return "Id : "+pid+" Name: "+pname+" Mobile: "+mob;
			//return pid+","+pname+","+mob;
			
		}
		
//		public void displayPerson() {
//			System.out.println("Pid: "+pid);
//			System.out.println("Name : "+pname);
//			System.out.println("Mobile : "+mob);
//		}

}
