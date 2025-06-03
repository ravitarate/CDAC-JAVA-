import java.util.Scanner;

public class PersonService {
	static Person[] parr=new Person[100];
	static int count;
	static {
		parr[0]=new Person(112,"Deepa","3333");
		parr[1]=new Person(113,"Seema","44444");
		parr[2]=new Person(114,"Sangeeta","5555");
		count=3;
	}

	public static void addNewPerson() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int pid=sc.nextInt();
		//to remove enter key from the scanner buffer
		sc.nextLine();
		System.out.println("enter pname");
		String nm=sc.nextLine();
		System.out.println("enter mobile");
		String mob=sc.nextLine();
		parr[count]=new Person(pid,nm,mob);
		count++;
		
	}

	public static void displayAll() {
		for(int i=0;i<count;i++) {
			System.out.println(parr[i]);
		}
		
	}

	public static Person findById(int pid) {
		for(int i=0;i<count;i++) {
			if(parr[i].getPid()==pid) {
				//object found
				return parr[i];
			}
		}
		//object not found
		return null;
	}

	public static boolean upDateById(int pid, String newmob) {
		Person p=findById(pid);
		if(p!=null) {
			p.setMobile(newmob);
			return true;
		}else {
			return false;
		}
	}

	public static Person[] findByName(String nm) {
		Person[] arr=new Person[count];
		//index for arr
		int c=0;
		//i is index for parr
		for(int i=0;i<count;i++) {
			if(parr[i].getPname().equals(nm)) {
				arr[c]=parr[i];
				c++;
			}
		}
		if(c>0)
			return arr;
		else
			return null;
	}

}











