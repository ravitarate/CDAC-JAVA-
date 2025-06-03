import java.util.Date;

public class ContractEmp extends Employee{
	private int hrs;
	private double charges;
	public ContractEmp() {
		System.out.println("in contractemp default constructor");
		hrs=0;
		charges=0;
		
	}
	public ContractEmp(String nm,Date dat,String dt,String ds,int h,double charges) {
		super("c",nm,dat,dt,ds);
		System.out.println("in contractemp parametrized  constructor");
		this.hrs=h;
		this.charges=charges;
		
	}
	
	public void setHrs(int h) {
		hrs=h;
	}
	public void setCharges(double c) {
		charges=c;
	}
	public int getHrs() {
		return hrs;
	}
	public double getcharges() {
		return charges;
	}
	
	public String toString() {
		return super.toString()+" Hrs: "+hrs+" Charges: "+charges;
	}
	

}










