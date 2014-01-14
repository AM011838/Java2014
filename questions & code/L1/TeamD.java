import java.io.*;
import java.util.Scanner;
public class TeamD{
	public static void main(String[] args){
	    try{
		  PrintWriter txtout = new PrintWriter(new BufferedWriter(new FileWriter("ShowData.txt")));
		  int length=0,width=0,height=0,v=0,s=0;
		  IN t = new IN();
	          Scanner sca = new Scanner(System.in);
		  System.out.print("input length:");
		  length=sca.nextInt();
		  System.out.print("input width:");
		  width=sca.nextInt();
		  System.out.print("input height:");
		  height=sca.nextInt();
		  v=t.volume(length,width,height);
		  s=t.surface(width,height);
		  txtout.println("volume:"+v);
		  txtout.println("surface:"+s);
		  txtout.close();
		  System.out.print("資料輸入成功!");
	   }
	   catch(IOException e){
		 System.out.println("wrong!!");
	   }
	}
}
	
class IN{
	public int volume(int l,int w,int h){
		return l*w*h;
	}
	public int surface(int w,int h){
		return w*h;
	}
}
