import java.io.*;
public class TeamB {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
        int a[]=new int[4];
        int b[]=new int[4];
        int tmp;
        String str = br.readLine();
        tmp=Integer.parseInt(str); 
      	  for(int i=3;i>=0;i--){
      		  b[i]=a[i]=tmp%10;
      		  tmp=tmp/10;
     	  };
     	 for(int i=0;i<4;i++){
       		b[i]=(b[i]+5)%10;
      	  };
     	 tmp=b[0];
     	 b[0]=b[3];
     	 b[3]=tmp;
     	tmp=b[1];
    	 b[1]=b[2];
    	 b[2]=tmp;
    	 System.out.println("¿é¤J:"+a[0]+""+a[1]+""+a[2]+""+a[3]);
    	 System.out.println("¥[±K«á:"+b[0]+""+b[1]+""+b[2]+""+b[3]);
	}

}
