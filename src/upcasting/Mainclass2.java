package upcasting;

public class Mainclass2 {

	public static void main(String[] args) {
		Sample3 ref = new Sample3();
		ref.execute1(new Demo1());
		ref.execute1(new Demo2());
		ref.execute2(new Demo3());
		ref.execute4(new Demo3());
		

	}

}
