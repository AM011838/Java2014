import java.util.*;

public class TeamE{
	public static void main(String[] args){
		String local  = "Teemo rides a thin line between chipper compatriot and unrepentant killer, but there's no one else I'd rather have as a friend.";
		Scanner sc = new Scanner(System.in);
		String find = sc.next();
		int i=0,answer=0,flag=1,yorn=0;
		Turn Tr = new Turn();
	if(find.equals("killer")){
		while(i<local.length()){
			
			if(local.charAt(i) == find.charAt(0)){
				int j=1;
				answer = i+1;
				i++;
				
				while(j<find.length() && (flag != 0)){
					if(find.charAt(j) != local.charAt(i))
						flag = 0;
					else 
						flag = 3;
						
				
						j++;
						i++;
						
				}
			}
			if(flag == 3 && local.charAt(i++)==' ' && local.charAt(answer-2) == ' '){
				System.out.print("Teemo¦b²Ä ");
				Tr.intoStr(answer);
				System.out.println(" ­Ó¦ì¸m");
				yorn++;
				flag=1;
			}
			if(flag == 0)
				flag = 1;
			i++;
		}
	}
	else
		System.out.println("Teemo is not here");

	}
}




/**/
class Turn{
	public  void intoStr(int input){
		/*2147483647*/
		String[] number={"¹s","³ü","¶L","°Ñ","¸v","¥î","³°","¬m","®Ã","¨h"};
		String[] numtype={"¬B","¨Õ","¥a","¸U","»õ","¥ü"};
		
		int[] check = new int[3];
		for(int i=0;i<3;i++,input/=10)
			check[i] = input%10;
		if(check[2] != 0)
			System.out.print(number[check[2]]+"¨Õ");
		if(check[1] != 0)
			System.out.print(number[check[1]]+"¬B");
		if(check[0] != 0)
			System.out.print(number[check[0]]);
	}
}