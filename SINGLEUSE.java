//https://www.codechef.com/problems/SINGLEUSE
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
		    int n=kk.nextInt();
		    int m=kk.nextInt();
		    int k=kk.nextInt();
		    n=n-k;
		    ans++;
		    if(n<=0)
		    System.out.println(1);
		    else{
		        k=(n%m==0)?n/m:(n/m)+1;
		        ans+=k;
		        System.out.println(ans);
		    }
		}
	}
}
