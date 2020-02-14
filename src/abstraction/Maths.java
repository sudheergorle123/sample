package abstraction;

public class Maths {

	public static void main(String[] args) {
		helper h1 = new helper();
		Shape s1 = h1.helpermethod();
		s1.circle();
		h1.helpermethod().rectangle();

	}

}
