public class Arvutus2{
    public static void main(String[] arg){
        int arv=Integer.parseInt(arg[0]);
        int arv2=Integer.parseInt(arg[1]);
        //Koosta etteantud suuruses korrutustabel.
        for(int i=0; i<arv; i++){
            for(int j=0; j<arv2; j++){
                int v=i*j;
                if(i<10) {System.out.print(" ");}
                System.out.print(" "+v);
            }
            System.out.println();
        }
    }
}
