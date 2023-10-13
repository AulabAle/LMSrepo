public class App {
    public static void main(String[] args) throws Exception {
        
        Arm sx = new Trivella("Sinistro");

        Arm dx = new Laser("Destro");
        Moveable legs = new Tank();

        Jeeg jeeg = new Jeeg(dx, sx, legs);

        jeeg.muovitiInAvanti();
        jeeg.attaccoDestro();
        jeeg.attaccoSinistro();
        jeeg.muovitiIndietro();
        jeeg.attaccoSinistro();
        jeeg.attaccoDestro();
        jeeg.attaccoParteDiSotto();
    }
}
