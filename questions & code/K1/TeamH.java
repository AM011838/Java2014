import java.util.Scanner;
import java.io.*;
public class TeamH {

	public static void main(String[] args) 
		
		throws IOException{
			Scanner scanner = new Scanner(System.in);

			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("輸入1:攝氏轉華氏");
			System.out.println("輸入2:華氏轉攝氏");
			System.out.println("輸入-1離開");
			
			int choice;
			choice = scanner.nextInt();
			
			while(choice != -1){

			switch(choice)
			{
			case 1:
				float c;
				System.out.print("請輸入攝氏度數:");
				String stri=br.readLine();
				c =Integer.parseInt(stri);
				System.out.println("攝氏" + c +"轉華氏是:" + ((c*9/5)+32) + "度f");
				break;
				
			case 2:
				float f;
				System.out.print("請輸入華氏度數:");
				String st = br.readLine(); 
				f = Integer.parseInt(st); 
				System.out.println("華氏" + f +"轉攝氏是:" + ((f-32)*5/9) + "度c");
                break;
			
                default :
                	System.out.println("請重新輸入");
                	break;
							
			}
			System.out.println("輸入1:攝氏轉華氏");
			System.out.println("輸入2:華氏轉攝氏");
			System.out.println("輸入-1離開");
			choice = scanner.nextInt();
			}
			


	}

}
