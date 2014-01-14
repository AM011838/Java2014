import java.util.*;
public class TeamK {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=0,b=0,c=0,total=0,out=0,in=0,k=0,kk=0;
        int[] num1=new int[80];
        int[] num2=new int[80];
        int[] test1=new int[80];
        int[] test2=new int[80];
        String[] n1=new String[80];
        String[] n2=new String[80];
        String[] s1= {"","蟑螂","蟋蟀","麵包蟲"};
        String[] s2= {"","麥麩","番薯葉"};
        int[] a1={0,250,100,200};
        int[] a2={0,250,50};
        System.out.println("1.賣    2.買    3.總和  4.結束"+"\n"+"Input choose:");
        a=sc.nextInt();
        while(a<4){
            if(a==1){
                System.out.println("1.蟑螂  2.蟋蟀  3.麵包蟲"+"\n"+"Input sale:");
                b=sc.nextInt();
                if(b==1){
                    System.out.println("一斤兩百五賣幾斤:");
                    c=sc.nextInt();
                    n1[k]=s1[b];
                    num1[k]=a1[b]*c;
                    k++;
                    test1[1]+=test1[1]+c;
                }
                else if(b == 2)
                {
                    System.out.println("一斤一百賣幾斤:");
                    c=sc.nextInt();
                    n1[k]=s1[b];
                    num1[k]=a1[b]*c;
                    k++;
                    test1[2]+=test1[2]+c;
                }
                else if(b == 3)
                {
                    System.out.println("一斤兩百賣幾斤:");
                    c=sc.nextInt();
                    n1[k]=s1[b];
                    num1[k]=a1[b]*c;
                    k++;
                    test1[3]+=test1[3]+c;
                }
            }
            else if(a==2){
                System.out.println("1.麥麩  2.番薯葉"+"\n"+"Input buy:");
                b=sc.nextInt();
                if(b==1){
                   System.out.println("一包兩百五買幾包:"); 
                   c=sc.nextInt();
                   n2[kk]=s2[b];
                   num2[kk]=a2[b]*c;
                   kk++;
                   test2[1]+=test2[1]+c;
                }
                if(b==2){
                   System.out.println("一包五十買幾包:"); 
                   c=sc.nextInt();
                   n2[kk]=s2[b];
                   num2[kk]=a2[b]*c;
                   kk++;
                   test2[2]+=test2[2]+c;
                }
            }
            else if(a==3){
                for(int w=0;w<k;w++){
                    num1[k+1]+=num1[w];
                }
                for(int w=0;w<kk;w++){
                    num2[kk+1]+=num2[w];
                }
                System.out.println("目前賣: "+num1[k+1]+"元 目前買:"+num2[kk+1]+"元");
            }
            System.out.println("1.賣    2.買    3.總和  4.結束"+"\n"+"Input choose:");
            a=sc.nextInt();
        }
        for(int w=0;w<k;w++){
                    num1[k+1]+=num1[w];
                }
                for(int w=0;w<kk;w++){
                    num2[kk+1]+=num2[w];
                }
        System.out.println("賣:"+"\n"+"     蟑螂"+test1[1]+"斤"+"       蟋蟀"+test1[2]+"斤"+"       麵包蟲"+test1[3]+"斤");
        System.out.println("買:"+"\n"+"     麥麩"+test2[1]+"包"+"       地瓜葉"+test2[1]+"包");
        System.out.println("收入總合:"+num1[k+1]+"元"+"\n"+"支出總和"+num2[kk+1]+"元"+"\n"+"淨賺利潤:"+(num1[k+1]-num2[kk+1])+"元");
    }
}