//https://www.codechef.com/problems/CHESSDIST
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
		    int n1=kk.nextInt();
		    int m1=kk.nextInt();
		    int n2=kk.nextInt();
		    int m2=kk.nextInt();
		    int ans=Math.max(Math.abs(n1-n2),Math.abs(m1-m2));
		    System.out.println(ans);
		}
	}
}
