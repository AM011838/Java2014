import java.io.*;
class TeamM{
	void fahrenheit(float c){
		float f=0;
		f=c*9/5+32;
		System.out.println("攝氏"+c+"轉華氏"+f+"度f");	
	}
	void celsius(float f){
		float c=0;
		c=(f-32)*5/9;
		System.out.println("華氏"+f+"轉攝氏"+c+"度C");		
	}	
}
class TeamB{
	public static void main(String[] args)throws IOException{
		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("輸入1:攝氏轉華氏");
		System.out.println("輸入2:華氏轉攝氏");
		System.out.println("輸入-1離開");		
		String str=br.readLine();
		int num=Integer.parseInt(str);
		float k;
		temperature temper=new temperature();
		while(num!=-1){
			switch(num){
				case 1:
					System.out.println("請輸入攝氏度數:");
					str=br.readLine();
					k=Float.parseFloat(str);
					temper.fahrenheit(k);
					break;

				case 2:
					System.out.println("請輸入華氏度數:");
					str=br.readLine();
					k=Float.parseFloat(str);
					temper.celsius(k);
					break;

				default:
					System.out.println("請輸入-1,1,2其中一個數字");
					break;
			}
			str=br.readLine();
			num=Integer.parseInt(str);
		}
		
		if(num==-1){
			System.out.println("輸入-1離開");	
		}
	}
}
