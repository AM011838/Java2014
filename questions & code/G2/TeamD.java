import java.io.*;

public class TeamD {
	public static void main(String[] args) throws IOException{
		  BufferedReader br = 
				  new BufferedReader(new InputStreamReader(System.in)); 
		  
		  int a1,a2,a3,a4;
		  int b1,b2,b3,b4;
		  int c1,c2,c3,c4;
		  int d1,d2,d3,d4;
		  int tmp = 0;
		  
		  for(;;){
			  System.out.println("========");
			  System.out.println("1.蔬菜");
			  System.out.println("2.肉品");
			  System.out.println("3.海鮮");
			  System.out.println("4.水果");
			  System.out.println("5.結束");
			  System.out.println("========");
			  System.out.print("選擇:");
			  String str1 = br.readLine();
			  int n1 = Integer.parseInt(str1);
		  
			  if(n1 == 1){
				  for(;;){
					  System.out.println("========");
					  System.out.println("1.青江菜20元");
					  System.out.println("2.花椰菜25元");
					  System.out.println("3.高麗菜40元");
					  System.out.println("4.空心菜20元");
					  System.out.println("5.返回");
					  System.out.println("========");
					  System.out.print("選擇:");
					  String str2 = br.readLine();
					  int n2 = Integer.parseInt(str2);
			  
					  if(n2 == 1){
						  System.out.print("數量:");
						  String str3 = br.readLine();
						  a1 = Integer.parseInt(str3);
						  tmp = tmp + (20 * a1);
					  }
					  if(n2 == 2){
						  System.out.print("數量:");
						  String str4 = br.readLine();
						  a2 = Integer.parseInt(str4);
						  tmp = tmp + (25 * a2);
					  }
					  if(n2 == 3){
						  System.out.print("數量:");
						  String str5 = br.readLine();
						  a3 = Integer.parseInt(str5);
						  tmp = tmp + (40 * a3);
					  }
					  if(n2 == 4){
						  System.out.print("數量:");
						  String str6 = br.readLine();
						  a4 = Integer.parseInt(str6);
						  tmp = tmp + (20 * a4);
					  }
					  if(n2 == 5){
						  break;
					  }
				  }
			  }
			  if(n1 == 2){
				  for(;;){
					  System.out.println("========");
					  System.out.println("1.牛肉200元");
					  System.out.println("2.豬肉150元");
					  System.out.println("3.雞肉100元");
					  System.out.println("4.羊肉100元");
					  System.out.println("5.返回");
					  System.out.println("========");
					  System.out.print("選擇:");
					  String str11 = br.readLine();
					  int n2 = Integer.parseInt(str11);
			  
					  if(n2 == 1){
						  System.out.print("數量:");
						  String str7 = br.readLine();
						  b1 = Integer.parseInt(str7);
						  tmp = tmp + (200 * b1);
					  }
					  if(n2 == 2){
						  System.out.print("數量:");
						  String str8 = br.readLine();
						  b2 = Integer.parseInt(str8);
						  tmp = tmp + (150 * b2);
					  }
					  if(n2 == 3){
						  System.out.print("數量:");
						  String str9 = br.readLine();
						  b3 = Integer.parseInt(str9);
						  tmp = tmp + (100 * b3);
					  }
					  if(n2 == 4){
						  System.out.print("數量:");
						  String str10 = br.readLine();
						  b4 = Integer.parseInt(str10);
						  tmp = tmp + (100 * b4);
					  }
					  if(n2 == 5){
						  break;
					  }
				  }
			  }
			  if(n1 == 3){
				  for(;;){
					  System.out.println("========");
					  System.out.println("1.蛤蜊160元");
					  System.out.println("2.蝦子200元");
					  System.out.println("3.鮭魚150元");
					  System.out.println("4.小卷100元");
					  System.out.println("5.返回");
					  System.out.println("========");
					  System.out.print("選擇:");
					  String str12 = br.readLine();
					  int n2 = Integer.parseInt(str12);
			  
					  if(n2 == 1){
						  System.out.print("數量:");
						  String str13 = br.readLine();
						  c1 = Integer.parseInt(str13);
						  tmp = tmp + (160 * c1);
					  }
					  if(n2 == 2){
						  System.out.print("數量:");
						  String str14 = br.readLine();
						  c2 = Integer.parseInt(str14);
						  tmp = tmp + (200 * c2);
					  }
					  if(n2 == 3){
						  System.out.print("數量:");
						  String str15 = br.readLine();
						  c3 = Integer.parseInt(str15);
						  tmp = tmp + (150 * c3);
					  }
					  if(n2 == 4){
						  System.out.print("數量:");
						  String str16 = br.readLine();
						  c4 = Integer.parseInt(str16);
						  tmp = tmp + (100 * c4);
					  }
					  if(n2 == 5){
						  break;
					  }
				  }
			  }
			  if(n1 == 4){
				  for(;;){
					  System.out.println("========");
					  System.out.println("1.榴槤100元");
					  System.out.println("2.火龍果60元");
					  System.out.println("3.荔枝90元");
					  System.out.println("4.哈密瓜150元");
					  System.out.println("5.返回");
					  System.out.println("========");
					  System.out.print("選擇:");
					  String str17 = br.readLine();
					  int n2 = Integer.parseInt(str17);
			  
					  if(n2 == 1){
						  System.out.print("數量:");
						  String str18 = br.readLine();
						  d1 = Integer.parseInt(str18);
						  tmp = tmp + (100 * d1);
					  }
					  if(n2 == 2){
						  System.out.print("數量:");
						  String str19 = br.readLine();
						  d2 = Integer.parseInt(str19);
						  tmp = tmp + (60 * d2);
					  }
					  if(n2 == 3){
						  System.out.print("數量:");
						  String str20 = br.readLine();
						  d3 = Integer.parseInt(str20);
						  tmp = tmp + (90 * d3);
					  }
					  if(n2 == 4){
						  System.out.print("數量:");
						  String str21 = br.readLine();
						  d4 = Integer.parseInt(str21);
						  tmp = tmp + (150 * d4);
					  }
					  if(n2 == 5){
						  break;
					  }
				  }
			  }
			  if(n1 == 5){
				  System.out.println("總額:" + tmp);
				  break;
			  }
		  }
	}
}