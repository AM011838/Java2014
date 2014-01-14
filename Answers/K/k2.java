import java.io.*;
 
/*
	此解答雖然正確但撰寫太多無意義的程式碼，許多程式碼可轉成function或是物件化，計算星座也沒有利用一個月幾天的概念。
	顯示即修改應使用簡單的function，並且利用天數計算的方式來決定星座，而非判斷月份加日期，造成過多的switch case。
*/
 
class k2{  
    public static void main (String[] args) throws IOException{  
        BufferedReader br=  
          new BufferedReader(new InputStreamReader(System.in));  
        int[][]score=new int [20][20];
        int num=0,a=0;
        String[] strArray = new String[20];
        String[] result = new String[20];
        
        System.out.println("1.新增\n2.顯示\n3.修改生日\n4.寫出檔案\n5.結束");
        System.out.println("請輸入代碼: ");
        String n=br.readLine();
        num=Integer.parseInt(n);
        
        while(num != 5)
        {
	        switch(num)
	        {
	            case 1:
	            	
	            	System.out.println("請輸入姓名");
	            	String y=br.readLine();
	            	strArray[a] = y;
	                for(int b=0;b<2;b++){
	                	if( b == 0 )
	                		System.out.println("請輸入月份");
	                	if( b == 1 )
	                		System.out.println("請輸入日期");
	                    String point=br.readLine();  
	                    score[a][b]=Integer.parseInt(point);
	                }
	                
	                switch(score[a][0])
	                {
			        	case 1:
			              if(score[a][1] >=1 && score[a][1] <=20)
			            	  result[a]="魔羯座";
			              else if(score[a][1]>=21 && score[a][1]<=31)
			            	  result[a]="水瓶座";
			              break;
			        	case 2:
			              if(score[a][1] >=1 && score[a][1] <=19)
			            	  result[a]="水瓶座";
			              else if(score[a][1]>=20 && score[a][1]<=29)
			            	  result[a]="雙魚座";
			              break;
			        	case 3:
			              if(score[a][1] >=1 && score[a][1] <=20)
			            	  result[a]="雙魚座";
			              else if(score[a][1]>=21 && score[a][1]<=31)
			            	  result[a]="牡羊座";
			              break;
			        	case 4:
			              if(score[a][1] >=1 && score[a][1] <=20)
			            	  result[a]="牡羊座";
			              else if(score[a][1]>=21 && score[a][1]<=30)
			            	  result[a]="金牛座";
			              break;
			        	case 5:
			              if(score[a][1] >=1 && score[a][1] <=21)
			            	  result[a]="金牛座";
			              else if(score[a][1]>=22 && score[a][1]<=31)
			            	  result[a]="雙子座";
			              break;
			        	case 6:
			              if(score[a][1] >=1 && score[a][1] <=21)
			            	  result[a]="雙子座";
			              else if(score[a][1]>=22 && score[a][1]<=30)
			            	  result[a]="巨蟹座";
			              break;
			        	case 7:
			              if(score[a][1] >=1 && score[a][1] <=23)
			            	  result[a]="巨蟹座";
			              else if(score[a][1]>=24 && score[a][1]<=31)
			            	  result[a]="獅子座";
			              break;
			        	case 8:
			              if(score[a][1] >=1 && score[a][1] <=23)
			            	  result[a]="獅子座";
			              else if(score[a][1]>=24 && score[a][1]<=31)
			            	  result[a]="處女座";
			              break;
			        	case 9:
			              if(score[a][1] >=1 && score[a][1] <=23)
			            	  result[a]="處女座";
			              else if(score[a][1]>=24 && score[a][1]<=30)
			            	  result[a]="天秤座";
			              break;
			        	case 10:
			              if(score[a][1] >=1 && score[a][1] <=23)
			            	  result[a]="天秤座";
			              else if(score[a][1]>=24 && score[a][1]<=31)
			            	  result[a]="天蠍座";
			              break;
			        	case 11:
			              if(score[a][1] >=1 && score[a][1] <=22)
			            	  result[a]="天蠍座";
			              else if(score[a][1]>=23 && score[a][1]<=30)
			            	  result[a]="射手座";
			              break;
			        	case 12:
			              if(score[a][1] >=1 && score[a][1] <=22)
			            	  result[a]="射手座";
			              else if(score[a][1]>=23 && score[a][1]<=31)
			            	  result[a]="魔羯座";
			              break;
	                }
	                a++;
	                break;  
	            case 2:
	            	for(int k=0;k<a;k++){  
                        for(int j=0;j<3;j++){
                        	if(j==0){
                        		System.out.print(strArray[k]+" ");
                        		System.out.print(score[k][j]+"月");
                        	}
                            if(j==1)
                            	System.out.print(score[k][j]+"日");
                            else
                            	System.out.println(result[k]);
                        }
                    }
	                break;
	            case 3:
	            	System.out.println("請輸入姓名");
	            	String de=br.readLine();
	            	for(int b = 0 ; b < a ; b++ ){
	            		if( strArray[b].equals(de) ){
	            			for(int c = 0 ; c < 2 ; c++ ){
	            				if( c == 0 )
	    	                		System.out.println("請輸入月份");
	            				if( c == 1 )
	    	                		System.out.println("請輸入日期");
	    	                    String point=br.readLine();
	    	                    score[b][c]=Integer.parseInt(point);
	    	                }
	            			switch(score[b][0])
	    	                {
	    			        	case 1:
	    			              if(score[b][1] >=1 && score[b][1] <=20)
	    			            	  result[b]="魔羯座";
	    			              else if(score[b][1]>=21 && score[b][1]<=31)
	    			            	  result[b]="水瓶座";
	    			              break;
	    			        	case 2:
	    			              if(score[b][1] >=1 && score[b][1] <=19)
	    			            	  result[b]="水瓶座";
	    			              else if(score[b][1]>=20 && score[b][1]<=29)
	    			            	  result[b]="雙魚座";
	    			              break;
	    			        	case 3:
	    			              if(score[b][1] >=1 && score[b][1] <=20)
	    			            	  result[b]="雙魚座";
	    			              else if(score[b][1]>=21 && score[b][1]<=31)
	    			            	  result[b]="牡羊座";
	    			              break;
	    			        	case 4:
	    			              if(score[b][1] >=1 && score[b][1] <=20)
	    			            	  result[b]="牡羊座";
	    			              else if(score[b][1]>=21 && score[b][1]<=30)
	    			            	  result[b]="金牛座";
	    			              break;
	    			        	case 5:
	    			              if(score[b][1] >=1 && score[b][1] <=21)
	    			            	  result[b]="金牛座";
	    			              else if(score[b][1]>=22 && score[b][1]<=31)
	    			            	  result[b]="雙子座";
	    			              break;
	    			        	case 6:
	    			              if(score[b][1] >=1 && score[b][1] <=21)
	    			            	  result[b]="雙子座";
	    			              else if(score[b][1]>=22 && score[b][1]<=30)
	    			            	  result[b]="巨蟹座";
	    			              break;
	    			        	case 7:
	    			              if(score[b][1] >=1 && score[b][1] <=23)
	    			            	  result[b]="巨蟹座";
	    			              else if(score[b][1]>=24 && score[b][1]<=31)
	    			            	  result[b]="獅子座";
	    			              break;
	    			        	case 8:
	    			              if(score[b][1] >=1 && score[b][1] <=23)
	    			            	  result[b]="獅子座";
	    			              else if(score[b][1]>=24 && score[b][1]<=31)
	    			            	  result[b]="處女座";
	    			              break;
	    			        	case 9:
	    			              if(score[b][1] >=1 && score[b][1] <=23)
	    			            	  result[b]="處女座";
	    			              else if(score[b][1]>=24 && score[b][1]<=30)
	    			            	  result[b]="天秤座";
	    			              break;
	    			        	case 10:
	    			              if(score[b][1] >=1 && score[b][1] <=23)
	    			            	  result[b]="天秤座";
	    			              else if(score[b][1]>=24 && score[b][1]<=31)
	    			            	  result[b]="天蠍座";
	    			              break;
	    			        	case 11:
	    			              if(score[b][1] >=1 && score[b][1] <=22)
	    			            	  result[b]="天蠍座";
	    			              else if(score[b][1]>=23 && score[b][1]<=30)
	    			            	  result[b]="射手座";
	    			              break;
	    			        	case 12:
	    			              if(score[b][1] >=1 && score[b][1] <=22)
	    			            	  result[b]="射手座";
	    			              else if(score[b][1]>=23 && score[b][1]<=31)
	    			            	  result[b]="魔羯座";
	    			              break;
	    	                }
	            		}
	            	}
	                break;
	            case 4:
	            	try{
	            	    PrintWriter pw=new PrintWriter
	            		(new BufferedWriter(new FileWriter("birthday.txt",true)));
	            	    for(int k=0;k<a;k++){  
	                        for(int j=0;j<3;j++){
	                        	if(j==0){
	                        		pw.print(strArray[k]+" ");
	                        		pw.print(score[k][j]+"月");
	                        	}
	                            if(j==1)
	                                pw.print(score[k][j]+"日");
	                            else
	                                pw.println(result[k]);
	                        }
	                    }
	            	    System.out.println("SAVED\n");
	            	    pw.close();
	            	}
	            	catch(IOException e){
	            	    System.out.println("ERROR");
	            	}
	            	break;
	            default:
	                break;
	        }
	        System.out.println("1.新增\n2.顯示\n3.修改生日\n4.寫出檔案\n5.結束");
	        System.out.println("請輸入代碼: ");
	        n=br.readLine();
	        num=Integer.parseInt(n);
        }
    }
}