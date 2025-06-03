
public class FunctionService {
	//calculate factorial of a number
	  public static int factorial(int n) {
		  int fact=1;
		  for(int i=1;i<=n;i++) {
			  fact=fact*i;
		  }
		  return fact;
		  
	  }
	  // print table of the number
	  public static void printTable(int n) {
		  for(int i=1;i<=10;i++) {
			  System.out.println(n+"*"+i+"="+(n*i));
		  }
		  
	  }
}
