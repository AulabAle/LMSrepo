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
        LanciaMissili lmC = jeegFactorySingleton.instanceCasting(JeegComponentType.LanciaMissiliDx, LanciaMissili.class);
        Laser lsC = jeegFactorySingleton.instanceCasting(JeegComponentType.LaserSx, Laser.class);
        Tank tankC = jeegFactorySingleton.instanceCasting(JeegComponentType.Tank, Tank.class);

        Jeeg jeegC = new Jeeg(lmC, lsC, tankC);
        
        jeegC.muovitiInAvanti();
        jeegC.attacca();
        jeegC.muovitiIndietro();


        JeegFactoryPrototype jeegFactoryPrototype = new JeegFactoryPrototype();
        
        //Castato
        LanciaMissili lmp = (LanciaMissili) jeegFactoryPrototype.instance(JeegComponentType.LanciaMissiliDx);
        Laser lsp = (Laser) jeegFactoryPrototype.instance(JeegComponentType.LaserSx);
        Tank tankp = (Tank) jeegFactoryPrototype.instance(JeegComponentType.Tank);

        Jeeg jeegP = new Jeeg(lmp, lsp, tankp);
        
        jeegP.muovitiInAvanti();
        jeegP.attacca();
        jeegP.muovitiIndietro();

        //Non castato
        LanciaMissili lmPC = jeegFactoryPrototype.instanceCasting(JeegComponentType.LanciaMissiliDx, LanciaMissili.class);
        Laser lsPC = jeegFactoryPrototype.instanceCasting(JeegComponentType.LaserSx, Laser.class);
        Tank tankPC = jeegFactoryPrototype.instanceCasting(JeegComponentType.Tank, Tank.class);

        Jeeg jeegPC = new Jeeg(lmPC, lsPC, tankPC);
        
        jeegPC.muovitiInAvanti();
        jeegPC.attacca();
        jeegPC.muovitiIndietro();
    }
}
