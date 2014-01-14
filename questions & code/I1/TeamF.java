import java.io.*;    
    public class TeamF {  
         public static void main(String[] args) throws IOException{    
                
                BufferedReader br =    
                    new BufferedReader(new InputStreamReader(System.in));         
                
//判斷位置                
                String strk="killer";
                String str ="Teemo rides a thin line between chipper compatriot and unrepentant killer , but there's no one else I'd rather have as a friend.";   
                String str1 = br.readLine();   
                  
                int l = str.length();     //原文長度  
                char s[] = new char[l+1];  
                int k = str1.length();  //搜索字串長度  
                char t[] = new char[k+1];  
                
                
                  
                int i;  
                int j;  
                
                
                  
                                  
                for(i=1;i<=l;i++){  
                    s[i]=str.charAt(i-1);  
                    if(s[i]=='.'){  
                        s[i]=' ';  
                    }  
                }  
                for(i=0;i<k;i++){  
                    t[i]=str1.charAt(i);  
                }      
                  
                s[0]=' ';  
                t[k]=' ';                
                
                int a = 0;  
                int b = 0;  //紀錄位置
                int c = 0;  //相同字元數目
                int Word = 0; //結果單字數                
                
                for(i=0;i<l;i++){  	
                    if(s[i]==' '){  
                          
                        if(s[i+1]==t[0]){  //比對單字開頭是否一樣
                            c++;  
                            b=i+1;  
                            a=i+2;  //第二個字母
                        }  
                    }  
                      
                    if(c==1){     //開頭一樣   
                        for(j=1;j<=k;j++){
                            if(t[j]==s[a]){  //比對下一個字母
                                c++;  
                                a++;  
                            }  
                            else{   //不一樣則記錄歸零，繼續比對
                                c=0;  
                                b=0;  
                                break;  
                            }  
                        }  
                    }  
          
                    if(c!=0){  
                        Word++;                                                                    
                        c=0;
                	}                    
                
         		}  
                
                for(i=0;i<k;i++){                     
                    if(strk.charAt(i)!=t[i]){
                    	b=0;
                    	Word=0;
                    }
                } 
                
                if(Word==0){  
                    System.out.println("Teemo is not here.");   
                }   
                               
//轉換                

        		

                int num = b; 
                
                String[] str2 = {"零","壹","貳","?","肆","伍","陸","柒","捌","玖",} ; 
                String[] str3 = {"","拾","佰","仟"} ;
                String[] str4= {"","萬","億","兆"} ;
                
                i=0;
                int[] n = new int[11];
                j=1;

                
                while(num>0){
                	i++;
                	n[i]=num%10;
                	num=num/10;
                	
                }
                
                
                int s2;		//str3
                int s3;		//str4
                
                s2=i%4;
                s3=i/4+1;
                
            	if(s2==0){
            		s2=4;
            		s3--;
            	} 
            	
                if(b!=0){  
                	System.out.print("Teemo在第    "); 
            	}
            	
            	
                for(j=i;j>0;j--){
                	if(n[j]!=0){
                		System.out.print(str2[n[j]]);
                		System.out.print(str3[s2-1]);
                	}        
                	if(n[j]==0){
                		if(n[j-1]!=0 && s2!=1){
                			System.out.print(str2[n[j]]);
                		}
                		
                	}
                	
                	if(s2==1){
                		System.out.print(str4[s3-1]);
                		s3--;
                	} 
                	
                	s2--;
                	
                	if(s2==0){
                		s2=4;
                	}
                	
                }
                
                if(b!=0){  
                	System.out.println("   個位置"); 
            	}
                
               
        		//System.out.println();   
                
            
         }  
    }