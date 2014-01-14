import java.util.*;
public class thiss   { 
public static void main(String args[]) { 
Scanner s = new Scanner(System.in);
int num=0,temp;
do{
   System.out.print("輸入一個四位數整數：");
      num = s.nextInt();
     }while (num<1000||num>9999); 
int a[]=new int[4]; 
a[0] = num/1000; 
a[1] = (num/100)%10; 
a[2] = (num/10)%10; 
a[3] = num%10; 
for(int j=0;j<4;j++) 
{ 
a[j]+=5; 
a[j]%=10; 
} 
for(int j=0;j<=1;j++) 
    { 
    temp = a[j]; 
    a[j] = a[3-j]; 
    a[3-j] =temp; 
    } 
System.out.print("加密後的數字為："); 
for(int j=0;j<4;j++) 
System.out.print(a[j]); 
} 
} 
