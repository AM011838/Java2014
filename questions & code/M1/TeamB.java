import java.io.*;
public class TeamB{
		public static void main(String[] args)throws IOException{
			BufferedReader br =
					new BufferedReader(new InputStreamReader(System.in));
		int zz1=0,zz2=0,zz3=0,zz4=0,zz5=0,zz6=0,zz7=0,zz8=0,zz9=0,zz10=0,zz11=0,zz12=0;
		int zz13=0,zz14=0,zz15=0,zz16=0,zz17=0,zz18=0,zz19=0,zz20=0,zz21=0,zz22=0,zz23=0,zz24=0;
		
		String str=br.readLine();
	
		for(int i=0;i<str.length()-1;i++){
			char w=str.charAt(i);
			if(w=='a')
				c++;
			if(w=='b')
				q++;
			if(w=='c')
				h++;
			if(w=='d')
				l++;
			if(w=='e')
				t++;
			if(w=='f')
				c++;
			if(w=='g')
				q++;
			if(w=='h')
				h++;
			if(w=='i')
				l++;
			if(w=='j')
				t++;
			if(w=='k')
				c++;
			if(w=='l')
				q++;
			if(w=='m')
				h++;
			if(w=='n')
				l++;
			if(w=='o')
				t++;
			if(w=='p')
				l++;
			if(w=='q')
				t++;
			if(w=='r')
				c++;
			if(w=='s')
				q++;
			if(w=='t')
				h++;
			if(w=='u')
				l++;
			if(w=='v')
				t++;
			if(w=='w')
				c++;
			if(w=='x')
				q++;
			if(w=='y')
				h++;
			if(w=='z')
				l++;
			
		}
		System.out.println("a:"+c+"\ne:"+q+"\ni:"+h+"\no:"+l+"\nu:"+t);
		/*for(int i=0;i<str.length()-1;i++){
			char w=str.charAt(i);
			if(w=='a')
				str=str.replace('a','*');
			if(w=='e')
				str=str.replace('e','*');
			if(w=='i')
				str=str.replace('i','*');
			if(w=='o')
				str=str.replace('o','*');
			if(w=='u')
				str=str.replace('u','*');
		}
		System.out.println(str);*/
		}
	
		
	}
