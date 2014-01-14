import java.util.Scanner;
import java.io.*;

public class Final01{

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int j = 0;
			if (s.charAt(i) < 'A' || s.charAt(i) > 'Z') {
				j = (s.charAt(i) - 'a') + 1;
				sum = sum + j;
			} else {
				j = (s.charAt(i) - 'A') + 1;
				sum = sum + j;
			}
		}
		System.out.printf("%s = %d point",s,sum);
	}
}
 