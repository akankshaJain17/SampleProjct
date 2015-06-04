/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;


/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{   
		Int choice;
	    Scanner in = new Scanner(System.in);
	 	System.out.println("Menu");
		System.out.println("1. ADD");
		System.out.println("2. SUBTRACT");
		System.out.println("3. MULTIPLY");
		System.out.println("4. DIVIDE");
		System.out.println("5. PRIME NUMBER");
		System.out.println("6. DONE");
        System.out.println("Enter you choice : ");
        choice = in.nextInt();
        System.out.println("Choice Entered is :" +choice);
        
        int result = Menu(choice);
	}
	
	public static int Menu (int choice)
	{
		switch(choice)
		{
		Case 1 : add();
				break;
		Case 2 : subtract(); break;
		Case 3 : Multiply(); break;
		Case 4 : divide(); break;
		Case 5 :  int n = 9;
					boolean c = isPrime(n);
					System.out.println(n + "is a Prime Number :" + c );
					break;
		Case 6 : System.out.println("Done"); break;
		default : System.out.println("Invalid input");
		}
	}
	
	public static boolean isPrime(int n)
	{
		for(int i = 2; i<=n/2; i++)
		{
			if ((n % i) == 0)
			{
				return false;
			}
		
		}
		return true;
	}
	
	
}