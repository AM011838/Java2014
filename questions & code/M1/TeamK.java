import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  
  

  
public class TeamK {  
    public static void main(String[]args) throws IOException  
    {  
        BufferedReader br=  
            new BufferedReader(new InputStreamReader(System.in));  
        
        String str1 = br.readLine();
        String str = str1;  
        
        int n=0, num=0;  
        
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("a",j);  
            if(n == j){  
                num+=1;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("b",j);  
            if(n == j){  
            	num+=2;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("c",j);  
            if(n == j){  
            	num+=3;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("d",j);  
            if(n == j){  
            	num+=4;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("e",j);  
            if(n == j){  
            	num+=5;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("f",j);  
            if(n == j){  
            	num+=6;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("g",j);  
            if(n == j){  
            	num+=7;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("h",j);  
            if(n == j){  
            	num+=8;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("i",j);  
            if(n == j){  
            	num+=9;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("j",j);  
            if(n == j){  
            	num+=10;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("k",j);  
            if(n == j){  
            	num+=11;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("l",j);  
            if(n == j){  
            	num+=12;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("m",j);  
            if(n == j){  
            	num+=13;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("n",j);  
            if(n == j){  
            	num+=14;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("o",j);  
            if(n == j){  
            	num+=15;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("p",j);  
            if(n == j){  
            	num+=16;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("q",j);  
            if(n == j){  
            	num+=17;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("r",j);  
            if(n == j){  
            	num+=18;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("s",j);  
            if(n == j){  
            	num+=19;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("t",j);  
            if(n == j){  
            	num+=20;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("u",j);  
            if(n == j){  
            	num+=21;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("v",j);  
            if(n == j){  
            	num+=22;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("w",j);  
            if(n == j){  
            	num+=23;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("x",j);  
            if(n == j){  
            	num+=24;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("y",j);  
            if(n == j){  
            	num+=25;
            }  
        }
        for(int j=0; j<str1.length(); j++){  
            n = str1.indexOf("z",j);  
            if(n == j){  
            	num+=26;
            }  
        }
        
        System.out.println(str+" = "+num+" point");
    }  
}