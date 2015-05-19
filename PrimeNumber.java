/* package whatever; // don't place package name! */

import java.util.*;


/* Name of the class has to be "Main" only if the class is public. */
class Practice
{
	public static void main (String[] args)
	{
		int n=9;
		boolean c = isPrime(n);
			System.out.println(n + "is a Prime Number :" + c );
	 
	}
	
	public static boolean isPrime(int n)
	{
		for(int i = 2; i<=n-1; i++)
		{
			if ((n % i) == 0)
			{
				return false;
			}
		
		}
		return true;
	}
	
	public static void nPrimes(int n)
	{
		/*
		
		*/
		for(int i = 2; i<=n-1; i++)
		{
			if ((n % i) == 0)
			{
				return false;
			}
		
		}
		return true;
	}
	
}