import java.io.*;
public class Q2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
		        new BufferedReader(new InputStreamReader(System.in));
		int date=5,time=10;
		    String[][] a=new String[time][date];
		String[] w={"一","二","三","四","五","六","七","八","九","十"};      
		    	  for(int j=0;j<date;j++){
		    		  System.out.println("星期"+w[j]);
		    		  for(int i=0;i<time;i++){
		    			  System.out.print("第"+w[i]+"節:");
		    		  a[i][j]=br.readLine();
		    		  if(a[i][j]=="\n"){
		    			  a[i][j]="  ";
		    		  }
		    	  }
		      }
		    	  for(int i=0;i<date;i++){
		    	System.out.print("\t"+w[i]+"\t");
		    	
		    	  }
		    	  System.out.println();
		      for(int i=0;i<time;i++){
		    	  System.out.print(i+1);
		    	  for(int j=0;j<date;j++){
		    		  System.out.print("\t"+a[i][j]+"\t");
		    	  }
		    	  System.out.print("\n");
		      } 
		 System.out.println(); 
		      boolean b=true;
		do{
		      System.out.println("選擇查詢方式: ");
		      System.out.println("1.以時間查詢課程 2.以課程查詢時間 3.結束查詢");
		      int num=Integer.parseInt(br.readLine());
		     
		 switch(num){
		 	case 1:
		 		System.out.print("輸入星期:");
			    int n=Integer.parseInt(br.readLine());
			    System.out.print("輸入第幾節:");
			    int f=Integer.parseInt(br.readLine());
			    System.out.println(a[f-1][n-1]);
			    break;
		 	case 2:
		 		System.out.println("輸入課程名稱: ");
			      for(int i=0;i<time;i++){
			    	  for(int j=0;j<date;j++){
			    		  if(br.readLine().equals(a[i][j]))
			    			  System.out.println("星期"+(j+1)+"的第 "+(i+1)+"節");
			    	  }
			      }
			      break;
		 	case 3:
		 		 System.out.println("stop search.");
		 		 b=false;
		 		 break;
			default:
			    	  System.out.println("error");
			    	  break;
		 }
		      }while(b);
	}
}

