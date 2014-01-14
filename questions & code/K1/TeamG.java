import java.util.Scanner;
public class G
{
		public static void main(String[] args)throws Exception{
		int chose = 0;
		Scanner sc = new Scanner(System.in);		
		Operation operation = new Operation();
		System.out.println("輸入1:攝氏轉華氏");
		System.out.println("輸入2:華氏轉攝氏");
		System.out.println("輸入-1:離開");
		while(chose != -1){			
			double x = 0;
			double y = 0;
			chose = sc.nextInt();
		switch(chose){
			case 1:
				System.out.println("輸入攝氏:");
				x = sc.nextDouble();
				System.out.println("攝氏"+x+"轉華氏是:"+operation.getbrtoarea(x));
				break;
			case 2:
				System.out.println("輸入華氏:");
				x = sc.nextDouble();
				System.out.println("華氏"+x+"轉攝氏是:"+operation.areatogetbr(x));
				break;
			case -1:
				break;
			default :
				System.out.print("Error\n");
				break;
			}
		System.out.println("輸入1:攝氏轉華氏");
		System.out.println("輸入2:華氏轉攝氏");
		System.out.println("輸入-1:離開");
		}
	System.out.println("END");
	}
}
class Operation{
	double getbrtoarea(double getbr){
		double area;
		area=(9*0.2)*getbr+32;
		return area;
	}
	
	double areatogetbr(double area){
		double getbr;
		getbr = (area-32)*5/9;
		return getbr;
	}
}