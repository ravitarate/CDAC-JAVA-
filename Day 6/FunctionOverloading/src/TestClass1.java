
public class TestClass1 {
	/*public static int add(int x,int y) {
		System.out.println("in int x,y function");
		return x+y;
	}*/
	public static int add(Integer x,Integer y) {
		System.out.println("in Integer x,y function");
		return x+y;
	}
	public static int add(Long x,Long y) {
		System.out.println("in Long x,y function");
		return (int)(x+y);
	}
	
	public static int add(int x,int y,int z) {
		System.out.println("in int x,y,z function");
		return x+y+z;
	}
	
	/*public static int add(int x,int y,float...arr) {
		System.out.println("variable number of parameters");
		int s=x+y;
		for(int i=0;i<arr.length;i++) {
			s+=(int)arr[i];
		}
		return s;
	}*/
	
	/*public static float add(float x,float y) {
		System.out.println("in float x,y function");
		return x+y;
	}*/

	public static void main(String[] args) {
		add(10,20,30);  //function with 3 parameters will be called
		add(10,20);    //function with 2 int parameter will be called
		//System.out.println("addition : "+add(10,20,30,40));
		//add(10f,20f);  ////function with 2 float parameter will be called

	}

}

