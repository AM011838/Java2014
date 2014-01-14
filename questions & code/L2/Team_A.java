import java.util.Scanner;
public class C1 {
	public static void main(String args[]) {
		new C1();
	}
	
	
	public C1() {
		System.out.print("請輸入陣列大小:");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int[] sum = new int[8];
		int array[][] = new int[num][num];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = getRndNumber(); // 陣列亂數給值
			}
		}
		for (int i = 0; i < array.length; i++) {
			//System.out.print("第 " + (i + 1) + " 列 ");
			for (int j = 0; j < array[i].length; j++) {
				System.out.print("" + array[i][j] + ""); // 印出陣列內容
			}
			System.out.print("\n");
		}
		
		 for(int i=0;i<array.length;i++)
		  {
		   sum[6]+=array[i][i];
		  }
		 
		  for(int i=0,j=array.length-1;i<array.length&&j>=0;i++,j--)
		  {
			  
		   sum[7]+=array[i][j];
		  }
		  
			System.out.print("對角線總和是:");
			System.out.print(sum[6]+sum[7]-array[num-2][num-2]);
	}

	int getRndNumber() { // 取得 50~100(含)
		return 1 + (int) (Math.random() * 9);
	}

	

}