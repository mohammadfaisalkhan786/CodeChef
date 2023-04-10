//https://www.codechef.com/problems/PRESENTS
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
		    int coins = n/5;
		    n=n%5;
		    coins*=4;
		    coins+=n;
            System.out.println(coins);
		}
	}
}
