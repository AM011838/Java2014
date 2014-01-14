import java.util.*;

public class TeamC{
	public static void main(String [] args){
	int x =0,q;
	x = (int)(Math.random()*99+1); //將X設為終極密碼-電腦變數
	int count=0,n1=0,n2=100; //將猜的次數、最小值、最大值設定好
	Scanner a =new Scanner(System.in);
	System.out.println("1.終極密碼");
	System.out.println("2.猜數字");
	System.out.println("3.結束");
	q=a.nextInt();
	System.out.print("輸入猜測的數字(介於1~100間)");
	while(q!=3){
	     
	     int aa = a.nextInt(); //aa設為遊戲者輸入字
	     count++;
	     if(aa<n1||aa>n2)
	        System.out.print("再輸入猜測的數字"+ n1 +"~"+ n2 );
	     if(aa<100 && aa>0){
	     if(aa<x && aa>n1){
		n1=aa;
		System.out.println("輸入大一點");
                System.out.println("終極密碼-範圍: " + n1 +"~" + n2);
	    }
	    else if(aa>x && aa<n2){
                   n2=aa;
	           System.out.println("輸入小一點");
		   System.out.println("終極密碼-範圍: " + n1 +"~" + n2);
	   }
	   else if(aa==x){
		  n1=aa;
		  System.out.println("恭喜答對了!!");
		  if(count<=8){
	              System.out.println("您猜了 "+count+" 次，高手");
		      System.out.println("1.終極密碼");
	 	      System.out.println("2.猜數字");
	              System.out.println("3.結束");
	              q=a.nextInt();
	         }
	          else if(count>8 || count<=14){
	              System.out.println("您猜了 "+count+" 次，厲害");
		      System.out.println("1.終極密碼");
	 	      System.out.println("2.猜數字");
	              System.out.println("3.結束");
	              q=a.nextInt();
	         }
	          else {
	              System.out.println("您猜了 "+count+" 次，請多練習");
		      System.out.println("1.終極密碼");
	 	      System.out.println("2.猜數字");
	              System.out.println("3.結束");
	              q=a.nextInt();
		}
		  
	  }
	  }
	  else
	      System.out.println("輸入錯誤!重來!");
    		
	 }
      

	}
	
	}