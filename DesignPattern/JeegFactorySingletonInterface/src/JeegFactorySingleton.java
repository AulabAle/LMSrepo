import java.util.HashMap;
import java.util.Map;

public class JeegFactorySingleton extends JeegFactory{
    
    private Map<JeegComponentType, Object> registry = new HashMap<JeegComponentType, Object>();

    @Override
    public Object instance(JeegComponentType componentType){

        switch (componentType) {
            case Legs:
                if(!registry.containsKey(componentType))
                    registry.put(componentType, new Legs());
            break;
        case Tank:
            if(!registry.containsKey(componentType))
                    registry.put(componentType, new Tank());
            break;            
        case LanciaMissiliDx:
            if(!registry.containsKey(componentType))
                    registry.put(componentType, new LanciaMissili("dx"));
            break;            
        case LanciaMissiliSx:
            if(!registry.containsKey(componentType))
                    registry.put(componentType, new LanciaMissili("sx"));
            break;            
        case LaserSx:
            if(!registry.containsKey(componentType))
                    registry.put(componentType, new Laser("sx"));
            break;            
        case LaserDx:
            if(!registry.containsKey(componentType))
                    registry.put(componentType, new Laser("dx"));
            break;
        }

        return registry.get(componentType);
    }

    @Override
    @SuppressWarnings("unchecked")
    public <T> T instanceCasting(JeegComponentType componentType, Class<T> classType){
        switch (componentType) {
                    case Legs:
                        if(!registry.containsKey(componentType))
                            registry.put(componentType, new Legs());
                    break;
                case Tank:
                    if(!registry.containsKey(componentType))
                            registry.put(componentType, new Tank());
                    break;            
                case LanciaMissiliDx:
                    if(!registry.containsKey(componentType))
                            registry.put(componentType, new LanciaMissili("dx"));
                    break;            
                case LanciaMissiliSx:
                    if(!registry.containsKey(componentType))
                            registry.put(componentType, new LanciaMissili("sx"));
                    break;            
                case LaserSx:
                    if(!registry.containsKey(componentType))
                            registry.put(componentType, new Laser("sx"));
                    break;            
                case LaserDx:
                    if(!registry.containsKey(componentType))
                            registry.put(componentType, new Laser("dx"));
                    break;
                }

        return (T) registry.get(componentType);
    }

}
