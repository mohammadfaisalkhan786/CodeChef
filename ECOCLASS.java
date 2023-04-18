//https://www.codechef.com/problems/ECOCLASS
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
		    int[] t1=new int[n];
		    int[] t2=new int[n];
		    int ans=0;
		    for(int i=0;i<n;i++)
		    {
		        t1[i]=kk.nextInt();
		        
		    }
		    for(int i=0;i<n;i++)
		    {
		        t2[i]=kk.nextInt();
		        
		    }
		    for(int i=0;i<n;i++)
		    {
		        if(t1[i]==t2[i])
		        ans++;
		    }
		    System.out.println(ans);
		}
	}
}
