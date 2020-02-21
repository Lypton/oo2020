public class Bike {
    private String name;
    BikeType bikeType;
    BikeColorType bikeColorType;

    public Bike(String name, BikeType bikeType, BikeColorType bikeColorType){
        this.name = name;
        this.bikeType = bikeType;
        this.bikeColorType = bikeColorType;
    }

    public String getName(){
        return name;
    }

    public String getType(){
        if (bikeType == BikeType.BMX){
            return "BMX";
        } else if (bikeType == BikeType.MTB){
            return "MTB";
        } else {
            return "DIRTJUMPBIKE";
        }
    }

    public String getColor(){
        if(bikeColorType == BikeColorType.BLUE){
            return "Sinine";
        } else if (bikeColorType == BikeColorType.BLACK){
            return "Must";
        } else {
            return "Valge";
        }
    }

    public void action(){
        if (bikeType == BikeType.BMX){
            System.out.println("BMX on ühekäiguline ja tehtud viguriteks ning trikitamiseks noortele rattafriikidele.");
        } else if (bikeType == BikeType.MTB){
            System.out.println("MTB - Kõige universaalsem ja vastupidavam rattatüüp, sobib sõitmiseks nii metsas, maastikul kui ka linnas.");
        } else {
            System.out.println("DIRT BIKE JUMP - Uus suunanäitaja! Rajuks oskuslikuks sõiduks ja mõnusaks lifestyle harrastuseks noortele.");
        }
    }
}