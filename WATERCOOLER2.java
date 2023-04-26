//https://www.codechef.com/problems/WATERCOOLER2
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
		    int x=kk.nextInt();
		    int y=kk.nextInt();
		    if(x>=y)
		    System.out.println(0);
		    else{
		     if(y%x==0)
		     System.out.println(y/x-1);
		      System.out.println((y / x));
		    }
		    
		    
		}
	}
}
