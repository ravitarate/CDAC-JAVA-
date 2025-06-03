import java.util.Scanner;

public class TestPersonArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		do {
		System.out.println("1.add new person\n2.update mobile\n3find by id");
		System.out.println("4. display all\n5.find by name\n6. exit\n choice:");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			PersonService.addNewPerson();
			break;
		case 2:
			System.out.println("enter id to update mobile");
			int pid=sc.nextInt();
			System.out.println("enter mobile");
			String newmob=sc.next();
			boolean status=PersonService.upDateById(pid,newmob);
			if(status) {
				System.out.println("updated successfully");
			}else {
				System.out.println("Not found");
			}
			break;
		case 3:
			System.out.println("enter id to search");
			pid=sc.nextInt();
			Person p=PersonService.findById(pid);
			if(p!=null) {
				System.out.println(p);
			}else {
				System.out.println("not found");
			}
			break;
		case 4:
			PersonService.displayAll();
			break;
		case 5:
			System.out.println("enter name");
			sc.nextLine();
			String nm=sc.nextLine();
			Person[] arr=PersonService.findByName(nm);
			if(arr!=null) {
				for(int i=0;i<arr.length;i++) {
					if(arr[i]==null)
						break;
					System.out.println(arr[i]);
				}
			}else {
				System.out.println("not found");
			}
			break;
		case 6:
			sc.close();
			System.out.println("Thank you for visiting.......");
			break;
		default:
			System.out.println("wrong choice");
				
			
		}
		}while(choice!=6);
	
	}

}
