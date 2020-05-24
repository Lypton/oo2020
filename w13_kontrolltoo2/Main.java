import java.util.ArrayList;
import java.util.Scanner;

public class Main{
    public static void main(String[] arg){

        FoodComponent potato = new FoodComponent(50, new FoodStuff("Kartul", 1.7, 10, 14.6));
        
        ArrayList<FoodComponent> components = new ArrayList<FoodComponent>();

        components.add(potato);

        Food salad = new Food("Salat", components);

        System.out.println("Salati valgud: " + salad.FoodProtein());
    }
}