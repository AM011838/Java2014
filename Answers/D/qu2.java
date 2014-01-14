import java.io.*;
import java.util.Scanner;
class qu2{
	public static void main(String[] args){
	        try{
	     		char[] num={'零','壹','貳','參','肆','伍','陸','柒','捌','玖'};
	    		char[] type={'拾','佰','仟','萬','億'};
	     		int []temp=new int[2];
			PrintWriter txtout = new PrintWriter(new BufferedWriter(new FileWriter("ans1.txt")));
	     		Scanner sca = new Scanner(System.in);
			int cho=0;
	     		String input="";
	     		int i=0,j=0,k=0,c=0,ans=0,n=0;
		    	do{
	    		     System.out.println("0:結束 1:輸入 2:寫入檔案");
			     System.out.print("你的選擇:");
			     cho=sca.nextInt();
			     switch(cho){
				case 1:
					i=0;j=0;k=0;c=0;ans=0;
	     				temp[0]=0;
	     				temp[1]=0;			     		
					System.out.println("請以 零,壹,貳,參,肆,伍,陸,柒,捌,玖,拾,佰,仟,萬,億 輸入");
	    				System.out.println("");
			     		System.out.print("中文數字:");
	    				input=sca.next();
	     				for(i=0;i<input.length();i++){
	    	 				for(j=0;j<num.length;j++)
	    		 				if(input.charAt(i)==num[j])
	    			 				temp[0]=j;
	    	 				for(k=0;k<type.length;k++)
	    		 				if(input.charAt(i)==type[k]){
								if(k==3){
									temp[1]*=10000;
									ans+=temp[1];
									temp[1]=0;
								}
			 					if(k==4){
									if(temp[0]!=0){
										temp[0]*=100000000;
										ans+=temp[0];
										temp[0]=0;
									}
									temp[1]*=100000000;
									ans+=temp[1];
									temp[1]=0;
								}
								else{
									for(c=0;c<=k;c++)
				    	     				temp[0]*=10;
	    				     				temp[1]+=temp[0];
					     				temp[0]=0;
								}
							}
	    				}
	    	 			for(k=0;k<type.length;k++)
					     if(input.charAt(input.length()-2)==type[k]){
							if(k==1){
	    						     ans+=temp[0]*10;
							     temp[0]=0;
							}
							if(k==2){
	    						     ans+=temp[0]*100;
							     temp[0]=0;
							}
							if(k==3){
	    						     ans+=temp[0]*1000;
							     temp[0]=0;
							}
							if(k==4){
	    						     ans+=temp[0]*10000000;
							     temp[0]=0;
							}
					     }


                                        ans+=temp[0];
	    				ans+=temp[1];
	    				System.out.println("阿拉伯數字:"+ans);
	    				System.out.println("");
					break;
				case 2:
    					txtout.println("第"+(n+1)+"筆資料(中文數字):"+input);
	    				txtout.println("第"+(n+1)+"筆資料(阿拉伯數字):"+ans);
	    				txtout.println("");
					n++;
	    				System.out.println("寫入完畢");
	    				System.out.println("");
					break;
				case 0:
	    				System.out.println("程式結束");
					break;
				default:
					System.out.println("錯誤選擇!!");
					break;
			    }

		    	}while(cho!=0);
	    		txtout.close();
	    	}
	     	catch(IOException e){
		 		System.out.println("wrong!!");
	     	}
	}
}
