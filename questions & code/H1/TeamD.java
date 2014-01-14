import java.io.*;

public class TeamD {
	public static void main(String[] args) throws IOException{
		  BufferedReader br = 
				  new BufferedReader(new InputStreamReader(System.in)); 
		  
		  int tmp1 = 0;
		  int tmp2 = 0;
		  int b1 = 0;
		  int b2 = 0;
		  int s1 = 0;
		  int s2 = 0;
		  int s3 = 0;
		  
		  for(;;){
			  System.out.println("===============");
			  System.out.println("1.Buy");
			  System.out.println("2.Sale");
			  System.out.println("3.Total");
			  System.out.println("4.End");
			  System.out.println("===============");
			  System.out.print("Please enter your choice:");
			  String str1 = br.readLine();
			  int n = Integer.parseInt(str1);
			  
			  if(n == 1){
				  System.out.println("====================");
				  System.out.println("1.Gluten");
				  System.out.println("2.Potato greens");
				  System.out.println("====================");
				  System.out.print("Please enter your choice:");
				  String str2 = br.readLine();
				  int j = Integer.parseInt(str2);
				  if(j == 1){
					  System.out.println("600g = 250");
					  System.out.print("How many parts you want to buy:");
					  String str4 = br.readLine();
					  b1 = Integer.parseInt(str4);
					  tmp1 = tmp1 + (250 * b1); 
				  }
				  if(j == 2){
					  System.out.println("600g = 50");
					  System.out.print("How many parts you want to buy:");
					  String str5 = br.readLine();
					  b2 = Integer.parseInt(str5);
					  tmp1 = tmp1 + (50 * b2); 
				  }
			  }
			  
			  if(n == 2){
				  System.out.println("====================");
				  System.out.println("1.Blattodea");
				  System.out.println("2.Gryllus");
				  System.out.println("3.Tenebrio molitor");
				  System.out.println("====================");
				  System.out.print("Please enter your choice:");
				  String str3 = br.readLine();
				  int k = Integer.parseInt(str3);
				  if(k == 1){
					  System.out.println("600g = 200");
					  System.out.print("How many parts you want to sale:");
					  String str6 = br.readLine();
					  s1 = Integer.parseInt(str6);
					  tmp2 = tmp2 + (200 * s1); 
				  }
				  if(k == 2){
					  System.out.println("600g = 150");
					  System.out.print("How many parts you want to sale:");
					  String str7 = br.readLine();
					  s2 = Integer.parseInt(str7);
					  tmp2 = tmp2 + (150 * s2); 
				  }
				  if(k == 3){
					  System.out.println("600g = 100");
					  System.out.print("How many parts you want to sale:");
					  String str8 = br.readLine();
					  s3 = Integer.parseInt(str8);
					  tmp2 = tmp2 + (100 * s3); 
				  }
			  }
			  if(n == 3){
				  System.out.println("Total cost:" + tmp1 + "Total sale:" + tmp2);
			  }
			  if(n == 4){
				  System.out.println("Buy:");
				  System.out.println("Gluten:" + b1 + "parts Total:" + (250 * b1));
				  System.out.println("Potato greens:" + b2 + "parts Total:" + (250 * b2));
				  System.out.println("Sale:");
				  System.out.println("Blattodea:" + s1 + "parts Total:" + (200 * s1));
				  System.out.println("Gryllus:" + s2 + "parts Total:" + (150 * s2));
				  System.out.println("Tenebrio molitor:" + s3 + "parts Total:" + (100 * s3));
				  System.out.println("");
				  System.out.println("Total sale:" + tmp2);
				  System.out.println("Total cost:" + tmp1);
				  System.out.println("Net income:" + (tmp2 - tmp1));
				  try{
					  PrintWriter txtout = new PrintWriter(new BufferedWriter(new FileWriter("bug.txt")));
					  txtout.println("Buy:");
					  txtout.println("Gluten:" + b1 + "parts Total:" + (250 * b1));
					  txtout.println("Potato greens:" + b2 + "parts Total:" + (250 * b2));
					  txtout.println("Sale:");
					  txtout.println("Blattodea:" + s1 + "parts Total:" + (200 * s1));
					  txtout.println("Gryllus:" + s2 + "parts Total:" + (150 * s2));
					  txtout.println("Tenebrio molitor:" + s3 + "parts Total:" + (100 * s3));
					  txtout.println("");
					  txtout.println("Total sale:" + tmp2);
					  txtout.println("Total cost:" + tmp1);
					  txtout.println("Net income:" + (tmp2 - tmp1));
					  txtout.close();
				  }
				  catch(Exception e){
					  e.printStackTrace();
				  }
				  System.out.print("End");
				  break;
			  }
		  }
	}
}