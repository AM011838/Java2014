import java.util.*;  

public class TeamE{  
    public static void main(String[] args){  
        Scanner sc =new Scanner(System.in);  
            int[][] score = new int[10][10];
	    for(int i=0;i<score.length;i++)
		score[i][0]=1;
	    for(int i=0;i<score.length;i++){
	    	for(int j=1;j<=i;j++)
			score[i][j]=score[i-1][j]+score[i-1][j-1];
		score[i][i]=1;	
	    }		
	   	for(int i=0;i<score.length;i++){
			for(int k=10;k>i;k--)
				System.out.print("  ");
			for(int j=0;j<=i;j++)
				System.out.printf("%3d   ",score[i][j]);
			System.out.println("");
		}
    	}
}  