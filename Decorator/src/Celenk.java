public class Celenk extends AgacDecorator {

    public Celenk(NoelAgaci noelAgaci) {
        super(noelAgaci);

    }
    public String suslemek(){
        return super.suslemek() + celenkIleSuslemek();
    }
    private String celenkIleSuslemek() {
        return " Çelenk ile süsle";
    }
}
