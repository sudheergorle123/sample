package interview;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("enter the String:");
			String s1 = sc.next();
			int l = s1.length();
			String s2 ="";
			for(int i = l-1 ; i >= 0 ; i-- )
			{
				s2 = s2 + s1.charAt(i);
			}
			System.out.println("reverse of a sting:"+s2);
			if(s1.equals(s2))
			{
				System.out.println("its a pallindrome");
			}
			else
			{
				System.out.println("its not a pallindrome");
			}
			

	}

}
