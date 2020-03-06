import java.io.BufferedReader; // loeks faili
import java.io.FileReader; //loeks teksti
import java.io.IOException; // data lugemisel kasutab exceptioneid
import java.io.InputStreamReader; // nummeerib data
import java.io.PrintWriter; //kirjutaks faili


public class ConsoleCalc {

    public static void main(String[] args) throws IOException
    {
        String expression;
        BufferedReader br = new BufferedReader(new FileReader("Expression.txt"));
        expression = br.readLine();
        System.out.println(expression);

        PostFixConverter pc = new PostFixConverter(expression); 
        pc.printExpression();

        PostFixCalculator calc = new PostFixCalculator(pc.getPostfixAsList());
        System.out.println("Result: " + calc.result());

        PrintWriter pw1 = new PrintWriter("Results.txt");
        pw1.println(calc.result());
        pw1.close();
    }
}