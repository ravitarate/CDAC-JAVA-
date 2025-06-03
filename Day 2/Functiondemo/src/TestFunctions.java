import java.util.Scanner;

public class TestFunctions {
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
		System.out.println("1. Factorial\n2. maxnum\n3.print table\n4.exit choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("enter number");
			int n=sc.nextInt();
			int ans=FunctionService.factorial(n);
			System.out.println("Factorial : "+ans);
			break;
		
		case 2:
			break;
		case 3:
			System.out.println("enter number");
			n=sc.nextInt();
			FunctionService.printTable(n);
			break;
		case 4:
			sc.close();
			System.out.println("Thank you for visiting....");
			//exit the program
			//System.exit(0);
			//to call garbage collector programatically
			//System.gc();
			break;
		default:
			System.out.println("wrong choice");
			break;
			
		}
		}while(choice!=4);

	}

}
