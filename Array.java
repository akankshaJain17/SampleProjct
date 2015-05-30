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
	    
	    int m =5;
		int ar[] = {1,2,3,4,5};
		int temp;
		temp=ar[0];
		
		for(int i=1; i<=m-1; i++)
		{
			ar[i-1]=ar[i];
			
		}
		ar[m-1] = temp;
		printArray(ar,m);
		
	}		
	public static void printArray(int[] ar, int m)
{
 for (int i = 0; i < m; i++)
 {
   System.out.println( ar[i] );
 }
}


}