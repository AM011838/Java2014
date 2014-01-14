import java.util.*;     
  
public class TeamL{  
    public static void main(String args[]){  
        Scanner sc=new Scanner (System.in);  
        String array="Teemo rides a thin line between chipper compatriot and unrepentant killer , but there's no one else I'd rather have as a friend.";  
        String input;  
        int c=0,i,j=-1,k=0;  
        char []str1=new char[array.length()];  
        for(int a=0;a<array.length();a++)  
            str1[a]=array.charAt(a);  
  
        input=sc.nextLine();  
        char []str2=new char[input.length()];  
        for(int b=0;b<input.length();b++)  
            str2[b]=input.charAt(b);  
          
        for(i=0;i<array.length();i++){  
            if(str1[i]==str2[0]){  
                if(i==0||(str1[i-1]==' '&&str1[i+(input.length())]==' ')||(str1[i-1]==' '&&str1[i+(input.length())]=='.')){  
                while(c<input.length()){  
                    if(str1[i+c]==str2[c])  
                        j=1;  
                    else  
                        j=-1;  
                ++c;      
                }  
                c=0;  
                if(j!=-1){  
                    System.out.println("Position:"+(i+1));  
                    continue;  
                }  
            }  
            }  
              
            if(i==(array.length())-1 && j!=1){  
                System.out.println(input+" is not in this String.");  
            }  
        }  
    }  

}  



