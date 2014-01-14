import java.io.*;
import java.util.Scanner;
class TeamD{
	public static void main(String[] args){
	     Scanner sca = new Scanner(System.in);
	     int qu;
	     int con=0,timer=0,cho=0,w=0,j=0,r=0,i=0;
	     int ans;
	     do{
	    	 System.out.println("1.終極密碼");
	    	 System.out.println("2.猜數字");
	    	 System.out.println("3.結束");
	    	 cho=sca.nextInt();
	    	 if(cho==1){
			     do{
			    	 qu=(int)(Math.random()*99)+1;
			    	 if(con==0)
			    		 System.out.print("請輸入猜測數字(介於1~100間):");
			    	 else
			    		 System.out.print("再輸入猜測數字:");
			    	 ans=sca.nextInt();
			    	 if(ans<qu){
			    		 System.out.println("大一點");
			    		 con++;
			    	 }
			    	 else if(ans>qu){
			    		 System.out.println("小一點");
			    		 con++;
			    	 }
			    	 else if(ans==qu){
			    		 if(con<=8)
			    			 System.out.println("你猜了"+con+"次，高手");
			    		 else if(con<=13)
			    			 System.out.println("你猜了"+con+"次，厲害");
			    		 else if(con>14)
			    			 System.out.println("你猜了"+con+"次，請多練習");
			    	 timer=1;
			    	 }
			     }while(timer!=1);
	    	}
	    	if(cho==2){
	    		int [][]num=new int [2][4];
	    		for(i=0;i<4;i++)
	    			num[0][i]=(int)(Math.random()*9);
			for(i=0;i<4;i++)
				for(j=0;j<4;j++)
				   if(num[0][i]==num[0][j]){
					num[0][i]=(num[0][i]+(int)(Math.random()*9))%10;
				   }
			System.out.println("請猜四個數字(1-9)(不可有一樣的數字)");
			System.out.println(" ");
			do{
				for(i=0;i<4;i++){
					System.out.print("請輸入第"+(i+1)+"個數字:");
					num[1][i]=sca.nextInt();
				}
	    			 for(i=0;i<4;i++){
		 			 if(num[1][i]==num[0][i])
		     				  r++;
		 			 else
		       				for(j=0;j<4;j++)
	             	    				if(num[1][i]==num[0][j])
		  	        				w++;
	     	 		 }
				for(i=0;i<4;i++)
					System.out.print(num[1][i]+" ");
				System.out.println(" ");
	     			System.out.println(r+"A");
	     			System.out.println(w+"B");
				if(r==4)
				    timer=1;
				r=0;
				w=0;
			}while(timer!=1);
	    	}
	    	
	     }while(cho!=3);
	     System.out.println("end!!");
	 }
}


