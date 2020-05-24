public class Food{
    //------------------------------//
    String name;
    FoodComponent component_1;
    FoodComponent component_2;
    ArrayList<FoodCompunent> components;
    //------------------------------//

    public Food(String new_name, FoodComponent c1, FoodComponent c2){
        name = new_name;
        component_1 = c1;
        component_2 = c2;
    }

    public double FoodProtein(){
        double ProteinInFood = component_1.FindProteinsAmount() + component_2.FindProteinsAmount();
        return ProteinInFood;
    }

    public double FoodFats(){
        double FatsInFood = component_1.FindFatsAmount() + component_2.FindFatsAmount();
        return FatsInFood;
    }

    public double FoodCarbs(){
        double CarbsInFood = component_1.FindCarbsAmount() + component_2.FindCarbsAmount();
        return CarbsInFood;
    }

    public double TogetherAmount(){
        double AmountTogether = 0;
        for(int i = 0; i < components.size(); i++){
            AmountTogether += components.get(i).AskAmount();
        }
        return AmountTogether;
    }


}