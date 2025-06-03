import java.util.Date;
import java.util.Scanner;

public class TestEmployee2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. SalariedEmp\n 2.ContractEmp\n3.exit\nchoice:");
		int choice=sc.nextInt();
		Employee e=null;
		switch(choice) {
		case 1:
			e=new SalariedEmp("xxxx",new Date(),"hr","mgr",34567);
			//while calling child specific method use explicit typecasting
			System.out.println(((SalariedEmp)e).calcBonus(0.20f));
			System.out.println(e instanceof Employee);
			System.out.println(e instanceof SalariedEmp);
			System.out.println(e instanceof Person);
			break;
		case 2:
			e=new ContractEmp("yyyyy",new Date(),"admin","VP",45,134567);
			
			break;
		}
		System.out.println(e.calculateSal());
		
		
	}

}
