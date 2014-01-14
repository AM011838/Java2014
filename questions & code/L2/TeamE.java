import java.util.*;

public class TeamE{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("請輸入陣列大小:");
		int input=sc.nextInt();
		int[][] arr=new int[input][input];
		int total=0;
		for(int i=0;i<input;i++){
			for(int j=0;j<input;j++){
				arr[i][j]=(int)(Math.random()*10);
				System.out.print(arr[i][j]+" ");
				if(i==j)
					total+=arr[i][j];
				if(i==4-j)
					total+=arr[i][j];
			}
			System.out.println("");
		}
		System.out.println("");
		if(input%2!=0)
			total-=arr[input/2][input/2];
		System.out.print("對角線和是:"+total);
	}
}