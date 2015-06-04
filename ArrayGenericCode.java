/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int m=8;
		int[] ar = {1,2,3,4,5,6,7,8};
		int n = 4;
		
		rotate(ar, m, n);
		printArray(ar, m);
		
		
	}
	
	public static void rotate(int[] ar, int m, int n)
	{	
		int[] tempArray = new int[n];

		for (int j=0;j<=n-1;j++)
		{
			tempArray[j] = ar[j];
		}
		for(int i=n; i<=m-1;i++)
		{
			ar[i-n]=ar[i];
		}
		
	
		for (int k=0;k<=n-1;k++)
		{
		    ar[m-n+k] = tempArray[k];	
		}
			
		
	}
	
	public static void printArray(int[] ar, int m)
	{
		for(int i=0;i<m;i++)
		{
			System.out.println(ar[i]);
				}
	}
	
}
