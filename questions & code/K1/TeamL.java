import java.util.*;

class TeamL{
	public static void main(String[] args){
		System.out.println("輸入1:攝氏轉華氏");
		System.out.println("輸入2:華氏轉攝氏");
		System.out.println("輸入-1離開");	
	
		Scanner sc = new Scanner(System.in);		
		int num = sc.nextInt();
		
		Change change = new Change();
		while(num!=-1){
			switch(num){	
				case 1:
					System.out.print("請輸入攝氏度數:");
					change.show();
					change.C();
					break;
				case 2:
					System.out.print("請輸入華氏度數:");
					change.show();
					change.F();
					break;
			
			}
		System.out.println();
		System.out.println();
		System.out.println("輸入1:攝氏轉華氏");
		System.out.println("輸入2:華氏轉攝氏");
		System.out.println("輸入-1離開");
		Scanner sc3 = new Scanner(System.in);		
		num = sc3.nextInt();
		}
	}
}
class Change{
	int tem;
	double ans;
	
	void show(){
        Scanner sc2 = new Scanner(System.in);
	tem = sc2.nextInt();
    	}
	
	public double C(){
	ans = (double)tem * 9 / 5 + 32;
	System.out.println("攝氏"+(double)tem+"轉華氏是"+ans+"度f");
	return ans;
	}
	
	public double F(){
	ans = (double)(tem-32) * 5 / 9;
	System.out.println("華氏"+(double)tem+"轉攝氏是"+ans+"度c");
	return ans;
	}
}