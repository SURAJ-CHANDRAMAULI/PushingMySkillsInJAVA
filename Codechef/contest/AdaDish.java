package contest;

import java.util.Arrays;
import java.util.Scanner;

public class AdaDish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0) 
		{
			int n = s.nextInt();
			int arr[] = new int[n];
			
			for(int i=0;i<n;i++) {
				arr[i] = s.nextInt();
			}1
			Arrays.parallelSort(arr);
			int time=0; 
			if(n==1) {
				time = arr[0];
			}
			if(n==2) {
				time = Math.max(arr[0], arr[1]);
			}
			if(n==3) {
				if(arr[0]+arr[1]<=arr[2])
					time = arr[2];
				else
					time = arr[0]+arr[1];
			}
			int carry=0;
			if(n==4) {
				if(arr[0]+arr[1]+arr[2]<=arr[3])
					time = arr[3];
				else {
//				time= Math.max(arr[3], arr[2]);
//				carry = arr[3]-arr[2];
//				time = time + Math.max(arr[1], arr[0])-carry;
					time = Math.max((arr[3]+arr[1]),(arr[1]+arr[2]));
				}
			}
		System.out.println(time);
		}

	}

}
