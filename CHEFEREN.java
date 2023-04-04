//https://www.codechef.com/problems/CHEFEREN
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
		    int a=kk.nextInt();
		    int b=kk.nextInt();
		    int ans=0;
		    for(int i=1;i<=n;i++)
		    {
		        if(i%2==0)
		        ans+=a;
		        else
		        ans+=b;
		    }
		    System.out.println(ans);
		}
	}
}
