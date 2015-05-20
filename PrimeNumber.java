// Prime Number Sample Java Program for practice

// Run Time complexity - O(n/2)

import java.util.*;

class Practice
{
	public static void main (String[] args)
	{
		int n=9;
		boolean c = isPrime(n);
		System.out.println(n + "is a Prime Number :" + c );
	 
	 
	 
	}
	
	/*
	Run time complexity: O(n)
	*/
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

	/*
	* /brief Prints prime numbers from 2 to m
	*
	* Runtime complexity of this program is:
	*/
	public static void nPrimes(int m)
	{
	}
	
	
}
