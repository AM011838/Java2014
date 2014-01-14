import java.io.*;
import java.lang.*;

public class TeamM {
	public static void main(String[] args)throws IOException{
		System.out.println("請輸入陣列大小: ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine();
		int i = Integer.parseInt(str1);
		int j=0,k=0;
		int[][] result = new int[i][i]; 
		for(j=0;j<i;j++){
			for(k=0;k<i;k++){
				result[j][k]=(int)(Math.random()*9+1);
			}
		}
		
		for(j=0;j<i;j++){
			for(k=0;k<i;k++){
				System.out.printf("%d ",result[j][k]);
			}
			if(k==5)System.out.println();
		}
		
		System.out.println("對角線和是: ");
		for(j=0;j<i;j++){
			for(k=0;k<i;k++){
				
			}
		}
		
		
	}

}
