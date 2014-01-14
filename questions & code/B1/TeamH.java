import java.io.*;

public class TeamH
{
	public static void main(String args[])throws IOException
	{
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
				System.out.println("輸入西元年分：") ;
			int year = Integer.parseInt(br.readLine()) ;
			int y = (year/4) - (year/100) + (year/400) ;
			int day = ((year-1) * 365 + y) % 7 ;
			int data[] = new int[42] ;
			PrintWriter ya=
					new PrintWriter(new BufferedWriter(new FileWriter("年歷.txt"))) ;
			if(((year%4) == 0 || (year%400) == 0) && (year%100) != 0)
			{
				ya.println("西元： " + year + "為閏年") ;
				for(int i = 1 ; i <= 12 ; i++)
				{
					int c = 1 ;
					if(i == 2)
					{
						for(int x = day ; x < 42 ; x++ , c++)
						{
							data[x] = c ;
							if(c == 29)
							{
								day = (x+1) % 7 ;
								break ;
							}
						}
					}
					else if(i == 4 || i == 6 || i == 9 || i == 11)
					{
						for(int x = day ; x < 42 ; x++ , c++)
						{
							data[x] = c ;
							if(c == 30)
							{
								day = (x + 1) % 7 ;
								break ;
							}
						}
					}else
					{
						for(int x = day ; x < 42 ; x++ , c++)
						{
							data[x] = c ;
							if(c == 31)
							{
								day = (x + 1) % 7 ;
								break ;
							}
						}
					}
					ya.println(i + "月 ");
					ya.println("日\t一\t二\t三\t四\t五\t六") ;
					for(int j = 0 ; j < 6 ; j++)
					{
						for(int k = j * 7 ; k < ((j*7)+7);k++)
						{
							if(data[k] == 0)
							{
								ya.print("\t");
								continue;
							}
							ya.print(data[k]+"\t");
						}
						ya.println();
					}
					ya.println();
					for(int x=0;x<42;x++)
						data[x] = 0;
				}
			}
			else
			{
				day++ ;
				ya.println("西元：" + year + "為平年") ;
				for(int i = 1 ; i < 13 ; i++)
				{
					int c = 1 ;
					if(i == 2)
					{
						for(int x = day ; x < 42 ; x++ , c++)
						{
							data[x] = c;
							if(c == 28)
							{
								day = (x+1)%7;
								break;
							}
						}
					}
					else if(i==4 || i==6 || i==9 || i==11)
					{
						for(int x = day ; x < 42 ; x++ , c++)
						{
							data[x] = c ;
							if(c == 30)
							{
								day = (x + 1) % 7 ;
								break ;
							}
						}
					}
					else
					{
						for(int x = day ; x < 42 ; x++ , c++)
						{
							data[x] = c ;
							if(c == 31)
							{
								day = (x + 1) % 7 ;
								break ;
							}
						}
					}
					ya.println(i + "月 ") ;
					ya.println("日\t一\t二\t三\t四\t五\t六") ;
					for(int j=0;j<6;j++){
						for(int k=j*7;k<((j*7)+7);k++)
						{
							if(data[k] == 0)
							{
								ya.print("\t");
								continue;
							}
							ya.print(data[k]+"\t");
						}
						ya.println();
					}
					ya.println();
					for(int x=0;x<42;x++)
						data[x] = 0;
				}
			}
			ya.close();
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
		try
		{
			BufferedReader ty =
					new BufferedReader(new FileReader("年歷.txt"));
			for(int i=0;i<109;i++)
			{
				String stri =ty.readLine();
				System.out.println(stri);
			}
			ty.close();
		}
		catch(IOException e)
		{
			System.out.println("error");
		}
	}
}