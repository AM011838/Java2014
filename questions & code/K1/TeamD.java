import java.io.*;

class CtoF{
	private float tmp1;
	private float tmp2;
	public CtoF(float degree){
		tmp1 = degree;
		tmp2 = (degree * 9) / 5 + 32;
	}
	public void show(){
		System.out.println("Celcius " + tmp1 + " to Fahrenheit is " + tmp2);
	}
}

class FtoC{
	private float tmp1;
	private float tmp2;
	public FtoC(float degree){
		tmp1 = degree;
		tmp2 = ((degree - 32) * 5) / 9;
	}
	public void show(){
		System.out.println("Fahrenheit " + tmp1 + " to Celcius is " + tmp2);
	}
}

public class TeamD {
	public static void main(String[] args) throws IOException{
		  BufferedReader br = 
				  new BufferedReader(new InputStreamReader(System.in)); 
		  for(;;){
			  System.out.println("=========================");
			  System.out.println("Celcius to Fahrenheit(1)");
			  System.out.println("Fahrenheit to Celcius(2)");
			  System.out.println("End(-1)");
			  System.out.println("=========================");
			  System.out.print("Please enter your choice:");
			  String str1 = br.readLine();
			  int n = Integer.parseInt(str1);
		  
			  if(n == -1){
				  System.out.print("End");
				  break;
			  }
			  
			  System.out.print("Please enter degree:");
			  String str2 = br.readLine();
			  float degree = Float.parseFloat(str2);
		  
			  if(n == 1){
				  CtoF ctof = new CtoF(degree);
				  ctof.show();
			  }
			  if(n == 2){
				  FtoC ftoc = new FtoC(degree);
				  ftoc.show();
			  }
		  }
	}
}