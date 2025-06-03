import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import java.text.ParseException;

public class EmployeeService {
	public static Employee[] earr;
	public static int count;
	static {
		earr=new Employee[100];
		earr[0]=new SalariedEmp("Kavita",new Date(),"Hr","mgr",34252);
		earr[1]=new SalariedEmp("Rahul",new Date(),"Admin","Associate",23435);
		earr[2]=new ContractEmp("Ashu",new Date(),"Admin","mgr",23,34252);
		earr[3]=new ContractEmp("Pallavi",new Date(),"Admin","Associate",51,23435);
		count=4;
	}
	public static void addNewEmployee(int ch) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Name= ");
		String nm=sc.nextLine();
		System.out.println("Enter Department=");
		String dt=sc.next();
		System.out.println("Enter Designation=");
		String ds=sc.next();
		System.out.println("enetr date(dd/mm/yyyy)");
		String str=sc.next(); //15/11/2025
		//convert string into date
		SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		Date doj=null;
		try {
		   doj=sdf.parse(str);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
		if(ch==1) {
			System.out.println("Enter Salary=");
			double s=sc.nextDouble();
			earr[count]=new SalariedEmp(nm,doj,dt,ds,s);
			
		}else {
			System.out.println("Enter Charges=");
			double c=sc.nextDouble();
			System.out.println("Enter Hrs=");
			int h=sc.nextInt();
			earr[count]=new ContractEmp(nm,doj,dt,ds,h,c);
		}
		count++;
	}
	public static void displayAll() {
		for(int i=0;i<count;i++) {
			System.out.println(earr[i]);
		}
		
	}
	public static void displayByType(int ch) {
		if(ch==1) {
		for(int i=0;i<count;i++) {
			if(earr[i] instanceof SalariedEmp) {
				System.out.println(earr[i]);
			}
		}
		}else {
			for(int i=0;i<count;i++) {
				if(earr[i] instanceof ContractEmp) {
					System.out.println(earr[i]);
				}
			}
		}
		
	}
	public static double getNetSalary(String id) {
		Employee e=findById(id);
		if(e!=null) {
			return e.calculateSal();
		}
		return 0;
	}
	public static Employee findById(String id) {
		for(int i=0;i<count;i++) {
			if(earr[i].getPid().equalsIgnoreCase(id)) {
				return earr[i];
			}
		}
		return null;
	}
	public static double getEmpBonus(String id) {
		Employee e=findById(id);
		if(e!=null && e instanceof SalariedEmp) {
			return ((SalariedEmp)e).calcBonus(0.30f);
		}
		return 0;
	}
	public static boolean updateSalaryById(String id, double s) {
		Employee e=findById(id);
		if(e!=null) {
			if(e instanceof SalariedEmp ) {
				((SalariedEmp)e).setSal(s);
			}else if(e instanceof ContractEmp){
			     ((ContractEmp)e).setCharges(s);
			}
		   return true;
		}
	     return false;
	}
	
}
