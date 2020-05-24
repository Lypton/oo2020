public class FoodComponent{
    //------------------------------//
    double amount; // Kogus
    FoodStuff ingredients; // Koostisosad
    //------------------------------//

    public FoodComponent(double new_amount, FoodStuff new_ingredients){
        amount = new_amount;
        ingredients = new_ingredients;
    }

    public double FindProteinsAmount(){ // Valgud
        double allProteins = (amount * (ingredients.AskProteins()))/100;
        return allProteins;
    }

    public double FindFatsAmount(){ // Rasvad
        double allFats = (amount * (ingredients.AskFats()))/100;
        return allFats;
    }

    public double FindCarbsAmount(){ // Süsivesikud
        double allCarbs = (amount * (ingredients.AskCarbs()))/100;
        return allCarbs;
    }

    public String toString(){
        return "Koostisosad: " + ingredients + "\n"
        + "Kogus: " + amount + "(g).";
    }
    
}