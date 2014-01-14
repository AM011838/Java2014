
import java.io.*;  
import java.util.*;
public class TestH1
{  
       public static void main(String[] args) throws IOException  
       {   
        Scanner scanner = new Scanner(System.in) ;
        
        
        int choose = 0;
        int earn = 0 , pay = 0 ;
        int sc = 0 , st = 0 , sm = 0 ;
        int bn = 0 , bs = 0 ;
        
        
        while(choose != 4)
        {
         System.out.println("1.賣\t2.買\t3.總和\t4.結束") ;
         System.out.print("Input choose : ") ;
         choose = scanner.nextInt();
         switch(choose)
         {
            
            case 1 :
             System.out.println("1.蟑螂\t2.蟋蟀\t3.麵包蟲") ;
             System.out.print("Input sale : ") ;
             
             int sale = scanner.nextInt() ;
             if(sale < 1 || sale > 3){
              System.out.println("不在範圍內請重新輸入") ;
              continue ;
             }
             else{
              if(sale == 1){
               System.out.println("一斤兩百賣幾斤 : ") ;
            int c = scanner.nextInt() ;
            earn = earn + (c * 200) ;
            sc = sc + c ;
              }
              else if(sale == 2){
               System.out.println("一斤一百五賣幾斤 : ") ;
            int t = scanner.nextInt() ;
            earn = earn + (t * 150) ;
            st = st + t ;
              }
              else if(sale == 3){
               System.out.println("一斤一百賣幾斤 : ") ;
            int m = scanner.nextInt() ;
            earn = earn + (m * 100) ;
            sm = sm + m ;
              }
              else{
               System.out.println("不在範圍內請重新輸入") ;
                  continue ;
              }
             }
             
             break;
            
            case 2 :
             System.out.println("1.麥麩\t2.番薯葉") ;
             System.out.print("Input buy : ") ;
             
             int buy = scanner.nextInt();
             if(buy < 1 || buy > 2){
              System.out.println("不在範圍內請重新輸入") ;
              continue ;
             }
             else{
              if(buy == 1){
               System.out.println("一包兩百五買幾包 : ") ;
            int n = scanner.nextInt() ;
            pay = pay + (n * 250) ;
            bn = bn + n ;
              }
              else if(buy == 2){
               System.out.println("一包五十買幾包 : ") ;
            int s = scanner.nextInt() ;
            pay = pay + (s * 50) ;
            bs = bs + s ;
              }
              else{
               System.out.println("不在範圍內請重新輸入") ;
                  continue ;
              }
             }
             
             break ;
            
            case 3 :
             System.out.println("目前賣: " + earn + "元  目前買: " + pay + "元  ") ;
             break ; 
             
            case 4 :
                System.out.print("賣:\n" + "\t蟑螂:" + sc + "斤 共" + sc*200 + "元\n" + "\t蟋蟀:" + st + "斤 共" + st*150 + "元\n" + "\t麵包蟲:" + sm + "斤 共" + sm*100 + "元\n") ;
                System.out.print("買:\n" + "\t麥麩:" + bn + "斤 共" + bn*250 + "元\n" + "\t番薯葉:" + bs + "斤 共" + bs*50 + "元\n") ;
                System.out.print("收入總合:" + earn + "元\n" + "支出總和:" + pay + "元\n" + "淨賺利潤:" + (earn - pay) + "元\n") ;
                
                File newTxt = new File("e://bug.txt");

                if( !newTxt.exists() ){
                     //在此java檔目錄下建立test.txt檔
                     newTxt.createNewFile();
                }
                else{
                     System.out.println("檔案已存在!");
                }
                FileWriter dataFile = new FileWriter("e://bug.txt");
                BufferedWriter input = new BufferedWriter(dataFile);

                input.write("賣:\r\n" + "\t蟑螂:" + sc + "斤 共" + sc*200 + "元\r\n" + "\t蟋蟀:" + st + "斤 共" + st*150 + "元\r\n" + "\t麵包蟲:" + sm + "斤 共" + sm*100 + "元\r\n");
            	input.write("買:\r\n" + "\t麥麩:" + bn + "斤 共" + bn*250 + "元\r\n" + "\t番薯葉:" + bs + "斤 共" + bs*50 + "元\r\n") ;
            	input.write("收入總合:" + earn + "元\n" + "支出總和:" + pay + "元\r\n" + "淨賺利潤:" + (earn - pay) + "元\r\n") ;

                input.close();

                 System.out.print("EXIT ") ;
                 break ;
                
     
            default :
             System.out.println("不在範圍內請重新輸入") ;

         }
        }
       }
}
