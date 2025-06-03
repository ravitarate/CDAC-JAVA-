import java.util.Scanner;

public class TestDynamicArray {
	public static void acceptData(int[][] arr1) {
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr1.length;i++) {
			System.out.println("enter number of columns for row "+i);
			int col=sc.nextInt();
			arr1[i]=new int[col];
			for(int j=0;j<arr1[i].length;j++) {
				System.out.println("enter number for row "+i+"col : "+j);
				arr1[i][j]=sc.nextInt();
			}
		}
		
	}
	
	private static void displayData(int[][] arr1) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		int[][] arr1=new int[3][];
		acceptData(arr1);
		displayData(arr1);
		

	}

	

	

}
