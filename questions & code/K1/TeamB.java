import java.io.*;
public class TeamB{
public static void main(String[] args)
throws IOException{

BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

float i=5.5f; 

System.out.println("1攝氏轉華氏 ");
System.out.println("2華氏轉攝氏");
System.out.println("輸入-1離開");
String strn=br.readLine();

while(strn!=("-1")){
if(strn.equals("1")){
	System.out.print("請輸入攝氏溫度");
	String stri=br.readLine();
	i =Integer.parseInt(stri);
System.out.println("攝氏"+i+"度轉華氏是" + ((i*9/5)+32)+"度c");
}else if(strn.equals("2")){
	System.out.print("請輸入華氏溫度");
	String stri=br.readLine();
	i =Integer.parseInt(stri);
System.out.println("華氏"+i+"度轉攝氏是" + ((i-32)*5/9)+"度c");
}
}


}
}

