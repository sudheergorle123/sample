package Exception;

import java.util.Scanner;

public class Program7 {

	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value of a:");
		int a = sc.nextInt();

		System.out.println("enter value of b:");
		int b = sc.nextInt();
		int res = a/b;
		System.out.println("res:"+res);
		}
		catch(ArithmeticException ae) {
			System.out.println("alternate code");
		}

		
	}

}
