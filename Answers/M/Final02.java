import java.util.*;  
import java.io.*;
class Final02{  
	public static void main(String[] args) throws IOException {  
        BufferedReader br =   
         new BufferedReader ( new InputStreamReader (System.in));   
		String number = br.readLine();  
		StringTokenizer numbertoken1=new StringTokenizer(number);
		StringTokenizer numbertoken2=new StringTokenizer(number);
		int i=0;
		int j=0;
		String abc;
		while(numbertoken1.hasMoreTokens()){
			abc= numbertoken1.nextToken();
			i++;
		}
		int[] token= new int[i];
		while(numbertoken2.hasMoreTokens()){
			token[j] = Integer.parseInt(numbertoken2.nextToken());
			j++;
		}
		/*for (j=0;j<i;j++) {
			System.out.println(" token[ "+j+" ] = " + token[j]);
		}*/
		int[] count=new int [i-1];
		for (j=0;j<i-1;j++) {
			while(token[i-1]>=token[j]){
				count[j]=token[i-1]/token[j];
				token[i-1]=token[i-1]%token[j];
			}
		}
		/*for (j=0;j<i-1;j++) {
			System.out.println(" count[ "+j+" ] = " + count[j]);
		}*/
		for (j=0;j<i-1;j++) {
			System.out.println("共要找 " + count[j]+" 張的 "+token[j]+" 元");
		}
	}  
}