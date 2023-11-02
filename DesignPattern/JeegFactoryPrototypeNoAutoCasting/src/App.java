public class App {
    public static void main(String[] args) throws Exception {

        // Arm sx = new Laser("sx");
        // Arm dx = new LanciaMissili("dx");
        // Moveable mov = new Tank();

        // Jeeg jeeg = new Jeeg(sx, dx, mov);

        // jeeg.muovitiInAvanti();
        // jeeg.attacca();
        // jeeg.muovitiIndietro();

        JeegFactory jeegFactory = new JeegFactory();

        LanciaMissili lm = (LanciaMissili) jeegFactory.instance(JeegComponentType.LanciaMissiliDx);
        Laser ls = (Laser) jeegFactory.instance(JeegComponentType.LaserSx);
        Tank tank = (Tank) jeegFactory.instance(JeegComponentType.Tank);

        Jeeg jeeg = new Jeeg(lm, ls, tank);
        
        jeeg.muovitiInAvanti();
        jeeg.attacca();
        jeeg.muovitiIndietro();
    }
}
