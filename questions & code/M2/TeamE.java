import java.util.*;
import java.lang.*;

public class TeamE{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		StringTokenizer str1= new StringTokenizer(s1);
		int[] arr=new int[101];
		int count=0;
		for(int i=0;str1.hasMoreTokens() && i<101;i++,count++){
			arr[i]=Integer.parseInt(str1.nextToken());
			if(arr[i]==1)
				i=99;
		}
		int money=arr[100],quantity=0;
		for(int i=0;i<count-1;i++){
			quantity=money/arr[i];
			money%=arr[i];
			System.out.println("共要找 "+quantity+" 張的 "+arr[i]+"元");
		}
	}
}