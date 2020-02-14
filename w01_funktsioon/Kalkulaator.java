import java.util.*;

public class Kalkulaator{
    public static void main(String[] arg){

        int num1 = 0; // Esimene number
        int num2 = 0; // Teine number
        char operaator; //data type ehk operator/märk

        double vastus = 0.0; // vastus tuleks üks koht pärast koma.

        Scanner scanObject = new Scanner(System.in);

        System.out.println("Sisesta esimene number: "); //Väljastab teksti
        num1 = scanObject.nextInt(); // sisestab num1 teksti olevasse lahtrisse

        System.out.println("Sisesta teine number:"); //Väljastab teise teksti
        num2 = scanObject.nextInt(); // sisestab num2 teise oleva numbri lahtrisse

        System.out.println("Milline märk/operaator? : "); // Väljastab operaatori teksti
        operaator = scanObject.next().charAt(0); // Sisestada saab vaid ühe märgi/operaatori

        switch (operaator){ // ehk teatud vahemikus olevad valikud võetakse vaid kasutusele, nagu näiteks +, -. *, /.
            case '+': vastus = num1 + num2; // liitlmine
                break; // kui leiab antud operaatori, siis katkestab switch tegumoe.
            case '-': vastus = num1 - num2;
                break;
            case '*': vastus = num1 * num2;
                break;
            case '/': vastus = num1 / num2;
                break;
        }
        System.out.println("Sisestatud tehe ja vastus:"); // teksti väljastus
        System.out.println(num1+" "+operaator+" "+num2+" = "+vastus); // Teksti väljastus arvutuste ja vastusega.

    }
}