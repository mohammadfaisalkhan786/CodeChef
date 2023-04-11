//https://www.codechef.com/problems/SALE
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Faisal
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kk=new Scanner(System.in);
		int testcases=kk.nextInt();
		while(testcases-->0)
		{
		    int n=kk.nextInt();
		    int m=kk.nextInt();
		    int o=kk.nextInt();
		    int sum=n+m+o;
		    int mini=Math.min(Math.min(n,m),o);
		    System.out.println(sum-mini);
		}
	}
}
