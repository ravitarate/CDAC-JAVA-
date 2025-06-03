import java.util.Scanner;

public class ArrayService {
	public static void acceptData(int[] arr) {
		Scanner sc=new Scanner(System.in);
		//accept data
		for(int i=0;i<arr.length;i++) {
		   System.out.println("Enter number "+i);
		   arr[i]=sc.nextInt();
		}
	}
	
	// to find addition of all numbers
	public static int addNumbers(int[] arr) {
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum=sum+arr[i];
		}
		return sum;
	}
	
	//to find maximum number
	//to find min number
	//to find addition of only prime numbers
	
	
	public static void displayData(int[] arr) {
		//display data
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
