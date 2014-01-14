import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class SSS {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int[][] fianl = new int[4][4];
		int out=0;
		int money = 0;
		while(out==0){
			System.out.println("1蔬菜,2肉品,3海鮮,4水果,5離開...");
			String str = br.readLine();
			int count = Integer.parseInt(str);
				switch(count){
					case 1:
						int out1 = 0;
						while(out1==0){
							System.out.println("1.青江菜20元");
							System.out.println("2.花椰菜25元");
							System.out.println("3.高麗菜40元");
							System.out.println("4.空心菜20元");
							System.out.println("5.離開...");
							String str1 = br.readLine();
							int buy = Integer.parseInt(str1);
							int many = 0;
							if(buy ==1){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*20+"元");
								fianl[0][0]+=many;
								money=money+many*20;
							}
							if(buy ==2){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*25+"元");
								fianl[0][1]+=many;
								money=money+many*25;
							}
							if(buy ==3){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*40+"元");
								fianl[0][2]+=many;
								money=money+many*40;
							}
							if(buy ==4){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*20+"元");
								fianl[0][3]+=many;
								money=money+many*20;
							}
							if(buy ==5){
								out1=1;
							}
						}
						break;
					case 2:
						int out2 = 0;
						while(out2==0){
							System.out.println("1.牛肉200元");
							System.out.println("2.豬肉150元");
							System.out.println("3.雞肉100元");
							System.out.println("4.羊肉100元");
							System.out.println("5.離開...");
							String str1 = br.readLine();
							int buy = Integer.parseInt(str1);
							int many = 0;
							if(buy ==1){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*200+"元");
								fianl[1][0]+=many;
								money=money+many*200;
							}
							if(buy ==2){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*150+"元");
								fianl[1][1]+=many;
								money=money+many*150;
							}
							if(buy ==3){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*100+"元");
								fianl[1][2]+=many;
								money=money+many*100;
							}
							if(buy ==4){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*100+"元");
								fianl[1][3]+=many;
								money=money+many*100;
							}
							if(buy ==5){
								out2=1;
							}
						}
						break;
					case 3:
						int out3 = 0;
						while(out3==0){
							System.out.println("1.蛤蠣160元");
							System.out.println("2.蝦子200元");
							System.out.println("3.鮭魚150元");
							System.out.println("4.小卷100元");
							System.out.println("5.離開...");
							String str1 = br.readLine();
							int buy = Integer.parseInt(str1);
							int many = 0;
							if(buy ==1){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*160+"元");
								fianl[2][0]+=many;
								money=money+many*160;
							}
							if(buy ==2){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*200+"元");
								fianl[2][1]+=many;
								money=money+many*200;
							}
							if(buy ==3){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*150+"元");
								fianl[2][2]+=many;
								money=money+many*150;
							}
							if(buy ==4){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*100+"元");
								fianl[2][3]+=many;
								money=money+many*100;
							}
							if(buy ==5){
								out3=1;
							}
						}
						break;
					case 4:
						int out4 = 0;
						while(out4==0){
							System.out.println("1.榴槤100元");
							System.out.println("2.火龍果60元");
							System.out.println("3.荔枝90元");
							System.out.println("4.哈密瓜150元");
							System.out.println("5.離開...");
							String str1 = br.readLine();
							int buy = Integer.parseInt(str1);
							int many = 0;
							if(buy ==1){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*100+"元");
								fianl[3][0]+=many;
								money=money+many*100;
							}
							if(buy ==2){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*60+"元");
								fianl[3][1]+=many;
								money=money+many*60;
							}
							if(buy ==3){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*90+"元");
								fianl[3][2]+=many;
								money=money+many*90;
							}
							if(buy ==4){
								System.out.println("數量");
								str1 = br.readLine();
								many = Integer.parseInt(str1);
								System.out.println(many*150+"元");
								fianl[3][3]+=many;
								money=money+many*150;
							}
							if(buy ==5){
								out4=1;
							}
						}
						break;
					case 5:
						out = 1;
						break;
				}
		}
		for(int i=0;i<4;i++){
			for(int j=0;j<4;j++){
				if(fianl[i][j]!=0){
					if(i==0){
						if(j==0){
							System.out.println("青江菜20元*"+fianl[i][j]);
						}
						else if(j==1){
							System.out.println("花椰菜25元*"+fianl[i][j]);
						}
						else if(j==2){
							System.out.println("高麗菜40元*"+fianl[i][j]);
						}
						else{
							System.out.println("空心菜20元*"+fianl[i][j]);
						}
					}
					else if(i==1){
						if(j==1){
							System.out.println("牛肉200元*"+fianl[i][j]);
						}
						else if(j==1){
							System.out.println("豬肉150元*"+fianl[i][j]);
						}
						else if(j==2){
							System.out.println("雞肉100元*"+fianl[i][j]);
						}
						else{
							System.out.println("羊肉100元*"+fianl[i][j]);
						}
					}
					else if(i==2){
						if(j==0){
							System.out.println("蛤蠣160元*"+fianl[i][j]);
						}
						else if(j==1){
							System.out.println("蝦子200元*"+fianl[i][j]);
						}
						else if(j==2){
							System.out.println("鮭魚150元*"+fianl[i][j]);
						}
						else{
							System.out.println("小卷100元*"+fianl[i][j]);
						}
					}
					else{
						if(j==0){
							System.out.println("榴槤100元*"+fianl[i][j]);
						}
						else if(j==1){
							System.out.println("火龍果60元*"+fianl[i][j]);
						}
						else if(j==2){
							System.out.println("荔枝90元*"+fianl[i][j]);
						}
						else{
							System.out.println("哈密瓜150元*"+fianl[i][j]);
						}
					}
				}
			}
		}
		System.out.println("總額"+money);
	}
}