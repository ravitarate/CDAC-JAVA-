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

	public static int addPrimeNumbers(int[] arr) {
		int s=0;
		for(int i=0;i<arr.length;i++) {
			if(isPrime(arr[i]))
				s=s+arr[i];
		}
		return s;
		
	}

	private static boolean isPrime(int num) {
		for(int i=2;i<num;i++) {
			if(num%i==0)
				return false;
		}
		return true;
	}

}
