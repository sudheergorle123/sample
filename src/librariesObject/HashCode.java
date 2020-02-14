package librariesObject;

public class HashCode {

	public static void main(String[] args) {
		Sample2 s2 = new Sample2();
		int hc = s2.hashCode();
		Sample2 s3 = new Sample2();
		int hc1 = s3.hashCode();
		System.out.println(hc);
		System.out.println(hc1);

	}

}
