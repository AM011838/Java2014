import java.io.*;

public class EXAM {

	public static void main(String[] args) throws IOException 
	{

		try {
	

			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String[] stra={"零","壹","貳","參","肆","伍","陸","柒","捌","玖"};  
			String[] strb={"  ","拾","佰",}; 
			
			String str = "Teemo rides a thin line between chipper compatriot and unrepentant killer , but there's no one else I'd rather have as a friend.";

			String str1 = br.readLine();
			int[] a = new int[100];
			int g,i,x,y,local;
			
			int l = str1.length();
			
			int d=str.indexOf(str1);
			
			if(d==67) 
			{		
				//有找到
				
				System.out.print("Teemo在第  ");
				
				g=d+1;
				for(i=0;g!=0;i++)  
				{  
					a[i]=g%10;  
					g=g/10;
					
				}  
				i--;  
				local=i;  
				x=i%4; 
				
				for( ;x>=0;x--)  
				{  
					if(a[i]>0)
					{  
						System.out.print(stra[a[i]]);  
						
						if(x>0)  
						System.out.print(strb[x]);  
					}  
					
					if(i>0)  
					if(a[i]==0 && a[i-1]!=0 && x!=0)  
                    System.out.print("零");  
					i--;  
              
				}  
				
				   y=local/4;  
          
				
          
				for(int temp=y;temp>0;temp--)  
				{  
					for( x=3;x>=0;x--)  
					{  
						if(a[i]>0)
						{  
							System.out.print(stra[a[i]]);  
							if(x>0)  
							System.out.print(strb[x]);  
						}  
						if(i>0)  
							if(a[i]==0 && a[i-1]!=0 && x!=0)  
                        System.out.print("零");  
						
						i--;  
					}  
					
					y--;  
					if(y>0) System.out.print(strb[y+3]);  
						if(a[i]!=0 && a[i+1]==0 && temp >1)  
                    System.out.print("零");  
				}  
              
          
				
				System.out.print("  個位置");
				
			}
			else
			{
				//沒找到
				System.out.print("Teemo is not here");
			}
			
		}

		catch (IOException num) 
		{
			System.out.print("error!");
		}
	}

}