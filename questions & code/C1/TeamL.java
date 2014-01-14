import java.lang.Math;
import java.util.*;  
  
class TeamL{  
    public static void main (String[] args){
	System.out.println("1.±Æ§Ç¦¨ÁZ");
	System.out.println("2.Â÷¶}");

	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	
	switch(num){   
        case 1:
	int[][]score=new int [5][5];  
        int total=0;  
        int[][]tmp=new int[1][1];     
  
        for(int a=0;a<5;a++){  
            total=0;  
            for(int b=0;b<4;b++){   
                score[a][b]=(int)(Math.random()*100);
                total+=score[a][b];  
            }  
            total=total-score[a][0];  
            score[a][4]=total;    
        }  
          
          
        for(int i=0;i<4;i++){  
            for(int j=i+1;j<5;j++){  
                if(score[j][4]>score[i][4]){  
                    tmp[0]=score[j];  
                    score[j]=score[i];  
                    score[i]=tmp[0];  
                }  
            }  
        }  
  
        for(int k=0;k<5;k++){  
            for(int j=0;j<5;j++){  
                if(j<4)  
                    System.out.print(score[k][j]+" "); 
                else{  
                    System.out.println(score[k][j]);  
                }  
            }  
        }
	break;
	case 2:
		break;
	}
	  
    }  
}  