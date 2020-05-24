public class Triangle extends Shape {
    double a;
    double b;
    double c;
    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPerimeter(){
        return a + b + c;
    }
}