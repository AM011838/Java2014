import java.util.*;
public class TeamJ{



void array(int n){

int horSum=0;

int Sum=0;

int diaSum1=0;

int diaSum2=0;

int array[][] =new int[n][n] ;

int hor[] = new int [n];

for(int i=0;i<n;i++){

for(int j=0;j<n;j++){

int a = (int)(Math.random()*10);

array[i][j]=a;

}

}

//creat 一個n*n的陣列並且賦予每一個元素予隨機變數



for(int i =0;i<n;i++){

for(int j =0;j<n;j++){

System.out.print(array[i][j]+" ");

}

System.out.println();

}

//印出陣列



for(int i=0;i<n;i++){

for(int j =0;j<n;j++){

horSum += array[i][j];

}

int line = i+1;



int aver = horSum/n;



hor[i]=horSum;

horSum = 0;

}

//求每列總和及平均



for(int i =0;i<n;i++){

diaSum1+= array[i][i];

diaSum2+= array[i][n-i-1];

}

//取兩個對角線總和及平均

int qqq=diaSum1+diaSum2;

System.out.println("對角線和是:"+qqq);




}



public static void main(String args[]){


Scanner sc=new Scanner(System.in);
m2 hor = new m2();
System.out.println("請輸入陣列大小 :");
int n =sc.nextInt();

hor.array(n);

}

}