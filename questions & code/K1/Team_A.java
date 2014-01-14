import java.util.Scanner;
public class vvvv
{
	static double F=0;					
	static double C=0;					
	public static double celsius()		
	{
		Scanner input=new Scanner(System.in);
		System.out.println("請輸入華氏度數:");
		F=input.nextDouble();
		System.out.print("華氏"+F);
		System.out.printf("%s%s","轉攝氏是:",5.0/9.0*(F-32));
		System.out.println("度c");
		return 0;
	}
	public static double fahreanheit()		
	{
		Scanner input1=new Scanner(System.in);
		System.out.println("請輸入攝氏度數:");
		C=input1.nextDouble();
		System.out.print("攝氏"+C);
		System.out.printf("%s%s","轉華氏是:",9.0/5.0*C+32);
		System.out.println("度f");
		return 0;
	}
	public static void main(String args[])
	{
		for(int i=1;i>0;i++)
		{
			int choice;    
			Scanner input=new Scanner(System.in);
			System.out.printf("%s\n","輸入1:攝氏轉華氏");
			System.out.printf("%s\n","輸入2:華氏轉攝氏");
			System.out.printf("%s\n","輸入-1離開");
			choice=input.nextInt();
			switch(choice)		
			{
				case 1:
					fahreanheit();
					break;
				case 2:
					celsius();
					break;
				case -1:					
					System.exit(0);
			}
		}
	}
}
