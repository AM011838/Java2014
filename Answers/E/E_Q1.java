import java.io.*;
import java.util.*;
public class E_Q1{
	public static void main(String[] args){
		int diamond=(int)(Math.random()*99)+1;
		int cloth=0,possible;
		StringTurn ST = new StringTurn();
		int CH = ST.ToInt();
		while(CH<1 || CH>100)
			CH = ST.ToInt();
		EngToNum ET = new EngToNum();
		int EG = ET.Eng_main();
		while(EG<1 || EG>100)
			EG = ET.Eng_main();
		Triangle TG = new Triangle();
		diamond = TG.ToEnd(diamond,CH,EG);
		TURN_to_String t = new TURN_to_String();
		
		System.out.println("First: "+diamond);
		System.out.print("秨﹍具 ");
		t.numtostr(diamond);
		System.out.println(" 聋苝ホ");
		for(int i=0;i<diamond;i++){
			possible=(int)(Math.random()*100);
			if(possible<45)
				cloth++;
			if(cloth/4==1){
				cloth=0;
				diamond++;
			}
		}
		
		t.numtoEng(diamond);

	}
}

class TURN_to_String{
	int[] num=new int[10];
	int count;
	public void numtostr(int number){

		String[] Bignum={"箂","滁","禠","把","竩","ヮ","嘲","琺","","╤"};
		String[] numtype={"珺","ㄕ","","窾"};
		for(count=0;number>0;number/=10,count++)
			num[count]=number%10;
		count--;
		for(;count>=0;count--){
			if(num[count] != 0){
				System.out.print(Bignum[num[count]]);
				if(count>0)
				System.out.print(numtype[count-1]);
			}else if(num[count]==0 && count>0)
				if(num[count-1] != 0)
					System.out.print(Bignum[num[count]]);
		}			
	}
	
	public void numtoEng(int number){
		String[] numEng={"and","one","two","three","four","five","six","seven","eight","nine"};
		String[] numEng2={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteenth"};
		String[] numEng3={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		String   numEng4="hundred";
		try{
			PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("A.txt")));
			pw.println("End: "+number);
			pw.print("Finally,she finds ");
			
			for(count=0;number>0;count++,number/=10){
				num[count]=number%10;
			}
			count--;
			/**/
			if(num[3]!=0){
				pw.print(numEng[num[2]]+" "+numEng4);
				if(num[2]!=0)
					pw.print(" thousand, ");
				else if(num[2]==0 && (num[1]!=0 || num[0]!=0))
					pw.print(" thousand and ");
				else
					pw.print(" thousand ");
			}
			/*κ*/
			if(num[2]!=0){
				pw.print(numEng[num[2]]+" "+numEng4);
				if(num[1]!=0 || num[0]!=0)
					pw.print(" and ");
			}
			/*の*/
			if(num[1]<2){
				if(num[2]!=0 && (num[1]+num[2]==0))
					pw.print("");
				else if(num[1]==0 )
					pw.print(numEng[num[0]]);
				else 
					pw.print(numEng2[num[0]]);
	
			}
			else{
				pw.print(numEng3[num[1]-2]+" ");
				if(num[0]>0)
					pw.print(numEng[num[0]]);
			}
			if(num[2]==0 && num[1]==0 && num[0]<2)
				pw.print(" Diamond.");
			else
				pw.print(" Diamonds.");
			pw.close();
		}
		catch(IOException e){
			System.out.println("ERROR");
		}
	}
}		
/*いゅ锣计 New*/
class StringTurn{
	public int ToInt() {
		Scanner sc=new Scanner(System.in);
		int[] number={0,1,2,3,4,5,6,7,8,9};
		String[] str1={"箂","滁","禠","把","竩","ヮ","嘲","琺","","╤"};
		String[] str2={"珺","ㄕ","","窾","货"};
		System.out.print("叫块材计(いゅ糶):");
		String str=sc.next();
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
/*璣ゅ锣计 New*/
class EngToNum{
	public	int  Eng_main(){
		Scanner sc = new Scanner(System.in);
		Turn Tu = new Turn();
		System.out.print("Please Input Second Number(English number):");
		String Eng = sc.nextLine();
		String[] array = Eng.split(" ");
		int total=0;
		for(int i=0;i<array.length;i++)
			total+=Tu.Num(array[i]);
		return total;
	}
}

class Turn{
	public  int Num(String check){
	
		
		String[] numEng={"and","one","two","three","four","five","six","seven","eight","nine"};
		String[] numEng2={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "nineteenth"};
		String[] numEng3={"twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
		int flag = 0,i;
		for(i=1;i<numEng.length;i++){
			if(check.equals(numEng[i])){
				flag = i;
				break;
			}
		}
		if(flag == 0){
			for(i=0;i<numEng2.length;i++){
				if(check.equals(numEng2[i])){
					flag = i+10;
			}
			}
		}
		
		if(flag == 0){
			for(i=0;i<numEng3.length;i++){
				if(check.equals(numEng3[i])){
					flag = (i*10)+20;
				}
			}
		}
		return flag;
	}
}
/*à*/

class Triangle{
	public int ToEnd(int n1,int n2,int n3){
		int[][] total = new int[5][5];
		int[] EEE = new int [15];
		int a=0,end=1,count=0,i;
		total[0][0] = n1;total[1][0]=n2;total[1][1]=n3;
		for(i=2;i<total.length;i++){
			total[i][0] = total[i-1][0]+total[i-2][0];
			for(int j=1;j<=i;j++){
				total[i][j] = total[i-1][j]+total[i-1][j-1];
			}
			total[i][i] = total[i-1][i-1]+total[i-2][i-2];
		}
		
		/*计程そ计*/
		if(n1>n2 && n1>n3)
			a=n1;
		else if(n2>n1 && n2>n3)
			a=n2;
		else if(n3>n1 && n3 >n2)
			a=n3;
		for(i=1;i<a;i++){
			if((n1%i==0 && n2%i==0) ||  (n2%i==0&& n3%i==0) || (n1%i==0&& n3%i==0))
				end = i;
		}
		end = end%15;
		for(i=0;i<total.length;i++){
			for(int j=0;j<=i;j++){
				EEE[count] = total[i][j];
				count++;
			}
		}
		for(i=0;i<total.length;i++){
			for(int del=5;del>i;del--)
				System.out.print("   ");
			for(int j=0;j<=i;j++){
				System.out.printf("%3d%3s",total[i][j]," ");
			}
			System.out.println("");
		}
		return EEE[end-1];
	}
}
/**/
