import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class YO {
	public static void main(String[] arg) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int fourA = Integer.parseInt(str);
		int[] fourAn = new int[4];
		fourAn[0] = fourA/1000;
		System.out.println();
		fourA -= fourAn[0]*1000;
		fourAn[1] = fourA/100;
		fourA -= fourAn[1]*100;
		fourAn[2] = fourA/10;
		fourA -= fourAn[2]*10;
		fourAn[3] = fourA;
		for(int i=0;i<4;i++){
			fourAn[i]+=5;
		}
		for(int j=0;j<4;j++){
			fourAn[j]=fourAn[j]%10;
		}
		int t;
		t = fourAn[0];
		fourAn[0] = fourAn[3];
		fourAn[3] = t;
		t = fourAn[1];
		fourAn[1] = fourAn[2];
		fourAn[2] = t;
		
		int FFFF = 0;
		FFFF = FFFF+fourAn[0]*1000+fourAn[1]*100+fourAn[2]*10+fourAn[3];
		System.out.println(FFFF);
	}
}
