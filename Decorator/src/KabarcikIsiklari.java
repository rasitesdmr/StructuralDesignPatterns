public class KabarcikIsiklari extends AgacDecorator {

    public KabarcikIsiklari(NoelAgaci noelAgaci) {
        super(noelAgaci);
    }
    public String suslemek(){
        return super.suslemek() + kabarcikIsiklariIleSusleyin();
    }
    public String kabarcikIsiklariIleSusleyin(){
        return " kabarcık ışıkları ile";
    }
}
