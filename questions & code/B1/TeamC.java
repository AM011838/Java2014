import java.io.*;
public class TeamC{
public static void main(String[] args)throws IOException
{
BufferedReader input = new BufferedReader
(new InputStreamReader(System.in));

int year;
System.out.print("輸入查詢西元年分: ");
year = Integer.parseInt(input.readLine());
if(year%400==0)
System.out.print("西元:"+year+"是閏年"); 
else if ((year%4==0)&&(year%100!=0))
System.out.println("西元:"+year+"是閏年"); 
else

System.out.println("您輸入的"+year+"是平年"); 


int[] month={31,29,31,30,31,30,31,31,30,31,30,31};
     int tab=0;
     int sum=1;
     int checkyear=1920;
     for(int i=year;i<checkyear;i++)
     {
      if(i%4==0)
      {
       sum +=366;
      }
      else
      {
       sum +=365;
      }
     }
     if((checkyear-1912)%4!=0)
     {
      month[1]=28;
     }
     for(int j=0;j<12;j++)
      {
       tab=sum%7;
       System.out.println((j+1)+"月");
       System.out.println("日      一      二      三      四      五      六");
       for(int i=0;i<tab;i++)  
       {
        System.out.print("  \t");
       }
       for(int i=1;i<=month[j];i++)
       {
        System.out.print(i+"\t");
        if((i+tab)%7==0)
        {
         System.out.print("\n");
        }
        sum++;
       }
       System.out.println("\n");
      }
    }
}

