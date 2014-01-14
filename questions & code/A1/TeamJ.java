import java.util.*;

public class TeamJ{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int z=0;
	int nn;

	while(z!=1){
		System.out.println("1.終極密碼");
		System.out.println("2.猜數字");
		System.out.println("3.結束");
		nn=sc.nextInt();
		switch(nn){
			case 1:
				int num;
				num=(int)(Math.random()*100+1);
				System.out.println("請輸入猜測的數字(介於1~100間)");
				int ng=sc.nextInt();
				int aa=0;
				int xx=1,yy=100;
				int gt=1;
				while(aa!=1){
					if(ng<num){
						xx=ng;
						System.out.println("請輸入猜測的數字("+xx+"~"+yy+")");
					}
					if(ng>num){
						yy=ng;
						System.out.println("請輸入猜測的數字("+xx+"~"+yy+")");
					}
					if(ng==num){
						System.out.println("恭喜猜對了!!");
						System.out.println("您猜了"+gt+"次，高手!!");
						aa++;
						break;
					}
					ng=sc.nextInt();
					gt++;
				}
				break;
			case 2:
				int[] iArray = new int[4];
				  int[] eArray = new int[4];
				  int i;
				  int ans [] = new int[4];
				  int A = 0, B = 0;
				  boolean theSame;
				  do {
				   theSame = false;
				   for(i = 0; i < 4; i++) {
				    iArray[i]=(int)(Math.random()*9+1);
				   }
				   for (int x = 0; x < 3; x++) {
				    for(int y = x + 1; y < 4; y++) {
				     if(iArray[x] == iArray[y]) {
				      theSame = true;
				      break;
				     }
				    }
				   }
				  } while (theSame);
				  
				  for(i = 0; i < iArray.length; i++){}
				  
				  Scanner scanner = new Scanner(System.in); 
				  System.out.println("請猜四個數字(1-9)(不可有一樣的數字)\n");
				  
				  while (A != 4) {
				   A = 0; B = 0;
				   for (int f = 1; f <= ans.length; f++) {
				    System.out.print("請輸入第" + f + "個數字:");
				    ans[f-1] = scanner.nextInt();
				   }
				   for(int j = 0; j < ans.length; j++) {
				    System.out.print(ans[j]+" ");
				   }
				   for (int u = 0; u < ans.length; u++) {
				    if(iArray[u] == ans[u]) {
				     A++;
				     continue;
				    }
				    for(int k = 0; k < ans.length; k++) {
				     if(ans[u] == iArray[k]) {
				      B++;
				      break;
				     }
				    }
				   }
				   System.out.println("\n"+A+"A");
				   System.out.println(B+"B");
				  } 	
				break;
			case 3:
				z++;
				break;
		}
	}
}
}
