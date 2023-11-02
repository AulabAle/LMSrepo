public class App {
    public static void main(String[] args) throws Exception {

        JeegFactorySingleton jeegFactorySingleton = new JeegFactorySingleton();
        
        //Castato
        LanciaMissili lm = (LanciaMissili) jeegFactorySingleton.instance(JeegComponentType.LanciaMissiliDx);
        Laser ls = (Laser) jeegFactorySingleton.instance(JeegComponentType.LaserSx);
        Tank tank = (Tank) jeegFactorySingleton.instance(JeegComponentType.Tank);

        Jeeg jeeg = new Jeeg(lm, ls, tank);
        
        jeeg.muovitiInAvanti();
        jeeg.attacca();
        jeeg.muovitiIndietro();

        //Non castato
        LanciaMissili lmC = (LanciaMissili) jeegFactorySingleton.instanceCasting(JeegComponentType.LanciaMissiliDx, LanciaMissili.class);
        Laser lsC = (Laser) jeegFactorySingleton.instanceCasting(JeegComponentType.LaserSx, Laser.class);
        Tank tankC = (Tank) jeegFactorySingleton.instanceCasting(JeegComponentType.Tank, Tank.class);

        Jeeg jeegC = new Jeeg(lmC, lsC, tankC);
        
        jeegC.muovitiInAvanti();
        jeegC.attacca();
        jeegC.muovitiIndietro();
    }
}
