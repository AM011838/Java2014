import java.util.*;
import java.io.*;
public class TeamE{
	public static void main(String[] args){
		int input=-1;
		Scanner sc = new Scanner(System.in);
		TURN tr = new TURN();
		ArrayList<String> Big = new ArrayList<String>();
		ArrayList<Integer> Num = new ArrayList<Integer>();
		while(input != 0){
			System.out.println("0.結束 1.輸入 2.寫入檔案");
			System.out.printf("你的選擇:");
			input = sc.nextInt();
			if(input==1){
				System.out.println("請以 零,壹,貳,參,肆,伍,陸,柒,捌,玖  輸入");
				System.out.println("中文數字:");
				String a = sc.next();
				Big.add(a);
				int end= tr.ToInt(a);
				Num.add(end);
				System.out.println("阿拉伯數字:"+end);
			}
			else if(input == 2){
				try{
					PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("money.txt")));
					for(int i=0;i<Num.size();i++){
						pw.println("第"+(i+1)+"個資料");
						pw.println("中文數字:"+Big.get(i));
						pw.println("阿拉伯數字:"+Num.get(i));
					}
						
					pw.close();
				}
				catch(IOException e){
					System.out.println("Error");
				}
			}
		}
	}
}



class TURN{
	public int ToInt(String str) {
		Scanner sc=new Scanner(System.in);
		int[] number={0,1,2,3,4,5,6,7,8,9};
		String[] str1={"零","壹","貳","參","肆","伍","陸","柒","捌","玖"};
		String[] str2={"拾","佰","仟","萬","億"};
		int opnumber=0,ctemp=1,numtemp=0,flag=0,cflag=0;
		for(int i=str.length()-1;i>=0;i--){
			for(int j=0;j<str1.length;j++){
				if(str1[j].equals(str.charAt(i)+"")){
					numtemp=number[j]*ctemp;
					ctemp=1;
					flag=1;
					if(cflag==1)
						for(int l=0;l<4;l++,ctemp*=10);
					else if(cflag==2)
						for(int l=0;l<8;l++,ctemp*=10);
				}
			}
			if(flag==0){
				for(int k=0;k<str2.length-1;k++){
					if(str2[k].equals(str.charAt(i)+"")){
						for(int l=0;l<=k;l++,ctemp*=10);
						if(k==3)
							cflag=1;
						
					}
					
				}
				if(str2[4].equals(str.charAt(i)+"")){
					for(int l=0;l<4;l++,ctemp*=10);
					cflag=2;
				}
				
			}
			else{
				opnumber+=numtemp;
				flag=0;
			}
		}
		return opnumber;
	}
}

