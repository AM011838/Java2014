import java.util.*;
import static java.lang.System.out;
import java.io.*;
public class TeamE {
    private static int priority(char c) {
        return c == '+' || c == '-' ? 1 : c == '*' || c == '/' ? 2 : 0;
    }
    
    private static String toPostfix(String infix, boolean isPost) {
        String expr = isPost ? 
            infix : new StringBuffer(infix).reverse().toString();
        LinkedList<Character> stack = new LinkedList<>();
        StringBuilder output = new StringBuilder();
        char toStack = isPost ? '(' : ')';
        char toOutput = isPost ? ')' : '(';
        for(char c : expr.toCharArray()) {
            if(c == toStack) { stack.add(c); }
            else if("+-*/".indexOf(c) != -1) {
                while(!stack.isEmpty() && 
                       priority(stack.getLast()) >= priority(c)) { 
                    output.append(stack.removeLast());
                } 
                stack.add(c);
            }
            else if(c == toOutput) {
                while(stack.getLast() != toStack) { 
                    output.append(stack.removeLast());
                } 
                stack.removeLast();
            }
            else { output.append(c); }
        }
        
        while(!stack.isEmpty()) { output.append(stack.removeLast()); }
        
        return isPost ? output.toString() : output.reverse().toString();
    }
    
    public static String toPostfix(String infix) {
        return toPostfix(infix, true);
    }
    
    public static String toPrefix(String infix) {
        return toPostfix(infix, false);
    }
    /**/
    public static void main(String[] args) {
		ArrayList<String> myList = new ArrayList<String>(); 
		try{    
            BufferedReader br=new BufferedReader(new FileReader("question.txt"));  
			String a=br.readLine();
			while(a != null){
				String infix = a;
				out.println(toPostfix(infix));
				myList.add(toPostfix(infix));
				a=br.readLine();
			}
			br.close();    
            }    
        catch(IOException e){    
            System.out.println("Error");    
        } 
		String ss;/*= myList.get(1);
		System.out.print(asdasda);*/
		try{    
            PrintWriter pw=new PrintWriter(new BufferedWriter(new FileWriter("ans.txt")));
			for(int i=0;i<myList.size();i++){
				ss = myList.get(i);
				pw.println(ss);
			}
			pw.close();    
            }    
        catch(IOException e){    
            System.out.println("Error");    
        }
        
    }
}  