public class Jook{
    String nimetus;
    double omahind; //eur/liiter
    double erikaal; //kg/liiter

    public Jook(String unimetus, double uomahind, double uerikaal){
        nimetus=unimetus;
        omahind=uomahind;
        erikaal=uerikaal;
    }
    public String kysiNimetus(){return nimetus;}
    public String kysiOmahind(){return omahind;}
    public String kysiErikaal(){return erikaal;}

    public String toString(){return nimetus+ " " +omahind+" eur/liiter "+erikaal+"kg/liiter";}
}