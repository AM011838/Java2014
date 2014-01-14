import java.util.Scanner;
import java.util.StringTokenizer;

public class A_B1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] remainder = new int[101];
		int[] quotient = new int[101];
		String[]num=new String[2];
		int m, n, i,j;
		System.out.println("Enter A/B 0<A<B<=100");
		String s = sc.next();
		StringTokenizer st = new StringTokenizer(s, "/");
		for(int k=0;k<2;k++){
				if(st.hasMoreTokens())
					num[k]=st.nextToken();
		}
		m=Integer.parseInt(num[0]);
		n=Integer.parseInt(num[1]);
		System.out.printf("%d/%d=0.", m, n); //System.out.println(m + " " + n);
		for (i=1;i<=100;i++) {
			remainder[m]=i;
			m=m*10;
			quotient[i]=m/n;
			m=m%n;
			if (m==0) {
				for (j=1;j<=1;j++)
					System.out.print(quotient[j]);
				break;
			}
			
			if (remainder[m]!=0) {
				for (j=1;j<=i;j++)
					System.out.print(quotient[j]);
				System.out.println("\n" + "是一個無限循環數 循環從小數第" + remainder[m] + "位到第"
						+ i + "位");
				break;
			}

		}

	}
}
