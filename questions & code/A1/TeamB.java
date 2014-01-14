
	import java.io.*;  
	public class TeamB {  
	    public static void main(String[] args) throws IOException{
	    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
	        int a[]=new int[4];  
	        int b[]=new int[4];
	        
	        int A=0,B=0,v=0,c = 0,cc=0,ca=0,cb=100,n;
	        while(true){
	        	System.out.println("1.終極密碼\n2.猜數字\n3.結束");
		        String str = br.readLine();
		        n=Integer.parseInt(str);
	        switch(n){
	        	case 1:
	        		c = (int)(Math.random()*100)+1;
	        		System.out.println("請輸入(介於1~100):");
	        		while(true){
	        		str = br.readLine();
	        		v=Integer.parseInt(str);
	        		cc++;
	        		if(v<c){
	        			ca=v;
	        			System.out.println("輸入大一點\n再輸入("+v+"~"+cb+"):");
	        		}
	        		if(v>c){
	        			cb=v;
	        			System.out.println("輸入小一點\n再輸入("+ca+"~"+v+"):");
	        		}
	        		if(v==c){
	        			if(cc<=8)
	        			System.out.println("恭喜答對!\n你猜了"+cc+"次,高手!");
	        			else if(cc>=14)
		        			System.out.println("恭喜答對!\n你猜了"+cc+"次,請多練習!");
	        			else
	        				System.out.println("恭喜答對!\n你猜了"+cc+"次,厲害!");
	        			break;
	        		}
	        		}
	        		break;
	        	case 2:
	        	     
	     	        for(int i=3;i>=0;i--){
	     	        	v=(int)(Math.random()*10); 
	     	        	a[i]=v%10;  
	     	        	v/=10;}  
	     	        while(true){  
	     	        if(a[0]!=a[1]&&a[0]!=a[2]&&a[0]!=a[3]&&a[1]!=a[2]&&a[1]!=a[3]&&a[2]!=a[3])  
	     	        break;  
	     	        else{  
	     	        	 for(int i=3;i>=0;i--){
	 	     	        	v=(int)(Math.random()*10); 
	 	     	        	a[i]=v%10;  
	 	     	        	v/=10;}  
	     	        }}  
	     	        
	     	        		str = br.readLine();  
	    	     	        v=Integer.parseInt(str);  
	    	     	        for(int i=3;i>=0;i--){  
	    	     	            b[i]=v%10;  
	    	     	            v/=10;
	    	     	            }  
	    	     	        while(true){  
	    	     	            if(b[0]!=b[1]&&b[0]!=b[2]&&b[0]!=b[3]&&b[1]!=b[2]&&b[1]!=b[3]&&b[2]!=b[3])  
	    	     	            break;  
	    	     	            else{  
	    	     	                System.out.print("error!\nInput:");  
	    	     	                str = br.readLine();  
	    	     	                v=Integer.parseInt(str);  
	    	     	                for(int i=3;i>=0;i--){  
	    	     	                    b[i]=v%10;  
	    	     	                    v/=10;}  
	    	     	            }}  
	     	        		
	     	        	for(int i=0;i<4;i++){  
	     	            for(int j=0;j<4;j++){  
	     	            if(b[i]==a[i])  
	     	                A++;          
	     	            if(b[i]==a[j])  
	     	                B++;  
	     	            }}  
	     	        	System.out.println(A/4+"A"+(B-A/4)+"B");
	     	        	while(A/4!=4){
	     	        		A=0;
	     	        		B=0;
	     	        		str = br.readLine();  
	    	     	        v=Integer.parseInt(str);  
	    	     	        for(int i=3;i>=0;i--){  
	    	     	            b[i]=v%10;  
	    	     	            v/=10;
	    	     	            } 
	    	     	       while(true){  
	    	     	            if(b[0]!=b[1]&&b[0]!=b[2]&&b[0]!=b[3]&&b[1]!=b[2]&&b[1]!=b[3]&&b[2]!=b[3])  
	    	     	            break;  
	    	     	            else{  
	    	     	                System.out.print("error!\nInput:");  
	    	     	                str = br.readLine();  
	    	     	                v=Integer.parseInt(str);  
	    	     	                for(int i=3;i>=0;i--){  
	    	     	                    b[i]=v%10;  
	    	     	                    v/=10;}  
	    	     	            }}  
		     	        	for(int i=0;i<4;i++){  
		     	            for(int j=0;j<4;j++){  
		     	            if(b[i]==a[i])  
		     	                A++;          
		     	            if(b[i]==a[j])  
		     	                B++;  
		     	            }}  
		     	        	System.out.println(A/4+"A"+(B-A/4)+"B");
		     	        	
	     	        	}
	     	        	System.out.println("恭喜答對!");
	        		break;
	        	case 3:
	        		break;
	        	default:
	        	System.out.println("error!");
	        }
	        if(n==3)
	        	break;
	        }
	}}  