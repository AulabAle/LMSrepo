public class JeegFactoryPrototype {
    @SuppressWarnings("unchecked")
    public <T> T instanceCasting(JeegComponentType componentType, Class<T> classType){
        Object component = null;

        switch (componentType) {
            case Legs:
                component = new Legs();
                break;
            case Tank:
                component = new Tank();
                break;            
            case LanciaMissiliDx:
                component = new LanciaMissili("dx");
                break;            
            case LanciaMissiliSx:
                component = new LanciaMissili("sx");
                break;            
            case LaserSx:
                component = new Laser("sx");
                break;            
            case LaserDx:
                component = new Laser("dx");
                break;
            default:
                component = new Object(); 
                break;
        }

        return (T) component;
    }
}
