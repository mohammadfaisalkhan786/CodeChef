//https://www.codechef.com/problems/CNDLOVE
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
		    int sum=0;
		    for(int i=0;i<n;i++){
		        sum+=kk.nextInt();
		    }
		    if(sum%2==0)
		    System.out.println("NO");
		    else
		    System.out.println("YES");
		    
		}
	}
}
