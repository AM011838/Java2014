import java.io.*;
import java.util.*;
import java.util.Scanner;  

class TeamD{
	public static void main(String[] args){
	     String [][]input=new String[100][2];
	     int [][]num=new int[100][3];
	     String [][]temp=new String[1][4];
	     String[] type={"牡羊座","金牛座","雙子座","巨蟹座","獅子座","處女座","天秤座","天蠍座","射手座","摩羯座","水瓶座","雙魚座"};
	     Scanner sc = new Scanner(System.in);
	     int i=0,j=0,cho=0,c=0,k=0,cho1=0,pass=0,id=0;
	     try{
		   do{
			  System.out.println("1.新增 2.顯示 3.修改生日 4.寫出檔案 5.結束");			
			  System.out.print("CHO:");
			  cho=sc.nextInt();
		 	  switch(cho){
			       case 1:
				    System.out.print("請輸入代碼");
				    num[i][0]=sc.nextInt();
		 		    System.out.print("請輸入姓名");
				    input[i][0]=sc.next();
		 		    System.out.print("請輸入月份");
				    num[i][1]=sc.nextInt();
		 		    System.out.print("請輸入日期");
				    num[i][2]=sc.nextInt();
				    if(num[i][1]==3 && num[i][2]>=21)
				       input[i][1]=type[0];
				    if(num[i][1]==3 && num[i][2]<21)
				       input[i][1]=type[11];

				    if(num[i][1]==4 && num[i][2]>=20)
				       input[i][1]=type[1];
				    if(num[i][1]==4 && num[i][2]<20)
				       input[i][1]=type[0];

				    if(num[i][1]==5 && num[i][2]>=21)
				       input[i][1]=type[2];
				    if(num[i][1]==5 && num[i][2]<21)
				       input[i][1]=type[1];

				    if(num[i][1]==6 && num[i][2]>=22)
				       input[i][1]=type[3];
				    if(num[i][1]==6 && num[i][2]<22)
				       input[i][1]=type[2];

				    if(num[i][1]==7 && num[i][2]>=23)
				       input[i][1]=type[4];
				    if(num[i][1]==7 && num[i][2]<23)
				       input[i][1]=type[3];

				    if(num[i][1]==8 && num[i][2]>=23)
				       input[i][1]=type[5];
				    if(num[i][1]==8 && num[i][2]<23)
				       input[i][1]=type[4];

				    if(num[i][1]==9 && num[i][2]>=23)
				       input[i][1]=type[6];
				    if(num[i][1]==9 && num[i][2]<23)
				       input[i][1]=type[5];

				    if(num[i][1]==10 && num[i][2]>=24)
				       input[i][1]=type[7];
				    if(num[i][1]==10 && num[i][2]<24)
				       input[i][1]=type[6];

				    if(num[i][1]==11 && num[i][2]>=23)
				       input[i][1]=type[8];
				    if(num[i][1]==11 && num[i][2]<23)
				       input[i][1]=type[7];

				    if(num[i][1]==12 && num[i][2]>=22)
				       input[i][1]=type[9];
				    if(num[i][1]==12 && num[i][2]<22)
				       input[i][1]=type[8];

				    if(num[i][1]==1 && num[i][2]>=20)
				       input[i][1]=type[10];
				    if(num[i][1]==1 && num[i][2]<20)
				       input[i][1]=type[9];

				    if(num[i][1]==2 && num[i][2]>=19)
				       input[i][1]=type[11];
				    if(num[i][1]==2 && num[i][2]<19)
				       input[i][1]=type[10];
				    i++;
				    break;
			      case 2:
			   	    for(j=0;j<i;j++){
                                    	System.out.printf("%s %d月%d日 %s",input[j][0],num[j][1],num[j][2],input[j][1]);
				    	System.out.println("");
		  	 	    }
				    break;
			      case 3:
				    System.out.print("請輸入欲修改之代碼");
				    id=sc.nextInt();
				    for(j=0;j<=i;j++)
					    if(num[j][0]==id){
		 		    		System.out.print("請輸入月份");
				    		num[j][1]=sc.nextInt();
		 		    		System.out.print("請輸入日期");
				   		num[j][2]=sc.nextInt();
				    if(num[j][1]==3 && num[j][2]>=21)
				       input[j][1]=type[0];
				    if(num[i][1]==3 && num[j][2]<21)
				       input[j][1]=type[11];

				    if(num[j][1]==4 && num[j][2]>=20)
				       input[j][1]=type[1];
				    if(num[j][1]==4 && num[j][2]<20)
				       input[j][1]=type[0];

				    if(num[j][1]==5 && num[j][2]>=21)
				       input[j][1]=type[2];
				    if(num[j][1]==5 && num[j][2]<21)
				       input[j][1]=type[1];

				    if(num[j][1]==6 && num[j][2]>=22)
				       input[j][1]=type[3];
				    if(num[j][1]==6 && num[j][2]<22)
				       input[j][1]=type[2];

				    if(num[j][1]==7 && num[j][2]>=23)
				       input[j][1]=type[4];
				    if(num[j][1]==7 && num[j][2]<23)
				       input[j][1]=type[3];

				    if(num[j][1]==8 && num[j][2]>=23)
				       input[j][1]=type[5];
				    if(num[j][1]==8 && num[j][2]<23)
				       input[j][1]=type[4];

				    if(num[j][1]==9 && num[j][2]>=23)
				       input[j][1]=type[6];
				    if(num[j][1]==9 && num[j][2]<23)
				       input[j][1]=type[5];

				    if(num[j][1]==10 && num[j][2]>=24)
				       input[j][1]=type[7];
				    if(num[j][1]==10 && num[j][2]<24)
				       input[j][1]=type[6];

				    if(num[j][1]==11 && num[j][2]>=23)
				       input[j][1]=type[8];
				    if(num[j][1]==11 && num[j][2]<23)
				       input[j][1]=type[7];

				    if(num[j][1]==12 && num[j][2]>=22)
				       input[j][1]=type[9];
				    if(num[j][1]==12 && num[j][2]<22)
				       input[j][1]=type[8];

				    if(num[j][1]==1 && num[j][2]>=20)
				       input[j][1]=type[10];
				    if(num[j][1]==1 && num[j][2]<20)
				       input[j][1]=type[9];

				    if(num[j][1]==2 && num[j][2]>=19)
				       input[j][1]=type[11];
				    if(num[j][1]==2 && num[j][2]<19)
				       input[j][1]=type[10];
					 
					    }
				    break;
			      case 4:
				    PrintWriter txtout = new PrintWriter(new BufferedWriter(new FileWriter("text.txt")));
				    for(j=0;j<i;j++){
		 				    txtout.printf("%s %d月%d日 ",input[j][0],num[j][1],num[j][2]);
					    txtout.println("");
				    }
				    txtout.close();
				    break;
			      case 5:
				   c=1;
				   break;
			     }

		       }while(c!=1);
	     }
	     catch(IOException e){
		 System.out.println("wrong!!");
	     }
	}
}