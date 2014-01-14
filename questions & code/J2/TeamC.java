import java.util.Scanner; 
 
public class TeamC{
	private final static String rnums[]={"m","cm","d","cd","c","xc","l","xl","x","Mx","v","Mv","M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"}; 
	private final static int anums[]={1000000,900000,500000,400000,100000,90000,50000,40000,10000,9000,5000,4000,1000,900,500,400,100,90,50,40,10,9,5,4,1}; 
 
	public static void main(String[] args){ 
		Scanner sc=new Scanner(System.in); 
		System.out.println("input:");
		String input; 
		while(sc.hasNext()){ 
			do{
				input=sc.nextLine(); 
			}while(input.trim().length()<1); 
			if(input.charAt(0)=='#'){ 
				break;
			}
			if(isDigit(input)){ 
				int n = Integer.parseInt(input); 
				if(n>0&&n<4000000){ 
					System.out.println("output:");
					System.out.println(toRnums(n));
				}else{ 
					System.out.println("輸入的阿拉伯數字有誤！必須大於零且小於四百萬！");
				}
			}else{ 
				int n = toAnums(input); 
				if(toRnums(n).equals(input)) { 
					System.out.println("output:");
					System.out.println(n);
				}else{
					System.out.println("輸入的羅馬數字有誤！");
				}
			}
		}
	}
	public static boolean isDigit(String s){
		try {
			int i = Integer.parseInt(s); 
		} catch(Exception e) { 
			return false; 
		}
		return true; 
	}
	public static String toRnums(int num){ 
		if(num==0){ 
			return "ZERO";
		}else if(num<0||num>3999999){ 
			return "OVERFLOW";
		}
 
		StringBuilder output = new StringBuilder(); 
		for(int i=0;num>0&&i<anums.length;i++) 
		{
			while(num>=anums[i]){ 
				num-=anums[i];
				output.append(rnums[i]);
			}
		}
		return output.toString(); 
	}
	public static int toAnums(String s){ 
		int num=0;
		StringBuilder Buffer = new StringBuilder(s); 
		for(int i=0;Buffer.length()>0&&i<anums.length;i++) 
		{
			while(Buffer.indexOf(rnums[i])==0){ 
				num+=anums[i]; 
				Buffer.delete(0,rnums[i].length());
			}
		}
		return num; 
	}
}