package day6;

import java.util.Scanner;

public class FindPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Integer: ");
		int reverse =0, num = scanner.nextInt();
		int num1 =num;
		while (num>0)
		{
			reverse = reverse*10 + num%10;
			num = num/10;
		}
		
		if(num1 == reverse)
		{
			System.out.println("Number "+num1+ " is a Palindrome");
		}
		else
		{
			System.out.println("Number "+num1+ " is not a Palindrome");
		}
		

		scanner.close();
		
	}

}
