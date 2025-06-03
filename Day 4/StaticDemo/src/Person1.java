
public class Person1 {
	//initialize all static variable
		//static block can be written anywhere in the class
		static {
			count=0;
		}
		private String pid;
		private static int count;
		
		
		private String pname;
		private String mob;
		public Person1() {
			
			this.pid=generateCode(null);
			this.pname=null;
			this.mob=null;
		}
		private String generateCode(String nm) {
			count++;
			return nm.substring(0,3)+count;
		}
		/*public static void m1() {
			System.out.println(pid);
		}*/
		
		public Person1(String nm,String mob) {
			
			this.pid=generateCode(nm);
			this.pname=nm;
			this.mob=mob;
		}
		
		
		public String getPid() {
			return pid;
		}

		public void setPid(String pid) {
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
