import java.util.Scanner;

public class TeamL {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			int j = 0;
			if (str.charAt(i) < 'A' || str.charAt(i) > 'Z') {
				j = (str.charAt(i) - 'a') + 1;
				sum = sum + j;
			} else {
				j = (str.charAt(i) - 'A') + 1;
				sum = sum + j;
			}
		}
		System.out.println(str +" = " +sum+" point ");
	}
}
