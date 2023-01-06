package Classassigenment;

import java.util.Scanner;

public class OddOrEvenNo {
	public static void main (String []args) 
	{
		int num;
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter your input: ");
		num = sc.nextInt();
		
		if (num%2==0)
		System.out.println(num+" " + "Number is even");
		
		else 
		System.out.println(num+ " " + "Number is even");
	}


}
