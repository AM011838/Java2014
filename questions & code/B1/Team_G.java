import java.io.*;
class Team_G
{
	public static void main(String args[])throws IOException
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("輸入查詢西元年分：");
			int year = Integer.parseInt(br.readLine());
			int C = year/4 - year/100 + year/400;
			int Da = ((year-1)*365 + C)%7;
			int Date[] = new int[42];
			PrintWriter pw=
					new PrintWriter(new BufferedWriter(new FileWriter("YEAR.txt")));
			if(((year%4) == 0 || (year%400) == 0) && (year%100)!= 0)
			{
				pw.println("西元："+year+"為閏年");
				for(int i=1;i<=12;i++)
				{
					int c = 1;
					if(i==2)
					{
						for(int x=Da;x<42;x++,c++)
						{
							Date[x] = c;
							if(c == 29)
							{
								Da = (x+1)%7;
								break;
							}
						}
					}
					else if(i==4 || i==6 || i==9 || i==11)
					{
						for(int x=Da;x<42;x++,c++)
						{
							Date[x] = c;
							if(c == 30)
							{
								Da = (x+1)%7;
								break;
							}
						}
					}
					else
					{
						for(int x=Da;x<42;x++,c++)
						{
							Date[x] = c;
							if(c == 31)
							{
								Da = (x+1)%7;
								break;
							}
						}
					}
					pw.println(i+"月 ");
					pw.println("日\t一\t二\t三\t四\t五\t六");
					for(int j=0;j<6;j++)
					{
						for(int k=j*7;k<((j*7)+7);k++)
						{
							if(Date[k] == 0)
							{
								pw.print("\t");
								continue;
							}
							pw.print(Date[k]+"\t");
						}
						pw.println();
					}
					pw.println();
					for(int x=0;x<42;x++)
						Date[x] = 0;
				}
			}
			else
			{
				Da++;
				pw.println("西元："+year+"為平年");
				for(int i=1;i<13;i++)
				{
					int c = 1;
					if(i==2)
					{
						for(int x=Da;x<42;x++,c++)
						{
							Date[x] = c;
							if(c == 28)
							{
								Da = (x+1)%7;
								break;
							}
						}
					}
					else if(i==4 || i==6 || i==9 || i==11)
					{
						for(int x=Da;x<42;x++,c++)
						{
							Date[x] = c;
							if(c == 30)
							{
								Da = (x+1)%7;
								break;
							}
						}
					}
					else
					{
						for(int x=Da;x<42;x++,c++)
						{
							Date[x] = c;
							if(c == 31)
							{
								Da = (x+1)%7;
								break;
							}
						}
					}
					pw.println(i+"月 ");
					pw.println("日\t一\t二\t三\t四\t五\t六");
					for(int j=0;j<6;j++)
					{
						for(int k=j*7;k<((j*7)+7);k++)
						{
							if(Date[k] == 0)
							{
								pw.print("\t");
								continue;
							}
							pw.print(Date[k]+"\t");
						}
						pw.println();
					}
					pw.println();
					for(int x=0;x<42;x++)
						Date[x] = 0;
				}
			}
			pw.close();
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
		try
		{
			BufferedReader br =
					new BufferedReader(new FileReader("YEAR.txt"));
			for(int i=0;i<109;i++)
			{
				String stri =br.readLine();
				System.out.println(stri);
			}
			br.close();
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
	}
}