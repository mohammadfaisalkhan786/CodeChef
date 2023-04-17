//https://www.codechef.com/problems/INDIVISIBLE
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
		    int n2=kk.nextInt();
		    int n3=kk.nextInt();
		    for(int i=2;i<101;i++)
		    {
		        if((n%i!=0)&&(n2%i!=0)&&(n3%i!=0))
		        {
		            System.out.println(i);
		            break;
		        }
		    }
		}
	}
}
