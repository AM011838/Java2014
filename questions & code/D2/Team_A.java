import java.util.Scanner;
import java.io.*;

public class test {
	static char[] Ch1 = { '箂', '滁', '禠', '把', '竩', 'ヮ', '嘲', '琺', '', '╤' };
	
	    static char[] Ch2 = { '珺', 'ㄕ', ''};
	
	    static String Ch1_1 = new String(Ch1);
	
	    static String Ch2_1 = new String(Ch2);
	
	    static int[] Money = { 10, 100, 1000};

	public static void main(String args[]) {
		for (int i = 1; i > 0; i++) {
			int choice;
			Scanner input = new Scanner(System.in);
			System.out.printf("%s", "0:挡");
			System.out.printf("%s", "1:块");
			System.out.printf("%s", "2:糶郎");

			choice = input.nextInt();
			switch (choice) {
			case 0:
				System.exit(0);
			case 1:
				System.out.print("匡拒:");
				System.out.println(choice);
				System.out.printf("叫'箂', '滁', '禠', '把', '竩', 'ヮ', '嘲', '琺', '', '╤' '珺', 'ㄕ', '','窾'");
				System.out.print("\nいゅ计:");
		
				Scanner sc = new Scanner(System.in);
				
				        String Temp = sc.next();
				
				        long Total = A(Temp);
				        String txt = String.valueOf( Total);
				        System.out.println("┰计:"+Total);

				break;
			case 2:
				 FileWriter fw;
				try {
					fw = new FileWriter("D:\\test.txt");
				    fw.write("");
				} catch (IOException e) {
					
					e.printStackTrace();
				}
				 
				 

				break;

			}
		}
	
		
		
	}
	public static long A(String Temp) {
		
		        long Total = 0;
		
		        if (!Temp.toString().contains("货")) {
		
		            if (!Temp.toString().contains("窾"))
		
		                Temp = "箂窾" + Temp;
		
		            Temp = "箂货" + Temp;
		
		        } else {
		
		            if (!Temp.toString().contains("窾")) {
		
		                String[] TenThousand = Temp.split("货");
		
		                Temp = TenThousand[0] + "货箂窾" + TenThousand[1];
		
		            }
		
		        }
		
		        String[] Ch1 = Temp.split("货");
		
		        String[] Ch2 = Ch1[1].split("窾");
		
		        Total = B(Ch1[0]) * 100000000 + B(Ch2[0]) * 10000 + B(Ch2[1]);
		
		        return Total;
		
		    }
		
		 
		
		    public static long B(String s) {
		
		        int F = 0;
		
		        long Total = 0;
		
		        for (int i = 0; i < s.length(); i++) {
		
		 
		
		            if (Ch1_1.toString().contains(s.subSequence(i, i + 1))) {
		
		 
		
		                F = Ch1_1.toString().indexOf((String) s.subSequence(i, i + 1));
		
		                if (i == s.length() - 1)
		
		                    Total += F;
		
		                continue;
		
		            } else if (Ch2_1.toString().contains(s.subSequence(i, i + 1))) {
		
		                int index = Ch2_1.toString().indexOf(
		
		                        (String) s.subSequence(i, i + 1));
		
		                Total += Money[index] * F;
		
		                continue;
		
		            }
		
		        }
		
		        return Total;
		
		    }

}
