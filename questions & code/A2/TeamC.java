import java.util.*;
class TeamC{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("輸入一個四位數整數");
	int a=sc.nextInt();
	int []A=new int [4];
	System.out.print("加密過的數字為");
	for(int i=3;i>=0;i--){
	   A[i]=a%10;
	   a=a/10;
	   A[i]+=5;
	   System.out.print(A[i]);
	}
	//只有輸入1234是對的@@"
}
}

