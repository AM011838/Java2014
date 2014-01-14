import java.util.Stack;
import java.io.*;

public class D1
{
	public static void main(String[] args) throws Exception{
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		FileReader fr = new FileReader("D:/question.txt");
		BufferedReader br = new BufferedReader(fr);
	while(br!= null){
		String strNum = br.readLine(); 
		String expression=strNum;
		
		Stack operand=new Stack();			
		Stack operator=new Stack();			
		
		
		System.out.println();
		int position=0;			
		char chr_operator;
		
		while (true)
		{
			
			if (isOperator(expression.charAt(position)))
			{
				if (operator.empty()==true || expression.charAt(position)=='('){					
					operator.push(new Character(expression.charAt(position)));
				}
				else
				{
					
					if (expression.charAt(position)==')'){
						
						if (operator.peek().toString().charAt(0)!='('){
							System.out.print(operator.pop());
							continue;
						}
						else{
							operator.pop();			
						}
					}
					else
					{
						
						if ((priority(expression.charAt(position))<=priority(operator.peek().toString().charAt(0))))
							System.out.print(operator.pop());

						operator.push(new Character(expression.charAt(position)));
					}
				}
			}
			else
				System.out.print(expression.charAt(position));

			position++;
			if (position==expression.length())
				break;
		}

		
		while (operator.empty()==false)
			System.out.print(operator.pop());
	}
	}
	
	static boolean isOperator(int value){
		if (value=='+' || value=='-' || value=='*' || value=='/' || value=='(' || value==')')
			return true;
		else
			return false;
	}

	
	static int priority(char operator){
		if (operator=='(')
			return 0;
		else if (operator=='+' || operator=='-')
			return 1;
		else if (operator=='*' || operator=='/')
			return 2;
		else return 0;
	
	}
	
}
