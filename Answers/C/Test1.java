import java.util.*;
import java.lang.Math;
class Test1{
	      public static void main(String[] args){
		int [][]score=new int [5][];
		int []s1={1,0,0,0,0};
		int []s2={2,0,0,0,0};
		int []s3={3,0,0,0,0};
		int []s4={4,0,0,0,0};
		int []s5={5,0,0,0,0};
		for(int i=1;i<4;i++){
		   s1[i]=(int)(Math.random()*100);
	           s2[i]=(int)(Math.random()*100);
		   s3[i]=(int)(Math.random()*100);
		   s4[i]=(int)(Math.random()*100);
		   s5[i]=(int)(Math.random()*100);
	        }
		String []p=new String[5];
		String []pp=new String[]{"Willie","Ben","Rock","Stone","Tonny"};
		int a=0,i=0,j=0,sum=0,b=0;
		int []temp;
		String te;
		score[0]=s1;
		score[1]=s2;
		score[2]=s3;
		score[3]=s4;
		score[4]=s5;
		for(i=0;i<score.length;i++){
		     for(j=1;j<score.length;j++){
		          sum=sum+score[i][j];
					}
		      score[i][4]=sum;
		      sum=0;
		                                                    } 
		Scanner scanner = new Scanner(System.in);
		System.out.println("\t1. 排序成績");
		System.out.println("\t2. 離開");
		a=scanner.nextInt();
		while(a!=2){
		System.out.println("\t1. 排序號");
		System.out.println("\t2. 排國文");
		System.out.println("\t3. 排英文");
		System.out.println("\t4. 排數學");
		System.out.println("\t5. 排總分");
		b=scanner.nextInt();
		switch(b){
		        case 1:
					//排序全都是由高至低，序號排序也是？　
			        for( i=0;i<score.length;i++){
		   	            for( j=i+1;j<score[i].length;j++){
		      		       if(score[i][0]<score[j][0]){
			 	          temp=score[i];
			 	          score[i]=score[j];
				          score[j]=temp;
				          te=pp[i];
				          pp[i]=pp[j];
				          pp[j]=te;
				}      	 
	               		    }  
			               }
				for( i=0;i<pp.length;i++){
		   	           System.out.print(pp[i]+"\t");
 			           for( j=0;j<score[i].length;j++){
			 	      System.out.print(score[i][j]+"\t");
				   }
				      System.out.print("\n");
			        }
				  break;
			case 2:
		                for( i=0;i<score.length;i++){
 	                            for( j=i+1;j<score[i].length;j++){
		      		       if(score[i][1]<score[j][1]){
			 	         temp=score[i];
			 	         score[i]=score[j];
			   	         score[j]=temp;
				         te=pp[i];
				         pp[i]=pp[j];
				         pp[j]=te;
		       		 }  
	           	            }
		  	              }
				 for( i=0;i<pp.length;i++){
		   	           System.out.print(pp[i]+"\t");
 			           for( j=0;j<score[i].length;j++){
			 	      System.out.print(score[i][j]+"\t");
				   }
				      System.out.print("\n");
			        }
				  break;	
			case 3:
			       for( i=0;i<score.length;i++){
		   	           for( j=i+1;j<score[i].length;j++){
		      		      if(score[i][2]<score[j][2]){
			 	        temp=score[i];
			 	        score[i]=score[j];
			 	        score[j]=temp;
				        te=pp[i];
				        pp[i]=pp[j];
				        pp[j]=te;
			       }	
			          }
			            }
				for( i=0;i<pp.length;i++){
		   	           System.out.print(pp[i]+"\t");
 			           for( j=0;j<score[i].length;j++){
			 	      System.out.print(score[i][j]+"\t");
				   }
				      System.out.print("\n");
			        }
	 		        break;
			case 4:
			       for( i=0;i<score.length;i++){
		   	          for( j=i+1;j<score[i].length;j++){
		      		     if(score[i][3]<score[j][3]){
			 	        temp=score[i];
			 	        score[i]=score[j];
			 	        score[j]=temp;
				        te=pp[i];
				        pp[i]=pp[j];
				        pp[j]=te;       
			      }
			         }
			            }
			       for( i=0;i<pp.length;i++){
		   	           System.out.print(pp[i]+"\t");
 			           for( j=0;j<score[i].length;j++){
			 	      System.out.print(score[i][j]+"\t");
				   }
				      System.out.print("\n");
			        }
				break;
			case 5:
     		               for( i=0;i<score.length;i++){
		   	          for( j=i+1;j<score[i].length;j++){
		      		     if(score[i][1]+score[i][2]+score[i][3]<score[j][1]+score[j][2]+score[j][3]){
				      temp=score[i];
				      score[i]=score[j];
				      score[j]=temp;	
				      te=pp[i];
				      pp[i]=pp[j];
				      pp[j]=te; 
	                      }
			         }							 					            }
			      for( i=0;i<pp.length;i++){
		   	           System.out.print(pp[i]+"\t");
 			           for( j=0;j<score[i].length;j++){
			 	      System.out.print(score[i][j]+"\t");
				   }
				      System.out.print("\n");
			        }
				 break;
		}
			System.out.println("\t1. 排序成績");
			System.out.println("\t2. 離開");
			a=scanner.nextInt();	
			           
		   	   }         
		}
	}
