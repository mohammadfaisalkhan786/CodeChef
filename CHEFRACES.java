//https://www.codechef.com/problems/CHEFRACES
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
		    int m=kk.nextInt();
		    int x=kk.nextInt();
		    int y=kk.nextInt();
		    HashMap<Integer,Integer> map=new HashMap<>();
		    map.put(n,1);
		    map.put(m,1);
		    int ans=2;
		    if (map.containsKey(x))
		    ans--;
		    if(map.containsKey(y))
		    ans--;
		    System.out.println(ans);
		}
	}
}
