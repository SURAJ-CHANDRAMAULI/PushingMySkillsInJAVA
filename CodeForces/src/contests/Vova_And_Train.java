import java.util.Scanner;

public class Vova_And_Train {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0) {
			long Li,vi,li,ri;
			Li = s.nextLong();
			vi = s.nextLong();
			li = s.nextLong();
			ri = s.nextLong();
			int count = 0;
			for(long i=vi;i<=Li;i++) {
				if(i>=li && i<=ri)
					count=count;
				else if(i%vi==0)
					count++;
			}
			System.out.println(count);
		}

	}

}
