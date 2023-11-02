public class Laser extends Arm {

    public Laser(String sideLabel) {
        super(sideLabel);
    }
    
    @Override
    public void attacca() {
       System.out.println("Ti sto attaccando con il laser sul braccio: " + this.sideLabel);
    }
}
