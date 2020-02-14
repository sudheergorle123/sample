package Exception;

public class Freinds {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			Friend3 f3 = new Friend3();
			String s = f3.demo3();
			System.out.println(s);
		}
		catch(Exception e)
		{
			System.out.println("got job...");
		}
		
		
		

	}

}
