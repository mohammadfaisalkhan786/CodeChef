//https://www.codechef.com/problems/LUCKYN
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner kk=new Scanner(System.in);
		int testcases=kk.nextInt();
		while(testcases-->0)
		{
		    int n=kk.nextInt();
		    boolean ans=false;
		    while(n>0)
		    {
		        if(n%10==7)
		        {
		            ans=true;
		            break;
		        }
		        n/=10;
		    }
		    System.out.println((ans)?"YES":"NO");
		}
	}
}
