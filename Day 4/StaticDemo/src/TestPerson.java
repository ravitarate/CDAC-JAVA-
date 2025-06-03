
public class TestPerson {

	public static void main(String[] args) {
		Person p=new Person("Rajan","22222");
		//p.displayPerson();
		System.out.println(p);
		p.setPname("Revati");
        System.out.println(p);
        System.out.println(p.getPname());
        Person p1=new Person("Atharva","44444");
        System.out.println(p1);
        System.out.println(p1.getPname());
        Person1 p2=new Person1("Kishori","3333");
        System.out.println(p2);
        Person1 p3=new Person1("Atharva","3333");
        System.out.println(p3);
	}

}
