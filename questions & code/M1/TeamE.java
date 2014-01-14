import java.util.*;

public class TeamE{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String str1;
		int total=0;
		str1=str.toLowerCase();
		for(int i=0;i<str.length();i++)
			total+=(int)str1.charAt(i)-96;
		System.out.print(str+" = "+total+" point");
	}
}