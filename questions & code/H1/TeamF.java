import java.io.*;

public class TeamF {
	public static void main(String[] args) throws IOException{
	        BufferedReader br =   
	                new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("bug.txt")));
	        int[]buy=new int[10];
	        int[]sale=new int[10];
	        int id0=0;
	        int id1=0;
	        int id2=0;
	        int a=0;
	        int totalsale=0;
	        int totalbuy=0;
	        int op=0;
	        while(op!=-1){
	        	System.out.println("1.賣	2.買   3.總和   4.結束 ");
		        System.out.print("Input choose : ");
		        String str0 = br.readLine();
		        id0=Integer.parseInt(str0);
	        switch(id0){
	        	case 1:
	        		System.out.println("1.蟑螂    2.蟋蟀    3.麵包蟲");
	        		System.out.print("Input sale: ");
	        		String str1 = br.readLine();
	    	        id1=Integer.parseInt(str1);
	    	        switch(id1){
	    	        case 1:
	    	        	System.out.println("一斤兩百賣幾斤: ");
	    	        	String str2 = br.readLine();
		    	        a=Integer.parseInt(str2);
		    	        sale[0]=a+sale[0];
		    	        sale[1]=a*200+sale[1];
		    	        totalsale=sale[1]+totalsale;
		    	        break;
	    	        case 2:
	    	        	System.out.println("一斤一百五賣幾斤: ");
	    	        	String str3 = br.readLine();
		    	        a=Integer.parseInt(str3);
		    	        sale[2]=a+sale[2];
		    	        sale[3]=a*150+sale[3];
		    	        totalsale=sale[3]+totalsale;
		    	        break;
	    	        case 3:
	    	        	System.out.println("一斤一百賣幾斤: ");
	    	        	String str4 = br.readLine();
		    	        a=Integer.parseInt(str4);
		    	        sale[4]=a+sale[4];
		    	        sale[5]=a*100+sale[5];
		    	        totalsale=sale[5]+totalsale;
		    	        break;
	    	        }
	    	        break;
	        	case 2:
	        		System.out.println("1.麥麩    2.番薯葉");
	        		System.out.print("Input buy: ");
	        		String str5 = br.readLine();
	    	        id2=Integer.parseInt(str5);
	        		switch(id2){
	        		case 1:
	        			System.out.println("一包倆佰伍買幾包: ");
	        			String str6 = br.readLine();
		    	        a=Integer.parseInt(str6);
		    	        buy[0]=a+buy[0];
		    	        buy[1]=a*250+buy[1];
		    	        totalbuy=buy[1]+totalbuy;
		    	        break;
	        		case 2:
	        			System.out.println("一包伍拾買幾包: ");
	        			String str7 = br.readLine();
		    	        a=Integer.parseInt(str7);
		    	        buy[2]=a+buy[2];
		    	        buy[3]=a*50+buy[3];
		    	        totalbuy=buy[3]+totalbuy;
		    	        break;
	        		}
	        		break;
	        	case 3:
	        		System.out.println("目前賣:"+totalsale+"元   目前買:"+totalbuy+"元");
	        		break;
	        	case 4:
	        		op=-1;
	        		break;
	        }
	       }
	       System.out.println("賣: ");
	       System.out.println("		蟑螂:"+sale[0]+"斤   共"+sale[1]+"元");
	       System.out.println("		蟋蟀:"+sale[2]+"斤   共"+sale[3]+"元");
	       System.out.println("		麵包蟲:"+sale[4]+"斤   共"+sale[5]+"元");
	       System.out.println("買: ");
	       System.out.println("		麥麩:"+buy[0]+"包   共"+buy[1]+"元");
	       System.out.println("		番薯葉:"+buy[2]+"包   共"+buy[3]+"元");
	       System.out.println("收入總和:"+totalsale+"元");
	       System.out.println("支出總和:"+totalbuy+"元");
	       a=totalsale-totalbuy;
	       System.out.println("淨稅利潤:"+a+"元");
	       pw.println("賣: ");
	       pw.println("		蟑螂:"+sale[0]+"斤   共"+sale[1]+"元");
	       pw.println("		蟋蟀:"+sale[2]+"斤   共"+sale[3]+"元");
	       pw.println("		麵包蟲:"+sale[4]+"斤   共"+sale[5]+"元");
	       pw.println("買: ");
	       pw.println("		麥麩:"+buy[0]+"包   共"+buy[1]+"元");
	       pw.println("		番薯葉:"+buy[2]+"包   共"+buy[3]+"元");
	       pw.println("收入總和:"+totalsale+"元");
	       pw.println("支出總和:"+totalbuy+"元");
	       pw.println("淨稅利潤:"+a+"元");
	       pw.close();
	}

}