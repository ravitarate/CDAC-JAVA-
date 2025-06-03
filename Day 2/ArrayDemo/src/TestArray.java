import java.util.Scanner;

public class TestArray {

	public static void main(String[] args) {
		int[] d=new int[5];
		Scanner sc=new Scanner(System.in);
		int[] arr= {12,34,56}; //initialization
		ArrayService.acceptData(d);
		ArrayService.displayData(d);
		//convert it to menu driven program
		ArrayService.addNumbers(d);
		
		}
		

}
