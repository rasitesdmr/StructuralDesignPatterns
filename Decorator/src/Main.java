public class Main   {
    public static void main(String[] args) {
        NoelAgaci agac1 = new Celenk(new NoelAgaciImpl());
        System.out.println(agac1.suslemek());
        NoelAgaci agac2  = new KabarcikIsiklari(new NoelAgaciImpl());
        System.out.println(agac2.suslemek());
    }
}
