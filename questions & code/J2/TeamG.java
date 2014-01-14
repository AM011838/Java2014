import java.io.*;
import java.util.Scanner; 
 
public class TeamG{
	
	private final static String nums[]={"v","Mv","M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; 
	private final static int inums[]={5000,4000,1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
 
	public static void main(String[] args){ 
		Scanner sc=new Scanner(System.in); 
		String input; 
		while(sc.hasNext()){ 
			do{
				input=sc.nextLine(); 
			}while(input.trim().length()<1); 
			if(input.charAt(0)=='@'){ 
				break;
		}
	
			if(isDigit(input)){ 
				int n = Integer.parseInt(input); 
				if(n>0&&n<1000){ 
					System.out.println(input + " = " + toRnums(n));
				}else{ 
					System.out.println("輸入數字有誤,必大於1000");
				}
			}else{ 
				int n = toAnums(input); 
				if(toRnums(n).equals(input)) { 
					System.out.println(input + " = " + n);
				}else{
					System.out.println("輸入的羅馬數字有誤");
				}
			}
		}
}
	public static boolean isDigit(String s){ 
		try { 
		} catch(Exception e) { 
			return false; 
		}
		return true; 
	}
	public static String toRnums(int num){ 
		if(num==0){ 
			return "ZERO";
		}else if(num<0||num>999){ 
			return "Y";
		}
 
		StringBuilder output = new StringBuilder();
		for(int i=0;num>0&&i<inums.length;i++) 
		{
			while(num>=inums[i]){ 
				num-=inums[i];
				output.append(nums[i]);
			}
		}
		return output.toString(); 
	}
	public static int toAnums(String s){ 
		int num=0;
		StringBuilder Buffer = new StringBuilder(s); 
		for(int i=0;Buffer.length()>0&&i<inums.length;i++) 
		{
			while(Buffer.indexOf(nums[i])==0){ 
				num+=inums[i]; 
				Buffer.delete(0,nums[i].length()); 
			}
		}
		return num; 
	}
}