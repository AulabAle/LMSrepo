public class App {
    public static void main(String[] args) throws Exception {

        JeegFactoryPrototype jeegFactoryPrototype = new JeegFactoryPrototype();

        LanciaMissili lm = jeegFactoryPrototype.instanceCasting(JeegComponentType.LanciaMissiliDx, LanciaMissili.class);
        Laser ls =  jeegFactoryPrototype.instanceCasting(JeegComponentType.LaserSx, Laser.class);
        Tank tank = jeegFactoryPrototype.instanceCasting(JeegComponentType.Tank, Tank.class);

        Jeeg jeeg = new Jeeg(lm, ls, tank);
        
        jeeg.muovitiInAvanti();
        jeeg.attacca();
        jeeg.muovitiIndietro();
    }
}
