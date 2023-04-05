//https://www.codechef.com/problems/MINCOINS
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
		    if(n%5!=0)
		    System.out.println(-1);
		    else
		    {
		        int ans=0;
		        ans+=n/10;
		        n%=10;
		        ans+=n/5;
		        System.out.println(ans);
		    }
		}
	}
}
