package coursera;
import java.util.Scanner;
public class MyClass {
	public static void main (String[] args) 
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
		   int n = s.nextInt();
		   int c = 0;
		   for(int i = 1 ;i<=n;i++)
		   {
		   n=n-i;
		   if(n<0)
			   break;
		   c++;
		  
		}
//		   if(n==0)
//		System.out.println(c);
//		   else
				System.out.println(c);
			   
		}
	}
	}

