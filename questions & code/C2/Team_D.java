import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Team_D {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		
		
		for(int n=0;n<=10;n++){
			for(int r=0;r <= n;r++){
				if(r==0){
					for(int i=0;i<= (10-n);i++){
						System.out.print("  ");
					}
				}else{
					System.out.print("   ");
				}
				System.out.print(combi(n,r));
			}
			System.out.println();
		}
		
	}
	
	public static long combi(int n,int r){
		long p = 1;
		for(int i=1;i<=r;i++){
			p = p * (n-i+1) / i;
		}
		return p;
	}

}
