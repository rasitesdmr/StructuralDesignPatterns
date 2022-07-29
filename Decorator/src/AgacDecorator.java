public class AgacDecorator implements NoelAgaci{

    private NoelAgaci noelAgaci;

    public AgacDecorator(NoelAgaci noelAgaci) {
        this.noelAgaci = noelAgaci;
    }

    @Override
    public String suslemek() {
        return noelAgaci.suslemek();
    }
}
