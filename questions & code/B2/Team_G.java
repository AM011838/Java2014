import java.io.*;
public class Team_G
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int Date=5,Class=10;
		String[][] schedule=new String[Class][Date];
		String[] week={"一","二","三","四","五","六","七","八","九","十"}; 
		for(int j=0;j<Date;j++)
		{
			System.out.println("星期"+week[j]);
			for(int i=0;i<Class;i++)
			{
				System.out.print("第"+week[i]+"節:");
				schedule[i][j]=br.readLine();
				if(schedule[i][j]=="\n")
					schedule[i][j]=" ";
			}
		}
		for(int i=0;i<Date;i++)
			System.out.print("\t"+week[i]+"\t");
		System.out.println();
		for(int i=0;i<Class;i++)
		{
			System.out.print(i+1);
			for(int j=0;j<Date;j++)
			{
					System.out.print("\t"+schedule[i][j]+"\t");
			}
			System.out.println();
		} 
		System.out.println(); 
		int hold=1;
		while(hold!=-1)
		{
			System.out.println("選擇查詢方式: ");
			System.out.println("1.以時間查詢課程 2.以課程查詢時間 3.結束查詢");
			int num=Integer.parseInt(br.readLine());
			switch(num)
			{
				case 1:
					System.out.print("輸入星期:");
					int n=Integer.parseInt(br.readLine());
					System.out.print("輸入第幾節:");
					int f=Integer.parseInt(br.readLine());
					System.out.println(schedule[f-1][n-1]);
					break;
				case 2:
					System.out.println("輸入課程名稱: ");
					String C=br.readLine();
					for(int i=0;i<Class;i++)
					{
						for(int j=0;j<Date;j++)
						{
							if(C.equals(schedule[i][j]))
								System.out.println("星期"+(j+1)+"的第 "+(i+1)+"節");
						}
					}
					break;
				case 3:
					System.out.println("stop search.");
					hold=-1;
					break;
				default:
					System.out.println("error");
					break;
			}
		}
	}
}

 