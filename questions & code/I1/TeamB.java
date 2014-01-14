import java.io.*;


public class TeamB {
	public static void main(String[] args)throws IOException
	{
		String yy[]={"零","壹","貳","參","肆","伍","陸","柒","捌","玖"};
		String xx[]={"拾"};
		
		String str1="Teemo rides a thin line between chipper compatriot and unrepentant killer,but there`s no one else I`d rather have as a friend.";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("使用者輸入要檢索的文字:");
		
		String str2=br.readLine();
		char ch =str2.charAt(0);
		int num =str1.indexOf(ch);
		
		
		
		
		int a,b,num1;
		num1=num+1;
		a=num1%10;
		b=num1/10;
		
		if(a==8&&b==6)//判斷是否等於killer
		System.out.println("Teemo在第"+ yy[6]+xx[0]+yy[8] + "個位置");
		else
			System.out.println("Teemo is not here");
		

	}

}
