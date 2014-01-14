
import java.io.*;
import java.util.*;



public class TeamG
{
 public static void main(String[] para) 
    {
  System.out.println("\n1.終極密碼  \n2.猜數字 \n3.結束" );
 
  start();
 }

  private static void start() {

	
}

public static void game() throws InputMismatchException
 {  
	 
  System.out.println("請輸入一個數字");
  
  
  int random_no=(int)(Math.random()*100+1);
  Scanner scanner=new Scanner(System.in);
  int a=scanner.nextInt(),b=a;

  if(b==1234){
   a=(int)(Math.random()*100+1);
   System.out.println(a);
  }
  else if(a==100){
   a=random_no;
  }
  else if(a==50){
   System.exit(0);
  }
  
  int i,min=1,max=100;
   ex1 (a,min,max);

  for(i=1;i<max;i++)
  {
   if(max<a){
    a=max;
     }
     else if(a<min){
    a=min;
     }
     else if(random_no<a){
    max=a;
    System.out.println("再輸入大一點的數字:");
     }
     else if(random_no>a){
    min=a;
    System.out.println("再輸入小一點的數字:");
     }
   else{
    System.out.println("恭喜答對了");
    System.out.println();
    break; 
     }
  

   if(b==1234){
    a=(int)(Math.random()*(max-min+1)+min);
    System.out.println(a);
   }
   else if(a==100){
    a=random_no;
   }
   else if(a==88){
    System.exit(0);
   }
   else{
    a=scanner.nextInt();
   }
   ex_2(a,min,max);
  }
  System.out.println("終極密碼為"+a);
  System.out.println("你總共猜了"+i+"次");
  conclusion(i);
  System.exit(0);
 }

 public static void ex1(int a,int min,int max)
 {
  if(a<min||a>max){
   System.out.println("錯誤！必須輸入1到100之間的數字，請重新輸入！");
   System.out.println();
   game();
  }
  }

 public static void ex_2(int a,int min,int max)
  {
  if(a==max||a==min){
   System.out.println("不可以有一樣的數字請重新輸入");
       } 
    }

  public static void conclusion(int i)
  {
  if(i==1)
 
     System.out.println("高手");
  else if(i>=7&&i<=9)
     System.out.println("厲害");
  else if(i>=9&&i<=13)
     System.out.println("請多練習"); 
  else if(i>=13&&i<=14)
  
  break
  