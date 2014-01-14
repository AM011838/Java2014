import java.util.Scanner; 
public class J1 {
	private final static String rnums[] = { "M", "CM", "D", "CD", "C", "XC",
			"L", "XL", "X", "IX", "V", "IV", "I" }; 
	private final static int anums[] = { 1000, 900, 500, 400, 100, 90, 50, 40,
			10, 9, 5, 4, 1 }; 

	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		String input; 
		while (sc.hasNext()) { 
			do {
				input = sc.nextLine(); 
			} while (input.trim().length() < 1); 
			if (input.charAt(0) == '#') { 
				break;
			}
			if (isDigit(input)) { 
				int n = Integer.parseInt(input); 
				if (n > 0 && n < 1000) { 
					System.out.println(input + " = " + toRnums(n));
				} else { 
					System.out.println("輸入的阿拉伯數字有誤！必須大於零且小於1000");
				}
			} else { 
				int n = toAnums(input); 
				if (toRnums(n).equals(input)) { 
					System.out.println(input + " = " + n);
				} else {
					System.out.println("輸入的羅馬數字有誤！");
				}
			}
		}
	}

	public static boolean isDigit(String s) { 
		try {
			int i = Integer.parseInt(s); 
		} catch (Exception e) { 
			return false; 
		}
		return true; 
	}

	public static String toRnums(int num) { 
		if (num == 0) { 
			return "ZERO";
		} else if (num < 0 || num > 1000) { 
			return "OVERFLOW";
		}

		StringBuilder output = new StringBuilder();
		for (int i = 0; num > 0 && i < anums.length; i++) 
		{
			while (num >= anums[i]) { 
				num -= anums[i];
				output.append(rnums[i]);
			}
		}
		return output.toString(); 
	}

	public static int toAnums(String s) { 
		int num = 0;
		StringBuilder Buffer = new StringBuilder(s); 
		for (int i = 0; Buffer.length() > 0 && i < anums.length; i++) 		{
			while (Buffer.indexOf(rnums[i]) == 0) { 
				num += anums[i]; 
				Buffer.delete(0, rnums[i].length()); 
			}
		}
		return num; 
	}
}
