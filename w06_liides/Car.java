public class Car implements Vehicle{
    int gear;
    public void run(){
        System.out.println("Auto käivitati.");
    }

    public void changeGear(int newGear){
        gear = newGear;
    }

    public void whatGear(){
        System.out.println("Kasutusel olev käik: " + gear);
    }

}