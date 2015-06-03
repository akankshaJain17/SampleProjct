/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int m=6;
		int[] ar = {1,2,3,4,5,6};
		int temp1=0;
		int temp2=0;
		temp1= ar[0];
		temp2= ar[1];
		
		for(int i=2;i<=m-1;i++)
		{
			ar[i-2] = ar[i];	
		}
		ar[4] = temp1;
		ar[5] = temp2;
		printArray(ar,m);
	}
	
	public static void printArray(int[] ar, int m)
	{
		for(int i=0;i<6;i++)
		{
			System.out.println(ar[i]);
		}
	}
}