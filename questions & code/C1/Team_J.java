
import java.util.Scanner;

public class Team_J {
	public static  void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String []name={"Willie","Ben","Rock","Stone","Tonny"};
		int []num={1,2,3,4,5};
		int []Ch=new int[5];
		int []Eng=new int[5];
		int []Ma=new int[5];
		int []total=new int [5];
		for(int x=0;x<5;x++){
			Ch[x]=(int)(Math.random()*101);
			Eng[x]=(int)(Math.random()*101);
			Ma[x]=(int)(Math.random()*101);
			total[x]=Ch[x]+Eng[x]+Ma[x];
			
		}
		int n,n1,k=0;
		
		do{
		
		System.out.println("1.排序成績");
		System.out.println("2.離開");
		n=sc.nextInt();
		switch(n){
			case 1:
				int temp;
				String temp1;
				System.out.println("1.排序號");
				System.out.println("2.排國文");
				System.out.println("3.排英文");
				System.out.println("4.排數學");
				System.out.println("5.排總分");
				n1=sc.nextInt();
				switch(n1){
					case 1:
							for(int i=0;i<5;i++){
								for(int j=0;j<5;j++){
								if(num[i]>num[j]){
									temp=num[i];
									num[i]=num[j];
									num[j]=temp;
									
									temp=Ch[i];
									Ch[i]=Ch[j];
									Ch[j]=temp;
									
									temp=Eng[i];
									Eng[i]=Eng[j];
									Eng[j]=temp;
									
									temp=Ma[i];
									Ma[i]=Ma[j];
									Ma[j]=temp;
									
									temp1=name[i];
									name[i]=name[j];
									name[j]=temp1;
									
									temp=total[i];
									total[i]=total[j];
									total[j]=temp;
								}
							}
							}
							for(int i=0;i<5;i++){
								System.out.println(name[i]+"\t"+num[i]+"\t"+Ch[i]+"\t"+Eng[i]+"\t"+Ma[i]+"\t"+total[i]);
						}
							break;
					case 2:
				
						for(int i=0;i<4;i++){
							for(int j=0;j<5;j++){
							if(Ch[i]>Ch[j]){
								temp=Ch[i];
								Ch[i]=Ch[j];
								Ch[j]=temp;
								
								temp=num[i];
								num[i]=num[j];
								num[j]=temp;
								
								
								
								temp=Eng[i];
								Eng[i]=Eng[j];
								Eng[j]=temp;
								
								temp=Ma[i];
								Ma[i]=Ma[j];
								Ma[j]=temp;
								
								temp1=name[i];
								name[i]=name[j];
								name[j]=temp1;
								
								temp=total[i];
								total[i]=total[j];
								total[j]=temp;
							}
							}
						}
						for(int i=0;i<5;i++){
							System.out.println(name[i]+"\t"+num[i]+"\t"+Ch[i]+"\t"+Eng[i]+"\t"+Ma[i]+"\t"+total[i]);
					}
						break;
					case 3:
						for(int i=0;i<4;i++){
							for(int j=0;j<5;j++){
							if(Eng[i]>Eng[j]){
								temp=Eng[i];
								Eng[i]=Eng[j];
								Eng[j]=temp;
								
								temp=num[i];
								num[i]=num[j];
								num[j]=temp;
								
								temp=Ch[i];
								Ch[i]=Ch[j];
								Ch[j]=temp;
								
								
								temp=Ma[i];
								Ma[i]=Ma[j];
								Ma[j]=temp;
								
								temp1=name[i];
								name[i]=name[j];
								name[j]=temp1;
								
								temp=total[i];
								total[i]=total[j];
								total[j]=temp;
							}
							}
						}
						for(int i=0;i<5;i++){
							System.out.println(name[i]+"\t"+num[i]+"\t"+Ch[i]+"\t"+Eng[i]+"\t"+Ma[i]+"\t"+total[i]);
					}
						break;
					case 4:
						for(int i=0;i<4;i++){
							for(int j=0;j<5;j++){
							if(Ma[i]>Ma[j]){
								
								temp=Ma[i];
								Ma[i]=Ma[j];
								Ma[j]=temp;
								
								temp=num[i];
								num[i]=num[j];
								num[j]=temp;
								
								temp=Ch[i];
								Ch[i]=Ch[j];
								Ch[j]=temp;
								
								temp=Eng[i];
								Eng[i]=Eng[j];
								Eng[j]=temp;
								
								
								
								temp1=name[i];
								name[i]=name[j];
								name[j]=temp1;
								
								temp=total[i];
								total[i]=total[j];
								total[j]=temp;
							}
							}
						}
						for(int i=0;i<5;i++){
							System.out.println(name[i]+"\t"+num[i]+"\t"+Ch[i]+"\t"+Eng[i]+"\t"+Ma[i]+"\t"+total[i]);
					}
						break;
					case 5:
						for(int i=0;i<5;i++){
							for(int j=0;j<5;j++){
							if(total[i]>total[j]){
								temp=total[i];
								total[i]=total[j];
								total[j]=temp;
								
								temp=num[i];
								num[i]=num[j];
								num[j]=temp;
								
								temp=Ch[i];
								Ch[i]=Ch[j];
								Ch[j]=temp;
								
								temp=Eng[i];
								Eng[i]=Eng[j];
								Eng[j]=temp;
								
								temp=Ma[i];
								Ma[i]=Ma[j];
								Ma[j]=temp;
								
								temp1=name[i];
								name[i]=name[j];
								name[j]=temp1;
								
								
							}
							}
						}
						for(int i=0;i<5;i++){
								System.out.println(name[i]+"\t"+num[i]+"\t"+Ch[i]+"\t"+Eng[i]+"\t"+Ma[i]+"\t"+total[i]);
						}
						break;
					}
						
			case 2:
					k=-1;
					break;
		}
		}while(k!=-1);
	}
}
