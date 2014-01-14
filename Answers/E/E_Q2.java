import java.io.*;
import java.util.*;
public class E_Q2{
	public static void main(String[] args){
		System.out.print("Input your lifename:");
		String lifename = new Scanner(System.in).next();
		String test="";
		try {
			 BufferedReader br = new BufferedReader(new FileReader(lifename));
				test=br.readLine();
				test=br.readLine();
				
			br.close();
		}
		catch(IOException e){
			System.out.println("ERROR");
		}
		String[] Array = test.split(" ");
		int head=0,thousandflag=-1,hundredflag=-1;
		for(int i=0;i<Array.length;i++){//find the head of number of String.
			if(Array[i].equals("finds") || Array[i].equals("and"))//if has and i will be cover
				head = i+1;
			if(Array[i].equals("hundred"))
				hundredflag = i-1;
			if(Array[i].equals("thousand") || Array[i].equals("thousand,"))
				thousandflag = i-1;
		}
		Turn Tu = new Turn();	
		int total=0;
		if(thousandflag != -1)// thousand or no
			total += (Tu.Num(Array[thousandflag]))*1000;
		if(hundredflag != -1)//  hundred  or no
			total += (Tu.Num(Array[hundredflag]))*100;
		if(!(head == thousandflag || head == hundredflag))
			for(int i=head;i<Array.length-1;i++)
				total+=Tu.Num(Array[i]);
		System.out.println("");
		System.out.println("End:"+total);
		System.out.println("");
		Derive dr = new Derive();
		System.out.println("First:"+dr.ToFirst(total));
	}
}
class Tu{
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

class Derive{//? -> n what is n ?
	public int ToFirst(int diamond){
		int head=1,tail=diamond,now=(head+tail)/2;
		CandyPaper CP = new CandyPaper();
		for(;;){// cycle no stop
				if((tail-head)<=5){
					now = tail;
					break;
				}
				else if(CP.candycount(now) > diamond)
					tail = now;
				else if(CP.candycount(now) < diamond)
					head = now;
				else if(CP.candycount(now) == diamond)
					break;
				now=(head+tail)/2;
		}
			while(CP.candycount(now-1) > diamond){
				now -=1;
			}
		return now;
	}
	
}

class CandyPaper {
  public int candycount(int diamond) {
		int cloth=0;
		for(int i=0;i<diamond;i++){
				cloth++;
			if(cloth/4==1){
				cloth=0;
				diamond++;
			}
		}
		return diamond;
  }
}