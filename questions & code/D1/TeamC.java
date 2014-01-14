import java.util.*;

 

public class TeamC

{

 
 public static void main(String args[])
    {

        String s;

        System.out.println("請輸入任意中序式");

        Scanner temp=new Scanner(System.in);

        s=temp.nextLine();
        System.out.println("後序式為:"+InFix.toPostfix(s));



        

    }

}

 

class InFix 

{

    private static int priority(char op) 

    {  

        switch(op)

        { 

             case '+':

             case '-': 

             return 1; 

             case '*': 

             case '/': 

             return 2;

             case '^':

             return 3;    

             default:            

            return 0;

        }  

    }

    

    public static String toPostfix(String input) 

    {

        LinkedList<Character> stack = new LinkedList<Character>();

        stack.add('\u0000'); // 堆疊底部為空字元

        StringBuffer buffer = new StringBuffer();

        for(char c : input.toCharArray()) 

        { 

            switch(c) 

            {  

                // 運算子堆疊 

                case '(': 

                    stack.add(c);

                    break; 

                case '+':

                case '-': 

                case '*': 

                case '/': 

        while(priority(stack.getLast()) >= priority(c))

        { 

          buffer.append(stack.removeLast());

        } 

                    // 存入堆疊 

                    stack.add(c);

                    break; 

                // 遇 ) 輸出至 ( 

                case ')': 

                    while(stack.getLast() != '(') 

                    { 

                        buffer.append(stack.removeLast());

                    } 

                        stack.removeLast();  // 不輸出( 

                        break; 

                // 運算元直接輸出 

                default: 

                    buffer.append(c);

            } 

        } 

        

        while(stack.getLast() != '\u0000') 

        { 

            buffer.append(stack.removeLast());

        }

        

        return buffer.toString();

    }

    

    //中序式轉成前序式

    public static String toPrefix(String input) 

   {

        LinkedList<Character> stack = new LinkedList<Character>();

        stack.add('\u0000'); // 堆疊底部為空字元

        StringBuffer buffer = new StringBuffer();

        for(char c : new StringBuffer(input).reverse().toString().toCharArray()) 

        { 

            switch(c)

            {  

                // 運算子堆疊 

                case ')': 

                    stack.add(c);

                    break; 

              

                    case '+':

 case '-': 

 case '*': 

 case '/': 

                 while(priority(stack.getLast()) > priority(c))

                { 

                    buffer.append(stack.removeLast());

                } 

                    // 存入堆疊 

                stack.add(c);

                break; 

                // 遇 ( 輸出至 )

                 case '(': 

                    while(stack.getLast() != ')')

                    { 

                       buffer.append(stack.removeLast());

                    } 

                        stack.removeLast();  // 不輸出)

                        break; 

                        // 運算元直接輸出 

                        default: 

                        buffer.append(c);

                } 

        } 

        

        while(stack.getLast() != '\u0000') 

         { 

            buffer.append(stack.removeLast());

         }

        

        return buffer.reverse().toString();

       }

} 