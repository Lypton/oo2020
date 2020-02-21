public class BikeTest {

    public static void main(String[] args){
        Bike bike_1 = new Bike("CK AM - BMX", BikeType.BMX, BikeColorType.BLUE);
        bike_1.action();

        Bike bike_2 = new Bike("SPARK RC 900 - MTB", BikeType.MTB, BikeColorType.BLACK);
        bike_2.action();

        Bike bike_3 = new Bike("GENIUS RC 910 - DIRTJUMPBIKE", BikeType.DIRTJUMPBIKE, BikeColorType.WHITE);
        bike_3.action();

    }
}