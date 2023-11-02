public class App {
    public static void main(String[] args) throws Exception {

        Arm sx = new Laser("sx");
        Arm dx = new LanciaMissili("dx");
        Moveable mov = new Tank();

        Jeeg jeeg = new Jeeg(sx, dx, mov);

        jeeg.muovitiInAvanti();
        jeeg.attacca();
        jeeg.muovitiIndietro();
        
    }
}
