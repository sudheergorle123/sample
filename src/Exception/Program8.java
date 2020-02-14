package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program8 {

	public static void main(String[] args) {
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("a=");
		int a = sc.nextInt();
		System.out.println("b=");
		int b = sc.nextInt();
		int res = a/b;
		System.out.println(res);
		System.out.println("entering try block");
		System.out.println("existing try block");
		}
		catch(InputMismatchException ae)
		{
			System.out.println("entering catch block");
			System.out.println("existing catch block");
		}
		finally
		{
			System.out.println("entering choga block");
			System.out.println("entering goka block");
		}
		

	}

}
