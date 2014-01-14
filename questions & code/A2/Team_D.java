import java.io.*;
import java.util.Scanner; 
public class Team_D {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int number=0,con=0,temp=0;
		int []num=new int[4];
		System.out.print("請輸入一個四位數整數:");
		number=sc.nextInt();
		for(con=3;number>0;number/=10,con--)
			num[con]=number%10;
		for(con=0;con<4;con++){
			num[con]+=5;
			 if(num[con]==10)
				num[con]=0;
			 if(num[con]%10!=0)
				num[con]=num[con]%10;
		}
			temp=num[0];
			num[0]=num[3];
			num[3]=temp;
			temp=0;
			temp=num[1];
			num[1]=num[2];
			num[2]=temp;
		for(con=0;con<4;con++)
			System.out.print(num[con]);

		
	}

}
