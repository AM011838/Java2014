import java.util.Scanner;
public class Main1{
      public int calDay(int a){
        int yy=0,s=0;
        if(a>2009){
            for(yy=2009;yy<a;yy++){ 
            if((yy%400==0)||((yy%100!=0)&&(yy%4==0)))
                  s+=366;
               else
               s+=365; 
            }
            s-=60;
        }
        else{
        for(yy=a;yy<2009;yy++){ 
             if((yy%400==0)||((yy%100!=0)&&(yy%4==0)))
                   s+=366;
                else
                  s+=365; 
             }
             s+=60;
             s=s%7;
             s=7-s;
        }
        return s; 
}
public static void main (String[] args){
   Scanner scanner = new Scanner(System.in);
   int a;
   System.out.println("請輸入查詢西元年份：");
   a=scanner.nextInt();
   
   if( (a % 4 == 0 && a % 100 != 0) || a % 400 == 0 )
              System.out.println("西元:"+a+"為閏年");
   else 
              System.out.println("西元:"+a+"為平年");
   
   int days,left;
   int[][][] day = new int[13][6][7];
        
        Main1 calendar=new Main1();
        days=calendar.calDay(a);
        left=days%7;
        left=(1+left)%7;
        day[1][0][left]=1;
        int i=1,j=0,k=0,tag=0;
        int last;
        for(i=1;i<=12;i++){
           switch(i){ 
             case 1:
             case 3:
             case 5:  
             case 7:
             case 8:
             case 10:
             case 12:
                     last=31;
                   break;
             case 2:
                if((a%400==0)||((a%100!=0)&&(a%4==0)))
                      last=29;
               else
                      last=28;
               break;
       default:
               last=30;
               break;
            }
        if(i!=1){
           tag=(tag+1)%7;
           day[i][0][tag]=1;
        }
            for(j=0;j<6;j++){
                if(j!=0)
               day[i][j][0]=day[i][j-1][6]+1;
                if(day[i][j][0]==last){tag=0;break;}
                if(j==0){
                if(i!=1)
                     for(k=tag+1;k<=6;k++)
                     day[i][j][k]=day[i][j][k-1]+1;
                    else
                     for(k=left;k<=6;k++){
                     if(k==6)break;
                     else
                           day[i][j][k+1]=day[i][j][k]+1;
                     }
                }
                else{
                for(k=1;k<=6;k++){
                  day[i][j][k]=day[i][j][k-1]+1;
                  if(day[i][j][k]==last){
                   tag=k;
                   break;
                  }
                   }
                }
             if(day[i][j][tag]==last)break;
        }
        }
        for(i=1;i<13;i++){
        System.out.println(i+"月");
        System.out.println("日\t一\t 二 \t三 \t 四\t 五\t 六");
        for(j=0;j<6;j++){
           for(k=0;k<7;k++){
            if(day[i][j][k]==0)
             System.out.print("\t");
            else{
             System.out.print(day[i][j][k]);
             if(day[i][j][k]>=1&&day[i][j][k]<=9)
                System.out.print("\t");
             else
              System.out.print("\t");
            }
           }
           System.out.println();
            }
        }
    } 
}