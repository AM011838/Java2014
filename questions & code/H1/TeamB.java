import  java.io.*;
public class TeamB {
		public static void main(String[] args) throws IOException{
		BufferedReader br =
		new BufferedReader(new InputStreamReader(System.in));
		int bsum=0,sum=0,a=0,b=0,c=0,d=0,e=0;
		int akg=0,bkg=0,ckg=0,dp=0,ep=0;
		boolean cheeck=true;
		do{
			System.out.print("1. 賣 2. 買 3. 總和 4. 結束\n"+"輸入選擇:");
			int num=Integer.parseInt(br.readLine());
			switch(num){
				case 1:
					System.out.println("1.蟑螂 2. 蟋蟀 3. 麵包蟲\n"+"輸入選擇:");
					int sell=Integer.parseInt(br.readLine());
					switch(sell){
						case 1:
							System.out.println("一斤賣200元 要賣幾斤:");
							akg=Integer.parseInt(br.readLine());
							a+=akg;
							sum+=200*a;
							break;
						case 2:
							System.out.println("一斤賣150元 要賣幾斤:");
							bkg=Integer.parseInt(br.readLine());
							b+=bkg;
							sum+=150*b;
							break;
						case 3:
							System.out.println("一斤賣100元 要賣幾斤:");
							ckg=Integer.parseInt(br.readLine());
							c+=ckg;
							sum+=100*c;
							break;
						default:
						System.out.println("error");
						break;
					}
					break;
				case 2:
					System.out.println("1.麥麩 2. 番薯葉\n"+"輸入選擇:");
					int buy=Integer.parseInt(br.readLine());
					switch(buy){
						case 1:
							System.out.println("一包250元 要買幾包:");
							dp=Integer.parseInt(br.readLine());
							d+=dp;
							bsum+=d*250;
							break;
						case 2:
							System.out.println("一包50元 要買幾包:");
							ep=Integer.parseInt(br.readLine());
							e+=ep;
							bsum+=e*50;
							break;
						
							default:
							System.out.println("error");
							break;
					}
					break;
				case 3:
					System.out.println("目前賣出:"+sum+"目前買入:"+bsum);
					break;
				case 4:
					System.out.print("賣:\n"+"蟑螂:"+a+"斤 共"+200*a+"元\n蟋蟀:"+b+"斤 共"+150*b+"元\n麵包蟲:"+c+"斤 共"+100*c+"元\n");
					System.out.print("買:\n"+"麥麩:"+d+"包 共"+d*250+"元\n番薯葉:"+e+"包 共"+e*50+"元\n");
					System.out.print("收入總和:"+sum+"\n支出總和:"+bsum+"\n淨賺利潤:"+(sum-bsum)+"\nEXIT");
					try{
						PrintWriter pw=new PrintWriter
						(new BufferedWriter(new FileWriter("bug.txt")));
						pw.println("賣:");
						pw.println("蟑螂:"+a+"斤 共"+200*a+"元");
						pw.println("蟋蟀:"+b+"斤 共"+150*b+"元");
						pw.println("麵包蟲:"+c+"斤 共"+100*c+"元");
						pw.println("買:");
						pw.println("麥麩:"+d+"包 共"+d*250+"元");
						pw.println("番薯葉:"+e+"包 共"+e*50+"元");
						pw.print("收入總和:"+sum+"\n支出總和:"+bsum+"\n淨賺利潤:"+(sum-bsum)+"\n");
						pw.close();
						}
					catch(IOException w){
						System.out.println("error");
					}
					cheeck=false;
					break;
			default:
				System.out.println("error");
				break;
			}
		}while(cheeck);
		}
}

 

 

 

 