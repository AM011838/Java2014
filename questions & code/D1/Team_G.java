import java.util.Stack;
import java.io.*;

public class Team_G
{
	public static void main(String[] args) throws Exception{
		BufferedReader br=
		        new BufferedReader(new FileReader("question.txt"));
		Stack operand=new Stack();			//儲存運算元的堆疊
		Stack operator=new Stack();			//儲存運算子
		String expression=new String();		//儲存運算式
		String str1=br.readLine();
		String str2=br.readLine();
		String str3=br.readLine();
		String str4=br.readLine();
		String str5=br.readLine();
		expression=br.readLine();
		for(int count=0;count<5;count++)
		{
			PrintWriter pw=new PrintWriter
					(new BufferedWriter(new FileWriter("ans.txt")));
			if(count==0)
			expression=str1;
		else if(count==1)
			expression=str2;
		else if(count==2)
			expression=str3;
		else if(count==3)
			expression=str4;
		else if(count==4)
			expression=str5;
		int position=0;			//紀錄字元位置
		char chr_operator;

		while (true)
		{
			
			//該字元是否為運算子
			if (isOperator(expression.charAt(position)))
			{
				if (operator.empty()==true || expression.charAt(position)=='('){					
					operator.push(new Character(expression.charAt(position)));
				}
				else
				{
					//右結束括號出現
					if (expression.charAt(position)==')'){
						//處理至出現'('
						if (operator.peek().toString().charAt(0)!='(')
						{
							System.out.print(operator.pop());
							pw.print(operator.pop());
							continue;
						}
						else{
							operator.pop();			//丟棄'('
						}
					}
					else
					{
						//優先權較大者方可直接堆上堆疊
						if ((priority(expression.charAt(position))<=priority(operator.peek().toString().charAt(0))))
						{
							System.out.print(operator.pop());
							pw.print(operator.pop());
					}
						operator.push(new Character(expression.charAt(position)));
					}
				}
			}
			else
			{
				System.out.print(expression.charAt(position));//直接印出運算元
				pw.print(expression.charAt(position));
			}
			position++;
			if (position==expression.length())
				break;
		}

		//印出堆疊中剩餘的運算子
		while (operator.empty()==false)
		{
			System.out.print(operator.pop());
			pw.print(operator.pop());
		}
		System.out.println();	
		pw.println();
		pw.close();
	}
	}

	//判斷是否為運算子
	static boolean isOperator(int value){
		if (value=='+' || value=='-' || value=='*' || value=='/' || value=='(' || value==')')
			return true;
		else
			return false;
	}

	//判斷優先權
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

