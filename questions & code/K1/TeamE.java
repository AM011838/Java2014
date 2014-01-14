import java.util.*;
import java.lang.Math;
public class TeamE{
  public static void main(String args[]){    
  	Scanner sc = new Scanner(System.in);
	int x,y;

	System.out.println("輸入1攝氏轉華氏");
	System.out.println("輸入2華氏轉攝氏");
	System.out.println("輸入-1離開");
	x=sc.nextInt();
		while(x!=-1){
	    	switch(x){
	    		case 1: 
	    		System.out.println("請輸入攝氏度數");
				y=sc.nextInt();
				double z =y*(9.0/5)+32;
				System.out.println("攝氏"+(float)y+"轉華氏是"+z+"度f");
				System.out.println("輸入1攝氏轉華氏");
				System.out.println("輸入2華氏轉攝氏");
				System.out.println("輸入-1離開");
				x=sc.nextInt();
				break;
			case 2:
				System.out.println("請輸入華氏度數");
				y=sc.nextInt();
				double w = (y-32)*5/9.0;
				System.out.println("華氏"+(float)y+"轉攝氏是"+w+"度c");
				System.out.println("輸入1攝氏轉華氏");
				System.out.println("輸入2華氏轉攝氏");
				System.out.println("輸入-1離開");
				x=sc.nextInt();
				break;
	    		default:
				System.out.println("輸入1攝氏轉華氏");
				System.out.println("輸入2華氏轉攝氏");
				System.out.println("輸入-1離開");
				x=sc.nextInt();
				break;
                }
	}

   }
}
    
  
  