public class Proov2{
    public static void main(String[] arg){
        Jook j1=new Jook("piim", 0.28, 1.05);
        Joogipudel p1=new Joogipudel(j1, 0.5, 0.2, 0.1, 0);
        System.out.println(p1);
        System.out.println(p1.kysiMass());
        Joogipudel p2=new Joogipudel(null, 0.5, 0.05, 0.1, 1);
        System.out.println(p2);
        System.out.println(p2.kysiMass());
        System.out.println(p2.kysiOmahind());
    }
}