import java.io.*;
public class Team_G
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("輸入一個四位數整數 : ");
		int num=Integer.parseInt(br.readLine());
		int a,b,c,d;
		a=num%10;
		num/=10;
		b=num%10;
		num/=10;
		c=num%10;
		num/=10;
		d=num;
		a+=5;
		b+=5;
		c+=5;
		d+=5;
		a%=10;
		b%=10;
		c%=10;
		d%=10;
		System.out.print("加密後的數字為 : ");
		System.out.print(a);
		System.out.print(b);
		System.out.print(c);
		System.out.print(d);
		
	}
}
