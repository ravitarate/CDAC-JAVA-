import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enetr length of array");
		int size=sc.nextInt();
		int[] arr=new int[size];
		
		//int[] arr= {12,34,56}; //initialization
		int choice=0;
		do {
			System.out.println("1. acceptdata \n2. Display data\n3.addition of prime numbers\n4.exit\nchoice");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				ArrayService.acceptData(arr);
				break;
			case 2:
				ArrayService.displayData(arr);
				break;
				
			case 3:
				int s=ArrayService.addPrimeNumbers(arr);
				System.out.println("Addition : "+s);
				break;
			case 4:
				sc.close();
				System.out.println("Thank you for visiting......");
				break;
			default:
				System.out.println("wrong choice");
			}
		}while(choice!=4);
		
		}
		

}
