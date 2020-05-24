public class Proov {
    public static void main(String[] arg){
        Vehicle Mercedes = new Car();
        //-------- Auto käivitus --------//
        Mercedes.run();
        //-------- Käigu vahetus --------//
        Mercedes.changeGear(1);
        Mercedes.whatGear();
        //-------- Käigu vahetus --------//
        Mercedes.changeGear(2);
        Mercedes.whatGear();
        //-------- Käigu vahetus --------//
        Mercedes.changeGear(3);
        Mercedes.whatGear();
    }
}