import java.util.*;
import java.io.*;
public class abc {
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
	int k=0;
	do{
	
	System.out.println("1.終極密碼");
	System.out.println("2.猜數字");
	System.out.println("3.結束");
	int num=sc.nextInt();
	switch(num){

	case 1:

		Numguess nn = new Numguess();
		nn.run();
		
		break ;
	case 2:
  		int[] iArray = new int[4];
  		int[] eArray = new int[4];
  		int i;
  		int ans [] = new int[4];
  		int A = 0, B = 0;
  		boolean theSame;
  	do {
   		theSame = false;
   	for(i = 0; i < 4; i++) {
    		iArray[i]=(int)(Math.random()*9+1);
   	}
  	for (int x = 0; x < 3; x++) {
    	for(int y = x + 1; y < 4; y++) {
     	if(iArray[x] == iArray[y]) {
      	theSame = true;
      	break;
     	}
    	}
   	}
  	} 
	while (theSame);
  
  	for(i = 0; i < iArray.length; i++){}
  
  	Scanner scanner = new Scanner(System.in); 
  
  	while (A != 4) {
   		A = 0; B = 0;
  		for (int f = 1; f <= ans.length; f++) {
    		System.out.print("請輸入第" + f + "個數字:");
    		ans[f-1] = scanner.nextInt();
   	}
   	for(int j = 0; j < ans.length; j++) {
    		System.out.print(ans[j]+" ");
   	}
  	for (int u = 0; u < ans.length; u++) {
    		if(iArray[u] == ans[u]) {
     			A++;
     			continue;
    	}
    	for(int x = 0; x < ans.length; x++) {
     		if(ans[u] == iArray[x]) {
      			B++;
      			break;
     	}
    	}
   	}
   	System.out.println("\n"+A+"A");
   	System.out.println(B+"B");
}
		
	break;   
	case 3:
		k=-1;
		break;
	}

}
	while(k!=-1);
}

}

class Numguess{
	int x,min=0,max=100;
	int times;
	public Numguess(){
	x = (int)(Math.random()*100)+1;
	times=1;
}
	public void run(){
	Scanner key = new Scanner(System.in);
	System.out.print("請輸入猜測的數字(介於1~100間): ");
	int n = key.nextInt();

	while(n!=x){
	
	if(n>x){
		max=n;
		System.out.println("輸入小一點");
	}
	else{
		min=n;
		System.out.println("輸入大一點");
	}
	System.out.print("再輸入猜測的數字("+min+"~"+max+") :");
	times++;
	n = key.nextInt();
	}

	System.out.println("恭喜答對了!!");
	if(times<=8)
		System.out.println("您猜了"+times+"次，高手!!");
	else if(times<=13)
		System.out.println("您猜了"+times+"次，厲害!!");
	else
		System.out.println("您猜了"+times+"次，請多練習!!");
	}
}

