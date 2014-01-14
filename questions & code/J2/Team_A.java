import java.util.Scanner;

public class B2 {
	public static void main(String[] argv) {
		Scanner cin = new Scanner(System.in);
		String s;
		while (cin.hasNext()) {
			s = cin.nextLine();
			int x = Integer.parseInt(s);
			if ((x / 4) == 0 | (x / 400) == 0 | (x / 100) != 0) {
				System.out.println("¥­¦~");
			} else if ((x / 4) != 0 | (x / 400) != 0 | (x / 100) == 0) {
				System.out.println("¶|¦~");
			}
		}
	}
}