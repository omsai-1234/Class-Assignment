package Classassigenment;

import java.util.Scanner;

public class ReverseNumer {
	public static void main(String args[])
	{
	int n,rem,reverse=0,temp;
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter your number: ");
	n = sc.nextInt();
	temp=n;
	
	while (n>0)
	{
		  rem = n%10;
		reverse = reverse*10+rem;
		n= n/10;
	}
		System.out.println("Reverse of the number is"+" "+reverse);
		
		if (temp==reverse)
		System.out.println("The given number"+ " " +temp+" "+"is a Palindrome");
		
		else 
		System.out.println("The given number" +temp+ "is not a Palindrome");
	}
		
}
