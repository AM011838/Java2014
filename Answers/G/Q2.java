import java.io.*;
public class Q2 
{
	public static void main(String[] args)throws IOException
    {
		BufferedReader br =
		    	new BufferedReader(new InputStreamReader(System.in));
		System.out.print("選擇1.蔬菜2.肉品3.海鮮4.水果5.結束 : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		String[][] sum={{"青江菜20元","花椰菜25元","高麗菜40元","空心菜20元","返回"},
						{"牛肉200元","豬肉150元","雞肉100元","羊肉100元","返回"},
						{"蛤蜊160元","蝦子200元","鮭魚150元","小卷100元","返回"},
						{"榴槤100元","火龍果60元","荔枝90元","哈密瓜150元","返回"},
						};
		int[][] m=new int[50][3];
        int totle=0;
        int i=0,j=0,a=0,b=0;
        int hold1=0,hold2;
        while(hold1>=0)
        {
        	hold2=0;
	        switch(num)
	        {
	        	case 1 :
	        		System.out.print("選擇 : \n1."+sum[i][j]+"\n2."+sum[i][j+1]+"\n3."+sum[i][j+2]+"\n4."+sum[i][j+3]+"\n5."+sum[i][j+4]+"\n");
	        		System.out.print("號碼 : ");
	        		String str1 = br.readLine();  
	                int num1 = Integer.parseInt(str1);
	                System.out.print("數量 : ");
	                String n1 = br.readLine();  
	                int c1 = Integer.parseInt(n1);
	                while(hold2>=0)
	                {
		                switch(num1)
		                {
		                	case 1:
		                		totle+=20*c1;
		                		m[a][b]=0;
		                		m[a][b+1]=0;
		                		m[a][b+2]=c1;
		                		a++;
		                		break;
		                	case 2 :
		                		totle+=25*c1;
		                		m[a][b]=0;
		                		m[a][b+1]=1;
		                		m[a][b+2]=c1;
		                		a++;
		                		break;
		                	case 3 :
		                		totle+=40*c1;
		                		m[a][b]=0;
		                		m[a][b+1]=2;
		                		m[a][b+2]=c1;
		                		a++;
		                		break;
		                	case 4 :
		                		totle+=20*c1;
		                		m[a][b]=0;
		                		m[a][b+1]=3;
		                		m[a][b+2]=c1;
		                		a++;
		                		break;
		                	case 5 :
		                		hold2=-1;
		                		break;
		                }
		                if(hold2!=-1)
		                {
			        		System.out.print("號碼 : ");
			        		str1 = br.readLine();  
			        		num1 = Integer.parseInt(str1);
			        		if(num1==5)
		                		;
		                	else
		                	{
				        		System.out.print("數量 : ");
				        		n1 = br.readLine();  
				        		c1 = Integer.parseInt(n1);
		                	}
		                }
	                }
	        		break;
	        	case 2 :
	        		i=1;
	        		System.out.print("選擇 : \n1."+sum[i][j]+"\n2."+sum[i][j+1]+"\n3."+sum[i][j+2]+"\n4."+sum[i][j+3]+"\n5."+sum[i][j+4]+"\n");
	        		System.out.print("號碼 : ");
	        		String str2 = br.readLine();  
	                int num2 = Integer.parseInt(str2);
	                System.out.print("數量 : ");
	                String n2 = br.readLine();  
	                int c2 = Integer.parseInt(n2);
	                while(hold2>=0)
	                {
		                switch(num2)
		                {
		                	case 1 :
		                		totle+=20*c2;
		                		m[a][b]=1;
		                		m[a][b+1]=0;
		                		m[a][b+2]=c2;
		                		a++;
		                		break;
		                	case 2 :
		                		totle+=25*c2;
		                		m[a][b]=1;
		                		m[a][b+1]=1;
		                		m[a][b+2]=c2;
		                		a++;
		                		break;
		                	case 3 :
		                		totle+=40*c2;
		                		m[a][b]=1;
		                		m[a][b+1]=2;
		                		m[a][b+2]=c2;
		                		a++;
		                		break;
		                	case 4 :
		                		totle+=20*c2;
		                		m[a][b]=1;
		                		m[a][b+1]=3;
		                		m[a][b+2]=c2;
		                		a++;
		                		break;
		                	case 5 :
		                		hold2=-1;
		                		break;
		                
		                }
		                if(hold2!=-1)
		                {
			        		System.out.print("號碼 : ");
			        		str2 = br.readLine();  
			        		num2 = Integer.parseInt(str2);
			        		if(num2==5)
		                		;
		                	else
		                	{
				        		System.out.print("數量 : ");
				        		n2 = br.readLine();
				        		c2 = Integer.parseInt(n2);
		                	}
		                }
	                }
		        		break;
	        	case 3 :
	        		i=2;
	        		System.out.print("選擇 : \n1."+sum[i][j]+"\n2."+sum[i][j+1]+"\n3."+sum[i][j+2]+"\n4."+sum[i][j+3]+"\n5."+sum[i][j+4]+"\n");
	        		System.out.print("號碼 : ");
	        		String str3 = br.readLine();  
	        		int num3 = Integer.parseInt(str3);
	        		System.out.print("數量 : ");
	        		String n3 = br.readLine();  
	                int c3 = Integer.parseInt(n3);
	                while(hold2>=0)
	                {
		                switch(num3)
		                {
		                	case 1 :
		                		totle+=20*c3;
		                		m[a][b]=2;
		                		m[a][b+1]=0;
		                		m[a][b+2]=c3;
		                		a++;
		                		break;
		                	case 2 :
		                		totle+=25*c3;
		                		m[a][b]=2;
		                		m[a][b+1]=1;
		                		m[a][b+2]=c3;
		                		a++;
		                		break;
		                	case 3 :
		                		totle+=40*c3;
		                		m[a][b]=2;
		                		m[a][b+1]=2;
		                		m[a][b+2]=c3;
		                		a++;
		                		break;
		                	case 4 :
		                		totle+=20*c3;
		                		m[a][b]=2;
		                		m[a][b+1]=3;
		                		m[a][b+2]=c3;
		                		a++;
		                		break;
		                	case 5 :
		                		hold2=-1;
		                		break;
		                
		                }
		                if(hold2!=-1)
		                {
		                	System.out.print("號碼 : ");
		                	str3 = br.readLine();
			        		num3 = Integer.parseInt(str3);
			        		if(num3==5)
		                		;
		                	else
		                	{
				        		System.out.print("數量 : ");
				        		n3 = br.readLine();
				        		c3 = Integer.parseInt(n3);
		                	}
		                }
	                }
		        		break;
	        	case 4 :
	        		i=3;
	        		System.out.print("選擇 : \n1."+sum[i][j]+"\n2."+sum[i][j+1]+"\n3."+sum[i][j+2]+"\n4."+sum[i][j+3]+"\n5."+sum[i][j+4]+"\n");
	        		System.out.print("號碼 : ");
	        		String str4 = br.readLine();  
	                int num4 = Integer.parseInt(str4);
	                System.out.print("數量 : ");
	                String n4 = br.readLine();  
	                int c4 = Integer.parseInt(n4);
	                while(hold2>=0)
	                {
		                switch(num4)
		                {
		                	case 1 :
		                		totle+=20*c4;
		                		m[a][b]=3;
		                		m[a][b+1]=0;
		                		m[a][b+2]=c4;
		                		break;
		                	case 2 :
		                		totle+=25*c4;
		                		m[a][b]=3;
		                		m[a][b+1]=1;
		                		m[a][b+2]=c4;
		                		break;
		                	case 3 :
		                		totle+=40*c4;
		                		m[a][b]=3;
		                		m[a][b+1]=2;
		                		m[a][b+2]=c4;
		                		break;
		                	case 4 :
		                		totle+=20*c4;
		                		m[a][b]=3;
		                		m[a][b+1]=3;
		                		m[a][b+2]=c4;
		                		break;
		                	case 5 :
		                		hold2=-1;
		                		break;
		                
		                }
		                if(hold2!=-1)
		                {
		                	System.out.print("號碼 : ");
		                	str4 = br.readLine();
	                		num4 = Integer.parseInt(str4);
		                	if(num4==5)
		                		;
		                	else
		                	{
				        		System.out.print("數量 : ");
				        		n4 = br.readLine();
				        		c4 = Integer.parseInt(n4);
		                	}
		                }
	                }
		        	break;
	        	case 5 :
	        		hold1=-1;
	        		break;
	        }
	        if(hold1!=-1)	
	        {
	        	System.out.print("選擇1.蔬菜2.肉品3.海鮮4.水果5.結束 : ");
	        	str = br.readLine();
				num = Integer.parseInt(str);
	        }
        }
        int c=0,d=0;
        for(;c<=a;c++)
        	System.out.print(sum[m[c][d]][m[c][d+1]]+"*"+m[c][d+2]+"\n");
        System.out.println("總額"+totle);
    }
}
