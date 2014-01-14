
import java.util.Scanner;
public class Cal {

	public static void main(String[] args) {
		String []num={"","I","II","III","IV","V","VI","VII","VIII","IX"};
		String []to5={"V","L","D","V"};// 5 50 500 5000
		String []to4={"IV","XL","CD","MV"};// 4 40 400 4000
		String []to1={"I","X","C","M"};// 1 10 100 1000
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int []store=new int[4];
		int count=0;
		for(int i=0;i<4;i++){
			store[i]=n%10;  
			n=n/10;
			count++; 
		}
		for(int i=count-1;i>=0;i--){
			if(i!=0){
				switch(store[i]){
					case 0:
						System.out.print("");
						break;
					case 1:
						System.out.print(to1[i]); 
						break;
					case 4:
						System.out.print(to4[i]);
						break;
					case 5:
						System.out.print(to5[i]);
						break; 
					case 9:
						System.out.print(to1[i]+to1[i+1]);
						break;
					default :
						if(store[i]>5&&store[i]<9){
							System.out.print(to5[i]);
							for(int k=0;k<store[i]-5;k++)
								System.out.print(to1[i]);
						}
						else if(store[i]<4&&store[i]>1){   
							for(int j=0;j<store[i];j++)
								System.out.print(to1[i]);	
						}
						break;
				}
				
			}
			else{
				System.out.print(num[store[i]]);
			}
		}
		
}
}