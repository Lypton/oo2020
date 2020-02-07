public class Arvutus1{
    public static void main(String[] arg){
        int arv=Integer.parseInt(arg[0]);
        System.out.println(arv*2);
        for(int i=0; i<arv; i++){
            System.out.println(i+". Tere");
            //Kuvage reanumbrile vastav arv tärne.
            for (int tnr=0; tnr<i; tnr++){
                System.out.println("*");
            }
            System.out.println(" "+i+". tere");
            
        }
    }
}
