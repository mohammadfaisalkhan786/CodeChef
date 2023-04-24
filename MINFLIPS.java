//https://www.codechef.com/problems/MINFLIPS
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
		    int positive=0;
		    int negative=0;
		    for(int i=0;i<n;i++)
		    {
		        if(kk.nextInt()==1)
		        {
		            positive++;
		        }
		        else
		        {
		            negative++;
		        }
		    }
		    int max=Math.max(positive,negative);
		    int min=Math.min(positive,negative);
		    if((((max-min)/2)*2)==max-min)
		    System.out.println((max-min)/2);
		    else
		    System.out.println(-1);
		    
		    
		}
	}
}
