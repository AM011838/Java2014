import java.util.*;
public class TeamJ  { 
public static void main(String args[]) { 
Scanner s = new Scanner(System.in);
int n=0,temp;
do{
   System.out.print("輸入一個四位數整數：");
      n = s.nextInt();
     }while (n<1000||n>9999); 
int num[]=new int[4]; 
num[0] = n/1000; 
num[1] = (n/100)%10; 
num[2] = (n/10)%10; 
num[3] = n%10; 
for(int j=0;j<4;j++) 
{ 
	num[j]+=5; 
	num[j]%=10; 
} 
for(int j=0;j<=1;j++) 
    { 
    temp = num[j]; 
    num[j] = num[3-j]; 
    num[3-j] =temp; 
    } 
System.out.print("加密後的數字為："); 
for(int j=0;j<4;j++) 
System.out.print(num[j]); 
} 
}