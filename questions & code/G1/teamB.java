import java.io.*;
public class TeamB{
	public static void main(String[] args) throws IOException { 
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in)) ;
		int[][] p=new int[20][7] ;
		try{
		PrintWriter pw=
				new PrintWriter(new BufferedWriter(new FileWriter("PUCCA.txt")));
			
		for(int i=0;i<20;i++){
			p[i][0]=i+1;
			pw.print(p[i][0]+"\t");
			System.out.print(p[i][0]+"\t");
			for(int j=1;j<6;j++){
				p[i][j]=(int)(Math.random()*10+1);
				System.out.print(p[i][j]+"\t");
				pw.print(p[i][j]+"\t");
				p[i][6]+=p[i][j];
			}
			System.out.print(p[i][6]);
			System.out.println();
			pw.println();
		}
		pw.close();
		}
		catch(IOException e1){
			System.out.println("error");
		}
		
		for(int i=0;i<20;i++){
			for(int j=0;j<20;j++){
				if(p[i][6]>p[j][6]){
					for(int m = 0 ; m < 7 ; m++){ 
						int tmp = p[i][m] ; 
						p[i][m] = p[j][m] ; 
						p[j][m] = tmp ; 
						}
				}
			}
		}
		
		System.out.println("輸入編號");
		int I = Integer.parseInt(br.readLine()) ;
		int x=0;
		while(x <20){
		if(p[x][0] == I){
			System.out.println("編號 : "+p[x][0]);	
			System.out.println("第一天獲利 : "+(p[x][1]*1000));
			System.out.println("第二天獲利 : "+(p[x][2]*1000));
			System.out.println("第三天獲利 : "+(p[x][3]*1000));
			System.out.println("第四天獲利 : "+(p[x][4]*1000));
			System.out.println("第五天獲利 : "+(p[x][5]*1000));
			System.out.println("總獲利 : "+(p[x][6]*1000)) ;
			System.out.println("名次 :" + x) ;
			x++ ;
			x=20 ;
		}
		else
			x++ ;
		}
}
}

 

 

 