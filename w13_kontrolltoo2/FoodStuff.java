public class FoodStuff{
    //------------------------------//
        String name; //Nimi
        double proteins; //Valgud
        double fats; //Rasvad
        double carbs; //Süsivesikud
    //------------------------------//
        public FoodStuff(String new_name, double new_proteins, double new_fats, double new_carbs){
        //------------------------------//    
            name = new_name;
            proteins = new_proteins;
            fats = new_fats;
            carbs = new_carbs;
        //------------------------------//
            double allPercent = proteins + fats + carbs;
            if(allPercent >= 100){
                System.out.println("Toiduainete protsendid ületavad antud piirangud. (100%)");
            }
    
        }
    
        public double AskProteins(){
            return proteins;
        }
        public double AskFats(){
            return fats;
        }
        public double AskCarbs(){
            return carbs;
        }
    
        public String toString(){
            return "Nimetus: " + name + "\n"
            + "Valgud: " + proteins + "\n"
            + "Rasvad: " + fats + "\n"
            + "Süsivesikud: "+ carbs;
        }
    }