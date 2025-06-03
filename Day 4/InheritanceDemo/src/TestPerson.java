import java.util.Date;

public class TestPerson {

	public static void main(String[] args) {
		/*Person p=new Person("s","xxxx",new Date());
		System.out.println(p);
		Person p1=new Person("c","xxxx",new Date());
		System.out.println(p1);
		Employee e1=new Employee("s","xxx",new Date(),"Hr","mgr");
		System.out.println(e1);
		e1.getPid();*/
		//SalariedEmp s11=new SalariedEmp("ssss",new Date(),"HR","mgr",45678);
		//System.out.println(s11);
		ContractEmp c11=new ContractEmp("xxx",new Date(),"Hr","mgr",34,3000);
        System.out.println(c11);
	}

}
