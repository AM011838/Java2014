import java.io.*;
public class TeamB {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
			new BufferedReader(new InputStreamReader(System.in));
			String[] w1={"ÆFªÛ","¤d¦~¤H°Ñ","¦ó­º¯Q","¬e§û","·íÂk","¥VÂÎ®L¯ó","³À¯ñ"};
			String[] w2={"¬õº÷","µµº÷","¥Õº÷","«Cº÷","ºñº÷","¾íº÷","¾¥º÷","ª÷º÷","»Èº÷"};
			String[] w3={"¥Õ¥ÉÅN","¥Õ¥É¼Y","¥Õ¥É¦Õ¹¢","»ÈÂ¯","»È¼Y","»È¦Õ¹¢","ª÷Â¯","ª÷¼Y","ª÷¦Õ¹¢","µµ¥ÉÅN","µµ¥É¼Y","µµ¥É¦Õ¹¢"};
			int[] mt1={10000,100000,700,40,200,350,3000};
			int[] mt2={200,900,4000,700,700,500,4000,10000,5000};
			int[] mt3={500,900,1000,700,1000,1200,4000,10000,15300,5000,10000,24000};
			int[][] n1=new int[7][3];
			int[][] n2=new int[9][3];
			int[][] n3=new int[12][3];
			int sum1=0,sum2=0,sum3=0;
			try{
				BufferedReader dr =
				new BufferedReader(new FileReader("inventory.txt"));
				for(int i=0;i<3;i++){
					String s=dr.readLine();
					String a[]=s.split(",");
					for(int j=0;j<a.length;j++){
						if(i==0)
						n1[j][1]=Integer.parseInt(a[j]);
						else if(i==1)
						n2[j][1]=Integer.parseInt(a[j]);
						else if(i==2)
						n3[j][1]=Integer.parseInt(a[j]);
						}
					}
				dr.close();
			}
			catch(IOException e1){
				System.out.println("error");
			}
			for(int i=0;i<7;i++){
				n1[i][0]=Integer.parseInt(br.readLine());
				n1[i][2]=(n1[i][0]-n1[i][1]);
			}
			for(int i=0;i<7;i++){
				System.out.println(w1[i]+"®tÃB:"+n1[i][2]+"®t»ù:"+(n1[i][2]*mt1[i]));
				sum1+=(n1[i][2]*mt1[i]);
			}
			System.out.println("®tÃBÁ`¼Æ:"+sum1);
			for(int i=0;i<9;i++){
				n2[i][0]=Integer.parseInt(br.readLine());
				n2[i][2]=n2[i][0]-n2[i][1];
			}
			for(int i=0;i<9;i++){
				System.out.println(w2[i]+"®tÃB:"+n2[i][2]+"®t»ù:"+(n2[i][2]*mt2[i]));
				sum2+=(n2[i][2]*mt2[i]);
			}
			System.out.println("®tÃBÁ`¼Æ:"+sum2);
			for(int i=0;i<12;i++){
				n3[i][0]=Integer.parseInt(br.readLine());
				n3[i][2]=n3[i][0]-n3[i][1];
			}
			for(int i=0;i<12;i++){
				System.out.println(w3[i]+"®tÃB:"+n3[i][2]+"®t»ù:"+(n3[i][2]*mt3[i]));
				sum3+=(n3[i][2]*mt3[i]);
			}
			System.out.println("®tÃBÁ`¼Æ:"+sum3);

	}
}