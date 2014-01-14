import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Team_D {
	public static String getAnswer(int a, int b) {
		String answer = "";
		String ss = "";
		List<String> temp = new ArrayList<String>();
		if (a % b == 0)
			return (a / b) + "";
		ss = a / b + ".";
		a = a % b;
		while (a != 0) {
			if (!temp.contains(a + "")) {
				temp.add(a + "");
			} else {
				int j;
				int len = temp.size();
				for (j = 0; j < len; j++)
					if (temp.get(j).equals(a + ""))
						break;
				answer = answer.substring(0, j) + 
						 answer.substring(j, answer.length())  ;
				break;
			}
			a = a * 10;// 餘數*10
			answer += a / b;// 保存商
			a = a % b;// 求下一個餘數
		}
		return ss + answer;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A/B 0<A<B<=100  ");
		String s = scan.nextLine();
		String[] ss = s.split("/");
		int m = Integer.parseInt(ss[0]);
		int n = Integer.parseInt(ss[1]);
		System.out.println(+m+"/"+n+"="+getAnswer(m, n));
	}
}