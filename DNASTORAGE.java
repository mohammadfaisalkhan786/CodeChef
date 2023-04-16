//https://www.codechef.com/problems/DNASTORAGE
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
		    String s=kk.next();
		    StringBuilder str = new StringBuilder();
		    for(int i=0;i<n-1;i=i+2)
		    {
		        if(s.charAt(i)=='0'&&s.charAt(i+1)=='0')
		        str.append("A");
		        else if(s.charAt(i)=='0'&&s.charAt(i+1)=='1')
		        str.append("T");
		        else if(s.charAt(i)=='1'&&s.charAt(i+1)=='0')
		        str.append("C");
		        else if(s.charAt(i)=='1'&&s.charAt(i+1)=='1')
		        str.append("G");
		    }
		    System.out.println(str);
		}
	}
}
