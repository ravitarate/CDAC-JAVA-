import java.util.Scanner;

public class TestEmployeeArr {

	public static void main(String[] args) {
		int choice=0;
		Scanner sc=new Scanner(System.in);
		do {
		System.out.println("1. Add new Employee\n 2. Modify salary \n 3.Display all");
		System.out.println("4.Display by id\n 5.Display by type\n6. calculateSalary7.CalculateBonus\n 8.Exit\n Choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:System.out.println("1. SalariedEmp\n 2. ContractEmp");
			int ch=sc.nextInt();
			EmployeeService.addNewEmployee(ch);
			break;
		case 2:
			System.out.println("enter id");
			String id=sc.next();
			System.out.println("enter salary");
			double s=sc.nextDouble();
			boolean status=EmployeeService.updateSalaryById(id,s);
			if(status) {
				System.out.println("updated successfully");
			}else {
				System.out.println("not found");
			}
			break;
		case 3:EmployeeService.displayAll();
			break;
		case 4:
			System.out.println("enter id");
			id=sc.next();
			Employee e=EmployeeService.findById(id);
			if(e!=null) {
				System.out.println(e);
			}else {
				System.out.println("not found");
			}
			break;
		case 5:
			System.out.println("1. SalariedEmp\n 2. ContractEmp");
			ch=sc.nextInt();
			EmployeeService.displayByType(ch);
			
			break;
		case 6:
			System.out.println("enter id");
			id=sc.next();
			double sal=EmployeeService.getNetSalary(id);
			if(sal>0) {
				System.out.println("Salary : "+sal);
			}else {
				System.out.println("not found");
			}
			break;
		case 7:
			System.out.println("enter id");
			 id=sc.next();
			double bonus=EmployeeService.getEmpBonus(id);
			if(bonus>0) {
				System.out.println("Bonus : "+bonus);
			}else {
				System.out.println("not found");
			}
			break;
		case 8:sc.close();
			System.out.println("Thank you for visiting!");
			break;

		default:System.out.println("Wrong Choice");
		}
		}while(choice!=8);

	}

}
