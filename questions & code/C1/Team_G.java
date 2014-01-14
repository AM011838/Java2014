import java.util.*;  
import java.io.*;  
import java.nio.Buffer;  
public class TeamG {  
  
public static void main(String[] args, FileReader read){  
    Scanner sc =new Scanner(System.in);  
    Scanner sc2 =new Scanner(System.in);
    Scanner sc3 =new Scanner(System.in);
        String [] id=new String[5];   
        String [] Subject={"國文","英文","數學"};  
        int [] chScore=new int[5];  
        int [] engScore=new int[5]; 
        int [] matScore=new int[5];
        double  chAvg=0.0D,engAvg=0.0D;  
        //double[] avg = new double[5];  
    int[]sum=new int[5];  
    int i;  
    int num,choice,suj;  
    boolean n=true;  
  
        System.out.println("請輸入五位學生的座號");  
        for(i=0; i<5 ;i++){  
    id[i] =sc.next();   
        }  
        for(i=0; i<5 ;i++){  
    System.out.println("請輸入" +id[i] + "的" + Subject[0] + "成績");    
      chScore[i]=sc.nextInt();  chAvg+=chScore[i]* 1.0D / 5;  
        }  
        for(i=0; i<5 ;i++){  
      System.out.println("請輸入"  +id[i] + "的" + Subject[1] + "成績");  
    engScore[i]=sc2.nextInt(); engAvg+=engScore[i]* 1.0D / 5;  
    }  
        for(i=0; i<5 ;i++){  
            System.out.println("請輸入"  +id[i] + "的" + Subject[1] + "成績");  
          matScore[i]=sc2.nextInt(); double matAvg = matScore[i]* 1.0D / 5;  
          }  
          
      System.out.println("\n姓名\t國文\t英文\t數學\t個人總分");   
      for(i=0; i<5; i++){  
      //avg[i]=(double)((chScore[i]+engScore[i])* 1.0D/2);    
    sum[i]+=(chScore[i]+engScore[i]);   
      //System.out.println(id[i] +"\t" + chScore[i] + "\t" + engScore[i] +"\t" + avg[i]+"\t" + sum[i]);      
      } System.out.println("_______________________________________________");   
          
        for(int s=0; s<sum.length-1; s++){  
        for(int t=s+1; t<sum.length; t++){  
        if(sum[t] > sum[s]){  
        int tmp = sum[t];  
        sum[t] = sum[s];  
        sum[s] = tmp;      
        }  
        }  
        }System.out.println();  
        for(int k=0; k<sum.length; k++){  
        System.out.println("第" + (k+1) + "名的分數是" + sum[k] + "分。");  
          
        }  
           
while(n){  
  
  
       System.out.println("\n 1.排序成績\n 2.離開");  
  
  
       System.out.print("請輸入選項:");  
  
  
       Object buf;  
    //choice=Integer.parseInt(((Object) buf).readLine());  
  
  
        
  
  
      switch (choice){  
  
  
      case 1:    
  
  
       System.out.print("查詢科目---------------------- > \n 1-國文  \n 2-英文    \n-------------------\n【請輸入】 :");  
  
  
      
  
  
       switch(suj){  
  
       case 1:    
  
  
        System.out.print("查詢科目:國文  \n請輸入查詢座號:");  
  
  
        num=Integer.parseInt.readLine());  
  
  
        System.out.println("查詢成功---------------------- > \n國文成績:"+ chScore[num]);  
  
  
        break;  
  
  
       case 2:    
  
  
        System.out.print("查詢科目:英文   \n請輸入查詢座號:");  
  
  
        num=Integer.parseInt.readLine());  
  
  
        System.out.println("查詢成功---------------------- > \n英文成績:"+engScore[num]);  
  
  
        break;  
  
       case 3:    
    	   
    	   
           System.out.print("查詢科目:數學  \n請輸入查詢座號:");  
     
     
           num=Integer.parseInt.readLine());  
     
     
           System.out.println("查詢成功---------------------- > \n數學成績:"+ chScore[num]);  
     
     
           break;  
        
         
       }  
  
  
       break;  
  
  
 
  
         
  
  
      case 3:  
  
  
       System.out.println("座號\t國文\t英文\t數學\t");  
  
  
  
  
        System.out.println(i+"號 \t"+chScore[i]+"\t"+engScore[i]+"\t");  
  
  
          
  
  
       System.out.println("查詢成功！\n");  
  
  
       break;  
  
  
         
  
  
      default:   
  
  
       System.out.println("離開");  
  
  
       n=false;  
  
  
       break;  
  
  
         
  
  
              }  
  
  
           }  
  
  
        
  
  
       }  
  
  
        
  
    } 