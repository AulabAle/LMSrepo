public class LanciaMissili extends Arm{

    public LanciaMissili(String sideLabel) {
        super(sideLabel);
    }

    @Override
    public void attacca() {
       System.out.println("Ti sto attaccando con il LanciaMissili sul braccio: " + this.sideLabel);
    }

}
