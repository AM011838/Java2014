
import java.util.Scanner;
import java.io.*;
public class TeamJ {
	public static  void main(String[] args) throws IOException {
		
	Scanner sc=new Scanner(System.in);
	int n;
	int k=-1;
	long  sum=0,b=0,c=0;
	String input;
	do{
		System.out.println("0:結束 1:輸入 2:寫入檔案");
		System.out.print("你的選擇:");
		n=sc.nextInt();
		switch(n){
			case 0: 
					k=0;
					break;
			case 1:
					
					System.out.println("請以 零.壹.貳.?.肆.伍.陸.柒.捌.玖.拾.佰.仟.萬.億輸入");
					
					System.out.print("中文數字:");
					input=sc.next();
					for(int i=0;i<input.length();i++){
								switch (input.charAt(i)) { 
									case '零': 
										c=0; 
										break; 
									case '壹': 
										c=1; 
										break; 
									case '貳': 
										c=2; 
										break; 
									case '參': 
										c=3; 
										break; 
									case '肆': 
										c=4; 
										break;
						 			case '伍': 
										c=5; 
										break; 
									case '陸': 
										c=6; 
										break; 
									case '柒': 
										c=7; 
										break; 
									case '捌': 
										c=8; 
										break; 
									case '玖': 
										c=9; 
										break;
									case '拾': 
										b=(c*10)+b; 
										c=0; 
										break;
									
									case '佰': 
										b=(c*100)+b;
										c=0; 
										break; 

									case '仟': 
										b=c*1000; 
										c=0; 
										break;

									 case '萬': 
										sum=(b+c)*10000+sum;
										c = 0; 
										b = 0; 
										break; 
									case '億': 
										sum = b + (c * 100000000); 
										c = 0; 
										b = 0; 
										break;
							}
						
						if (i == input.length()- 1){ 
							sum=sum+b+c; 
						}
						
					}
						System.out.println("阿拉伯數字:"+sum); 
						break;
			case 2:
					PrintWriter pw=new PrintWriter(new BufferedWriter (new FileWriter("money.txt")));
					
					System.out.println("寫入完畢");
					break;
			
		}
	}while(k!=0);
	}
	}