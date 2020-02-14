package Encapsulation;

public class Hr2 {

	public static void main(String[] args) {
		Employee2 e2 = new Employee2("sudheer",133,30000);
		System.out.println(e2.getName());
		System.out.println(e2.getId());
		System.out.println(e2.getsal());
		e2.setName("vijay");
		e2.setId(456);
		e2.setSal(40000);
		System.out.println(e2.getName());
		System.out.println(e2.getId());
		System.out.println(e2.getsal());
		
		
		

	}

}
