import java.util.Scanner;

public class Array2DService {
	public static void acceptData(int[][] arr) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++){// rows
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter number for row "+i+" column "+j);
				arr[i][j]=sc.nextInt();
			}
		}
		sc.close();
		}

	public static void displayData(int[][] arr) {
		for(int i=0;i<arr.length;i++){// rows
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}
	
	//find sum of all numbers
	//find rowwise sum
	//find columnwise sum
	//display transpose of array
	//add 2 array
	//multiply 2 arrays
	
	

}
