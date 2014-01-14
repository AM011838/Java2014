import java.io.*;   
import java.util.*;
public class Q1 
{
	public static void main(String[] args) throws IOException   
    { 
		PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("PUCCA.txt")));
		int i,j;
		for(i=0;i<20;i++)   
        {
				j=0;
				pw.print(i+1+"\t");
			  	j++;
              	for(;j<6;j++)   
              		pw.print((int)( Math.random()*10+1)+"\t");
              	pw.println();
        }
		pw.close();
		int[][] pucca=new int [20][7];
		BufferedReader k =     
                new BufferedReader(new FileReader("PUCCA.txt"));  
		int a,b=0;
		System.out.println("Number\tMon\tTue\tWed\tThr\tFri\tTotle");
		for(a=0;a<20;a++)  
        {  
			String str1=k.readLine();
			for(b=0;b<6;b++)
			{
				StringTokenizer sk=new StringTokenizer(str1);
				while(sk.hasMoreTokens())
				{
					pucca[a][b]=Integer.parseInt(sk.nextToken());
					System.out.print(pucca[a][b]+"\t");
					b++;
				}
				pucca[a][6]=pucca[a][1]+pucca[a][2]+pucca[a][3]+pucca[a][4]+pucca[a][5];
			}
			System.out.println(pucca[a][6]);
        }
        k.close();
        BufferedReader br =     
                new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Input : ");
        String str = br.readLine();  
        int IP=Integer.parseInt(str);   
        for(int m=0;m<20;m++)   
        {   
              for(int n=0;n<20;n++)   
              {   
            	  if(pucca[m][6]>pucca[n][6])   
            	  	{
            	  		for(int x=0;x<7;x++) 
	                    {   
	                           int tmp=pucca[m][x];   
	                           pucca[m][x]=pucca[n][x];   
	                           pucca[n][x]=tmp;  
	                    }   
            	  	}
              }   
        }
        int q=0;
        while(q<20)
        {
        	if(pucca[q][0]==IP)
        	{
            	System.out.println("編號 : "+pucca[q][0]);
            	System.out.println("第一天獲利 : "+pucca[q][1]+"000");
            	System.out.println("第二天獲利 : "+pucca[q][2]+"000");
            	System.out.println("第三天獲利 : "+pucca[q][3]+"000");
            	System.out.println("第四天獲利 : "+pucca[q][4]+"000");
            	System.out.println("第五天獲利 : "+pucca[q][5]+"000");
            	System.out.println("總獲利 : "+pucca[q][6]+"000");
            	q++;
            	System.out.println("名次 :"+q);
            	q=20;
        	}
            else
            	q++;
        }
    }
}
