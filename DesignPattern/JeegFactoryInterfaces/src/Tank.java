public class Tank extends Moveable implements CanAttack {

    @Override
    void muovitiInAvanti() {
        System.out.println("Mi muovo in avanti con i cingoli");
        
    }

    @Override
    void muovitiIndietro() {
        System.out.println("Mi muovo indietro con i cingoli");
        
    }

    @Override
    public void attacca() {
        System.out.println("Sparo un missile");
        
    }
    
}
