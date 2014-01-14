import java.io.*;
public class Team_G
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		String[][] word={{"蟑螂","蟋蟀","麵包蟲"},
						 {"麥麩","番薯葉"}
						 };
		int buysum=0,salesum=0,a=0,b=0,c=0,d=0,e=0;
		int akg=0,bkg=0,ckg=0,dpacket=0,epacket=0;	
		int hold=1;
		while(hold!=-1)
		{
			System.out.print("1.賣 2.買 3.總和 4.結束\n"+"Input choose:");
			int num=Integer.parseInt(br.readLine());
			switch(num)
			{
				case 1:
					System.out.println("1."+word[0][0]+"2."+word[0][1]+"3."+word[0][2]+"\nInput sale:");
					int sell=Integer.parseInt(br.readLine());
					switch(sell)
					{
						case 1:
							System.out.println("一斤賣200元 要賣幾斤:");
							akg=Integer.parseInt(br.readLine());
							a+=akg;
							salesum+=200*a;
							break;
						case 2:
							System.out.println("一斤賣150元 要賣幾斤:");
							bkg=Integer.parseInt(br.readLine());
							b+=bkg;
							salesum+=150*b;
							break;
						case 3:
							System.out.println("一斤賣100元 要賣幾斤:");
							ckg=Integer.parseInt(br.readLine());
							c+=ckg;
							salesum+=100*c;
							break;
						default:
							System.out.println("error");
							break;
					}
					break;
				case 2:
					System.out.println("1."+word[1][0]+"2."+word[1][1]+"\nInput buy:");
					int buy=Integer.parseInt(br.readLine());
					switch(buy)
					{
						case 1:
							System.out.println("一包250元 要買幾包:");
							dpacket=Integer.parseInt(br.readLine());
							d+=dpacket;
							buysum+=d*250;
							break;
						case 2:
							System.out.println("一包50元 要買幾包:");
							epacket=Integer.parseInt(br.readLine());
							e+=epacket;
							buysum+=e*50;
							break;
							default:
							System.out.println("error");
							break;
					}
					break;
				case 3:
					System.out.println("目前賣出:"+salesum+"目前買入:"+buysum);
					break;
				case 4:
					System.out.println("賣:");
					System.out.println("\t"+word[0][0]+":"+a+"斤 共"+200*a+"元");
					System.out.println("\t"+word[0][1]+":"+b+"斤 共"+150*b+"元");
					System.out.println("\t"+word[0][2]+":"+c+"斤 共"+100*c+"元");
					System.out.println("買:");
					System.out.println("\t"+word[1][0]+":"+d+"包 共"+d*250+"元");
					System.out.println("\t"+word[1][1]+":"+e+"包 共"+e*50+"元");
					System.out.println("收入總和:"+salesum);
					System.out.println("支出總和:"+buysum);
					System.out.println("淨賺利潤:"+(salesum-buysum));
					
					PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("bug.txt")));
					pw.println("賣:");
					pw.println("\t"+word[0][0]+":"+a+"斤 共"+200*a+"元");
					pw.println("\t"+word[0][1]+":"+b+"斤 共"+150*b+"元");
					pw.println("\t"+word[0][2]+":"+c+"斤 共"+100*c+"元");
					pw.println("買:");
					pw.println("\t"+word[1][0]+":"+d+"包 共"+d*250+"元");
					pw.println("\t"+word[1][1]+":"+e+"包 共"+e*50+"元");
					pw.println("收入總和:"+salesum);
					pw.println("支出總和:"+buysum);
					pw.println("淨賺利潤:"+(salesum-buysum));
					pw.close();
					hold=-1;
					break;
				default:
					System.out.println("error");
					break;
			}
		}
	}
}