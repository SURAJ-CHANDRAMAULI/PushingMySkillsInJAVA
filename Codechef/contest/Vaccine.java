package contest;

import java.util.Scanner;

public class Vaccine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s = new Scanner(System.in);
         int d1=s.nextInt();
         int v1=s.nextInt();
         int d2=s.nextInt();
         int v2=s.nextInt();
         int p=s.nextInt();
         
         int ans=((p+(v1*d1)+(v2*d2))/(v1+v2));
         System.out.print(ans);
         
	}

}
