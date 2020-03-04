public class Info{
    String bodytype;
    String make;
    String model;
    String fueltype;
    double price;
    int amount;

    public Info(String new_bodytype, String new_make, String new_model, String new_fueltype, double new_price, int new_amount){
        bodytype = new_bodytype;
        make = new_make;
        model = new_model;
        fueltype = new_fueltype;
        price = new_price;
        amount = new_amount;
    }
    public int getAmount(){
        return amount;
    }
}