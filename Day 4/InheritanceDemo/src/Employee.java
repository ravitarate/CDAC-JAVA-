import java.util.Date;

public class Employee extends Person{
	private String dept;
	private String desg;
	public Employee() {
		System.out.println("in employee default constructor");
		dept=null;
		desg=null;
	}
	public Employee(String type,String nm,Date dat,String dt,String ds){
		///to call parents paramestrised constructor
		super(type,nm,dat);
		System.out.println("in employee parametrised constructor");
		this.dept=dt;
		this.desg=ds;
	}
	public void setDept(String dt) {
		this.dept=dt;
	}
	public void setDesg(String ds) {
		this.desg=ds;
	}
	public String getDept() {
		return this.dept;
	}
	public String getDesg() {
		return this.desg;
	}
	public String toString() {
		return super.toString()+" Dept : "+this.dept+"Desg :"+this.desg;
	}
	

}
