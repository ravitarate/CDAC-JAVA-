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
		
		}

	public static void displayData(int[][] arr) {
		for(int i=0;i<arr.length;i++){// rows
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
	}

	public static int[] addRowwise(int[][] arr) {
		int[] sumarr=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			sumarr[i]=0;
			for(int j=0;j<arr[i].length;j++) {
				sumarr[i]+=arr[i][j];
			}
		}
		return sumarr;
	}
	
	public static int[] addColumnwise(int[][] arr) {
		int[] sumarr=new int[arr[0].length]; //3
		for(int i=0;i<arr[0].length;i++) {//column
			sumarr[i]=0;
			for(int j=0;j<arr.length;j++) {//rows
				sumarr[i]+=arr[j][i];
				
			}
		}
		return sumarr;
	}
	//find sum of all numbers
	//find rowwise sum
	//find columnwise sum
	//display transpose of array
	//add 2 array
	//multiply 2 arrays

	public static int[][] addTwoArrays(int[][] arr, int[][] arr1) {
		int[][] sumarr=new int[arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[0].length;j++) {
				sumarr[i][j]=arr[i][j]+arr1[i][j];			
			}
		}
		return sumarr;
	}
	
	

}
