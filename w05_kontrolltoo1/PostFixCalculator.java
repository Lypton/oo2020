import java.math.BigDecimal;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

// operaatori leidmine pärast arvu
// algoritmi lugemisel (vasakult paremale, kas scanned operator on operaator)
public class PostFixCalculator {
    private List<String> expression = new ArrayList<String>();
    private Deque<Double> stack = new ArrayDeque<Double>();

    public PostFixCalculator(List<String> postfix) {expression = postfix;}


    public BigDecimal result()
    {
        for(int i = 0; i != expression.size(); ++i)
        {

            if(Character.isDigit(expression.get(i).charAt(0)))
            {
                stack.addLast(Double.parseDouble(expression.get(i)));
            }
            else 
            {
                double tempResult = 0;
                double temp;
                // Kui on + - * /
                switch(expression.get(i))
                {
                    case "+": temp = stack.removeLast();
                              tempResult = stack.removeLast() + temp;
                              break;

                    case "-": temp = stack.removeLast();
                              tempResult = stack.removeLast() - temp;
                              break;

                    case "*": temp = stack.removeLast();
                              tempResult = stack.removeLast() * temp;
                              break;

                    case "/": temp = stack.removeLast();
                              tempResult = stack.removeLast() / temp;
                              break;
                }
                stack.addLast(tempResult);
            }
        }
        return new BigDecimal(stack.removeLast()).setScale(3, BigDecimal.ROUND_HALF_UP);
    }
}