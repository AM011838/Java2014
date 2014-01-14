import java.util.*;    
public class I_Q1{    
    public static void main(String[] args){      
        String word = "Teemo rides a thin line between chipper compatriot and unrepentant killer , but there's no one else I'd rather have as a friend.";      
       Scanner s=new Scanner(System.in);      
        
       String str = s.next();
        String stra=(' '+str+' ');
        int num=0;     
        num = word.indexOf(stra,num+1); 
    	int[] a = new int[2];
        num++;
        int c = stra.length();
	    if(num>0){  
        		System.out.println("Teemo在第 " + (num+1)+" 個位置");
            while ((num = word.indexOf(stra,num+1)) >= 0){ 
            	String sub1 = word.substring(num,num+c);
            	boolean     Equal=stra.equals(sub1);
        		        num++;
        				if(Equal)
        					System.out.println("Teemo在第 " + (num+1)+" 個位置");
        					
        				else 
        					System.out.println("Teemo is not here."); 
        	 }  
	    }
	    else 
			System.out.println("Teemo is not here.");
    }  
}