import java.io.*;
import java.util.*;

public class TeamE{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		BOX box=new BOX();
		int l,w,h;
		System.out.print("input length: ");
		l=sc.nextInt();
		System.out.print("input width: ");
		w=sc.nextInt();
		System.out.print("input heigth: ");
		h=sc.nextInt();
		int volume=box.volume(l,w,h);
		int surface=box.surface(l,w,h);
		try{
			PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("ShowData.txt")));
			pw.println(volume);
			pw.println(surface);
			System.out.println("資料輸入成功!");
			pw.close();
		}
		catch(IOException e){
			System.out.println("Error");
		}
	}
}

class BOX{
	int volume(int l,int w,int h){
		int ans=0;
		ans=l*w*h;
		return ans;
	}
	int surface(int l,int w,int h){
		int ans=0;
		ans=l*w*2+l*h*2+w*h*2;
		return ans;
	}
}