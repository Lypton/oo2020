public class Square extends Shape {
    double x;

    public Square(double x){
        this.x = x;
    }

    @Override
    public double getPerimeter(){
        return 4 * x;
    }
}