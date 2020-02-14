package Encapsulation;

public class Hr {

	public static void main(String[] args) {
		Employee e = new Employee("sudheer",143,78902.4);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSal());
		e.setId(178);
		e.setName("gorle");
		e.setSal(17890.3);
		System.out.println(e.getId());
		System.out.println(e.getName());
		System.out.println(e.getSal());
		

	}

}
