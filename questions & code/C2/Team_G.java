import java.io.*;
public class Team_G
{
	public static void main(String[] args)
	{
		int[][] num=new int[10][10];
		num[0][0]=1;
		num[1][0]=1;
		num[1][1]=1;
		for(int i = 0; i<10 ;i++)
		{  
			num[i][0] = 1;  
			num[i][i] = 1;  
            if(i > 1)
            {  
                for(int j = 1; j < i ;j++)
                	num[i][j] = num[i-1][j-1] + num[i-1][j];  
            }  
        }  
        for(int i = 0; i < 10 ;i++)
        {  
            for(int k = 0; k <= 10 - i;k++)
                System.out.print("   ");  
            for(int j = 0; j<= i ;j++)
                System.out.print(num[i][j]+"     ");  
            System.out.println(); 
        }
	}
}
