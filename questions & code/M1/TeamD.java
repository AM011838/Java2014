import java.io.*;

public class TeamD {
	public static void main(String[] args) throws IOException{
		  BufferedReader br = 
				  new BufferedReader(new InputStreamReader(System.in)); 
		  int tmp = 0;
		  String test = br.readLine();
		  for ( int i = 0; i < test.length(); ++i ) {
			  char c = test.charAt( i );
		      int j = (int) c;
		      tmp = tmp + j - 96;
		  }
		  System.out.println(test + " = " + tmp + " point");
	}
}