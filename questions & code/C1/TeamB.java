import java.io.*;
public class TeamB {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        int a[][]=new int[5][5];
        int n;
       String b[]=new String[5];
           	for(int i=0;i<5;i++){
        	 a[i][0]=i+1;
        	 System.out.println("輸入序號"+(i+1)+"的資料:\n名字:");
        	 String str = br.readLine();
        	 b[i]=str;
        	 
        	a[i][1]=(int)(Math.random()*100)+1;
        	System.out.println("國文分數:"+a[i][1]);
        	a[i][2]=(int)(Math.random()*100)+1;
        	System.out.println("英文分數:"+a[i][2]);
        	a[i][3]=(int)(Math.random()*100)+1;
        	System.out.println("數學分數:"+a[i][3]);	 
        	a[i][4]=a[i][1]+a[i][2]+a[i][3];
         }
        System.out.printf("%8s%8s%8s%8s%8s%8sn","序號","名字","國文","英文","數學","總分");
       	for(int i=0;i<5;i++){
       		    System.out.printf("%6d%6s%6d%6d%6d%6d\n",a[i][0],b[i],a[i][1],a[i][2],a[i][3],a[i][4]);
       	}
       	while(true){
       	System.out.println("1.排序\n2.離開");
       	String str = br.readLine();
       	n=Integer.parseInt(str);
       	if(n==1){
       		System.out.println("1.序號\n2.國文\n3.英文\n4.數學\n5.總分");
       		str = br.readLine();
           	n=Integer.parseInt(str);
           	switch(n){
           	case 1:
           		break;
        	case 2:
           		break;
        	case 3:
           		break;
        	case 4:
           		break;
        	case 5:
           		break;
           	default:
           		System.out.println("選項錯誤!");
           	break;
           	}
       	}
       	else if(n==2)
       		System.exit(1);
       	else
       		System.out.println("選項錯誤!");
       	}
	}

}
