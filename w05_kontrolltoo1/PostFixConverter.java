import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;


public class PostFixConverter {
    private String infix;
    private Deque<Character> stack = new ArrayDeque<Character>();
    private List<String> postfix = new ArrayList<String>();

    public PostFixConverter(String expression)
    {
        infix = expression;
        convertExpression();
    }

    private void convertExpression()
    {

        StringBuilder temp = new StringBuilder();
        // loeb ära tehte pikkuse enne, kui hakkab stackima
        for(int i = 0; i != infix.length(); ++i)
        {           
            if(Character.isDigit(infix.charAt(i)))
            {

                temp.append(infix.charAt(i));

                while((i+1) != infix.length() && (Character.isDigit(infix.charAt(i+1)) 
                                                  || infix.charAt(i+1) == '.'))
                {
                    temp.append(infix.charAt(++i));
                }
                postfix.add(temp.toString());
                temp.delete(0, temp.length());
            }
            else
                inputToStack(infix.charAt(i));
        }
        clearStack();
    }

    // pushib stacki ette, kui on sulud ning kui lõpetab ära. 
    private void inputToStack(char input)
    {
        if(stack.isEmpty() || input == '(')
            stack.addLast(input);
        else 
        {
            if(input == ')')
            {
                while(!stack.getLast().equals('('))
                {
                    postfix.add(stack.removeLast().toString());
                }
                stack.removeLast();
            }
            else 
            {
                if(stack.getLast().equals('('))
                    stack.addLast(input);
                else
                {
                    while(!stack.isEmpty() && !stack.getLast().equals('(') && 
                            getPrecedence(input) <= getPrecedence(stack.getLast()))
                    {
                        postfix.add(stack.removeLast().toString());
                    }
                    stack.addLast(input);
                }
            }
        }
    }


    private int getPrecedence(char op)
    {
         if (op == '+' || op == '-')
                return 1;
         else if (op == '*' || op == '/')
                return 2;
         else if (op == '^')
                return 3;
         else return 0;
    }


    private void clearStack()
    {
        while(!stack.isEmpty())
        {
            postfix.add(stack.removeLast().toString());
        }
    }


    public void printExpression()
    {
        for(String str : postfix)
        {
            System.out.print(str + ' ');
        }
    }

    // Võetud GeeksforGeeks //The expression of the form a b op. When an operator is followed for every pair of operands.
    public List<String> getPostfixAsList()
    {
        return postfix;
    }
}