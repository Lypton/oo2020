public class Joogipudel{
    Jook sisu;
    double maht; //liitrites
    double pudelimass; //kg
    double taarahind;
    int pudelityyp; //0 - klaas, 1 - plastik;
    
    public Joogipudel(Jook usisu, double umaht, double upudelimass, double utaarahind, int upudelityyp){
        sisu=usisu;
        maht=umaht;
        pudelimass=upudelimass;
        taarahind=utaarahind;
        pudelityyp=upudelityyp;
    }
    public String toString(){
        return "Sisu: " +sisu+ " taara "+((pudelityyp==0)?"klaas ":"plastik ") +pudelimass+ " kg, " +taarahind+ " eur.";
    }
    public double kysiMass(){
        if(sisu==null){return pudelimass;}
        return pudelimass + maht * sisu.kysiErikaal();
    }
    public double kysiOmahind(){
        if(sisu==null){return taarahind;}
        return taarahind + maht * sisu.kysiOmahind();
    }public double kysiMaht(){
    }
}