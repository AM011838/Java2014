import java.io.*;  
public class TeamF {
	public static void main(String[] args) throws IOException{ 
		
		BufferedReader br =    
                new BufferedReader(new InputStreamReader(System.in));     
		
        String str = br.readLine();  
        //int num = Integer.parseInt(str); 
        
        String[] number = {"0","1","2","3","4","5","6","7","8","9"};
        
        int[] m = new int[10];        
        int[] n = new int[10];
        int i;
        int j = 0;
        
        int t=0;
        int k;
        for(i=0;i<10;i++){
        	n[i]=0;
        }
        
        String a;
        
        for(i=0;i<=str.length();i++){
        	
        	if(str.charAt(i)!=' '){
        		for(j=0;j<10;j++){
        			
        			a=str.charAt(i)+"";
        			//a.equals(number[j])==true
        			if(a.equals(number[j])==true){
        				if(n[t]!=0){
        					n[t]=j+1;
        				}
        				else{
        					n[t]=n[t]+(n[t]*10)+j+1;
        				}
        				
        			}
        		}        	
        	}
        	
        	else{
        		t++;
        	}
        	        	
        }
        
/*
        while(num!=1){
        	
        	n[j]=num;
        	j++;
        	
        }
    */    
        k=n[t-1];
        
        for(i=0;i<10;i++){
        	m[i]=k/n[i];
        	k=k%n[i];
        	    	
        }
        
        
        for(i=0;i<10;i++){
        	if(n[i]!=0){
        		System.out.println("共要找"+m[i]+"張的"+n[1]+"元");
        	}
        	    	
        }
        
        
        
        
        
        
	}
}