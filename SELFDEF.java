//https://www.codechef.com/problems/SELFDEF
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
		    int ans=0;
		    int temp=0;
		    int n=kk.nextInt();
		    int[] a=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        temp=kk.nextInt();
		        if(temp>=10&&temp<=60)
		        ans++;
		    }
		    System.out.println(ans);
		}
	}
}
