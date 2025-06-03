import java.util.Scanner;

public class Test2DArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[5][3];
		int choice=0;
		do {
			System.out.println("1. accept data\n2. display data\n 3. rowwise sum");
			System.out.println("4. columnwise sum\n5. add 2 arrays\n6.exit\nchoice:");
			choice=sc.nextInt();
			switch(choice) {
			case 1:
				Array2DService.acceptData(arr);
				break;
			case 2:
				Array2DService.displayData(arr);
				break;
			case 3:
				int[] sumarr=Array2DService.addRowwise(arr);
				for(int i=0;i<sumarr.length;i++) {
					System.out.println("Row "+i+"==>"+sumarr[i]);	
				}
				break;
			case 4:
				sumarr=Array2DService.addColumnwise(arr);
				for(int i=0;i<sumarr.length;i++) {
					System.out.println("column "+i+"==>"+sumarr[i]);	
				}
				break;
			case 5:
				int[][] arr1=new int[arr.length][arr[0].length];
				Array2DService.acceptData(arr1);
				Array2DService.displayData(arr1);
				int[][] sumarr1=Array2DService.addTwoArrays(arr,arr1);
				Array2DService.displayData(sumarr1);
				break;
			case 6:
				sc.close();
				System.out.println("Thank you for visiting....");
				break;
			default:
				System.out.println("wrong choice");
					
			}
			
		}while(choice!=6);
		
	}

}
