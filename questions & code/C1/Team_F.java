import java.io.*;  
public class TeamF {  
    public static void main(String[] args) throws IOException{  
        BufferedReader br =   
                new BufferedReader(new InputStreamReader(System.in));  
        int op=0;        
        int [][]score = new int [5][5];  
        int[] asd = new int[10];  
        String[] name = new String[5];
		name[4] = "Tonny";
		name[3] = "Stone";
		name[2] = "Rock";
		name[1] = "Ben";
		name[0] = "Willie";
		String[] n = new String[3];
		for(int q=1;q<4;q++){
			score[0][0]=1;
			score[0][q]=((int)(Math.random()*100));
			score[0][4]=score[0][q]+score[0][4];
        }
		for(int q=1;q<4;q++){
			score[1][0]=2;
			score[1][q]=((int)(Math.random()*100));
			score[1][4]=score[1][q]+score[1][4];
        }
		for(int q=1;q<4;q++){
			score[2][0]=3;
			score[2][q]=((int)(Math.random()*100));
			score[2][4]=score[2][q]+score[2][4];
        }
		for(int q=1;q<4;q++){
			score[3][0]=4;
			score[3][q]=((int)(Math.random()*100));
			score[3][4]=score[3][q]+score[3][4];
        }
		for(int q=1;q<4;q++){
			score[4][0]=5;
			score[4][q]=((int)(Math.random()*100));
			score[4][4]=score[4][q]+score[4][4];
        }
  
        while(op != -1){  
  
            System.out.printf("1.排序成績\n  2.離開\n");  
            String st=br.readLine();  
            int d=Integer.parseInt(st);
          
            switch(d){     
                case 1:  
                    System.out.printf("1.排序號\n 2.排國文\n3.排英文\n4.排數學\n5.排總分\n");  
                    String str19=br.readLine();  
                    int q=Integer.parseInt(str19);  
                    switch(q){  
                        case 1:  
                            for(int i=0;i<score.length;i++){  
                                for(int j=i+1;j<score.length;j++){  
                                    if(score[i][0]<score[j][0]){  
                                        asd = score[i];  
                                        score[i] = score[j];  
                                        score[j] = asd;
                                        n[0] = name[i];
                                        name[i]=name[j];
                                        name[j]=n[0];
                                    }  
                                }  
                            }  
                        break;
                        case 2:  
                            for(int i=0;i<score.length;i++){  
                                for(int j=i+1;j<score.length;j++){  
                                    if(score[i][1]<score[j][1]){  
                                        asd = score[i];  
                                        score[i] = score[j];  
                                        score[j] = asd;
                                        n[0] = name[i];
                                        name[i]=name[j];
                                        name[j]=n[0];
                                    }  
                                }  
                            }
                            break;
                        case 3:  
                            for(int i=0;i<score.length;i++){  
                                for(int j=i+1;j<score.length;j++){  
                                    if(score[i][2]<score[j][2]){  
                                        asd = score[i];  
                                        score[i] = score[j];  
                                        score[j] = asd;
                                        n[0] = name[i];
                                        name[i]=name[j];
                                        name[j]=n[0];
                                    }  
                                }  
                            }
                            break;
                        case 4:  
                            for(int i=0;i<score.length;i++){  
                                for(int j=i+1;j<score.length;j++){  
                                    if(score[i][3]<score[j][3]){  
                                        asd = score[i];  
                                        score[i] = score[j];  
                                        score[j] = asd;
                                        n[0] = name[i];
                                        name[i]=name[j];
                                        name[j]=n[0];
                                    }  
                                }  
                            }
                            break;
                        case 5:    
                            for(int i=0;i<score.length;i++){  
                                for(int j=i+1;j<score.length;j++){  
                                    if(score[i][4]<score[j][4]){  
                                        asd = score[i];  
                                        score[i] = score[j];  
                                        score[j] = asd;
                                        n[0] = name[i];
                                        name[i]=name[j];
                                        name[j]=n[0];
                                    }  
                                }  
                            }  
                        break;  
                    }
                    for(int i=0;i<score.length;i++){
                    	System.out.print(name[i]+" ");
                        for(int j=0;j<score.length;j++){  
                            System.out.print(score[i][j]+"   ");  
                        }  
                        System.out.println("");  
                        }
                    break;       
                case 2:  
                    op = -1;  
                    break;  
                }  
        }  
    }  
}  
