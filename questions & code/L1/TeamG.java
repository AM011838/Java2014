import java.io.*;
public class G {
	public static void main(String[] args) throws IOException{
	try{  
		PrintWriter t=new PrintWriter  
				(new BufferedWriter(new FileWriter("ShowData.txt")));  
		BufferedReader br =   
				new BufferedReader(new InputStreamReader(System.in));  
		box BOX= new box();
		
		System.out.println("Input length:");
		String str = br.readLine();
		int length;
		length = Integer.parseInt(str);
		
		System.out.println("Input wigth:");
		String str1 = br.readLine();
		int wigth;
		wigth = Integer.parseInt(str);
		
		System.out.println("Input height:");
		String str2 = br.readLine();
		int height;
		height = Integer.parseInt(str);
		
		BOX.volume(length,wigth,height);
		BOX.surface(length,wigth,height);
		System.out.println("資料傳輸成功");
		t.close();
	}catch(IOException e){
	System.out.println("error");
	}
}
}
class box{
	int volume(int a,int b,int c){
		int volume;
		volume = a*b*c;
		return volume;
	}
	int surface(int a,int b,int c){
		int surface;
		surface = 2*(a*b+b*c+a*c);
		return surface;
	}
}