import java.io.*;
import java.util.Scanner;
class TeamC
{
public static void main(String args[]) throws Exception
{
 String getbr;
        double a;//攝氏
 double b;//華氏
 Scanner scanner = new Scanner(System.in);
 BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("輸入1為攝氏:");
 System.out.println("輸入2為華氏:");
 System.out.println("輸入-1為籬開:");
 int input = scanner.nextInt();
 while(input!=-1){
 if (input==1){
 System.out.print("請輸入攝氏:");
 getbr=br.readLine();
        a=Double.parseDouble(getbr);
 System.out.println("華氏等於:"+(9/5.0*a+32));
}
 else if (input==2){
 System.out.print("請輸入華氏:");
 getbr=br.readLine();
        b=Double.parseDouble(getbr);
 System.out.println("攝氏等於:"+(5/9.0*b-32));

}
 System.out.println(" ");
 System.out.println(" ");
 System.out.println("輸入1為攝氏:");
 System.out.println("輸入2為華氏:");
 System.out.println("輸入-1為籬開:");
 input = scanner.nextInt();
} 
}
 }