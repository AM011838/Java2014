import java.io.*;
import java.lang.*;

class TeamM{
	public static void main(String[] args)throws IOException{
		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("輸入遊戲1為:終極密碼");
		System.out.println("輸入遊戲2為:猜數字");
		System.out.println("輸入3為:離開");		
		String str=br.readLine();
		int num=Integer.parseInt(str);
		int count=0;
		int number=0;
		int k=0,i=0;
		int ans=0;
		int a=0,b=0;  
		while(num!=3){
			switch(num){
				case 1:
					do{
						System.out.println("請輸入1~100:");
						number=(int)(Math.random()*100)+1;
						str=br.readLine();
						k=Integer.parseInt(str);
						if(number>k)
							System.out.println("請輸入大一點");
						if(number<k)
							System.out.println("請輸入小一點");
						count++;
						
					}while(numder!=k)
					if(count<9)
						System.out.println("高手");
					else if(count>8&&count<14)
						System.out.println("厲害");
					else
						System.out.println("請多練習");
					break;

				case 2:
					while(a==2&&(b-a)==2){
						int[] ognum=new int[4];  
						int[] gunum=new int[4];  
						for(i=0;i<4;i++){
							ognum[i]=(int)(Math.random()*10)+1;
						}
						for(i=0;i<4;i++){
							str = br.readLine();
							gunum[i]=Integer.parseInt(str);
						}
				        
				        for(i=0;i<4;i++){  
				            if(ognum[i]==gunum[i])  
				                a++;  
				            for(int j=0;j<4;j++){  
				                if(ognum[i]==gunum[j])  
				                    b++;  
				            }  
				        }  
				          
				        System.out.println(a+"A"+(b-a)+"B");   
					}
					break;
				default:
					System.out.println("請輸入1,2,3其中一個數字");
					break;
			}
			str=br.readLine();
			num=Integer.parseInt(str);
		}
	}
}
