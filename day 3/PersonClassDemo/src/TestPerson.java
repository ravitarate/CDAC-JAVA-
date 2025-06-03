
public class TestPerson {

	public static void main(String[] args) {
		Person p=new Person(123,"Rajan","22222");
		//p.displayPerson();
		System.out.println(p);
		p.setPname("Revati");
        System.out.println(p);
        System.out.println(p.getPname());
	}

}
