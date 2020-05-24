public class App {
    public static void main(String[] args) throws Exception {
        Shape shape_1 = new Square(8);
        Shape shape_2 = new Triangle(5, 3, 7);
        System.out.println("Ruudu ümbermõõt: " + shape_1.getPerimeter() + "cm");
        System.out.println("Kolmnurga ümbermõõt: " + shape_2.getPerimeter() + "cm");
    }
}