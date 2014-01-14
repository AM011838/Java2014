import java.util.Scanner;
import java.io.PrintStream;

class TeamI
{
	public static void main (String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("輸入1:攝氏轉華氏");
		System.out.println("輸入2:華氏轉攝氏");
		System.out.println("輸入-1:離開");



		int n=sc.nextInt();
		double c,f;
		while(n!=-1)
		{
			switch(n)
			{
				case 1:
					System.out.print("請輸入攝氏溫度數:");
					c =sc.nextDouble();
					f=0;
					f=c*9/5+32;
					System.out.print("攝氏");
					System.out.printf("%.1f",c);
					System.out.print("轉華氏是:");
					System.out.printf("%.1f",f);
					System.out.println("度f\n\n");

					System.out.println("輸入1:攝氏轉華氏");
					System.out.println("輸入2:華氏轉攝氏");
					System.out.println("輸入-1:離開");
					n=sc.nextInt();
				break;

				case 2:
					System.out.print("請輸入攝氏溫度數:");
					f =sc.nextDouble();
					c=0;
					c=(f-32)*5/9;
					System.out.print("華氏");
					System.out.printf("%.1f",f);
					System.out.print("轉攝氏是:");
					System.out.printf("%.1f",c);
					System.out.println("度c\n\n");

					System.out.println("輸入1:攝氏轉華氏");
					System.out.println("輸入2:華氏轉攝氏");
					System.out.println("輸入-1:離開");
					n=sc.nextInt();
				break;
			}
		}

		
	}
}