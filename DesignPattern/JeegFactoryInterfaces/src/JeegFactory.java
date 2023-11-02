public abstract class JeegFactory {
    abstract Object instance(JeegComponentType componentType);
    abstract <T> T instanceCasting(JeegComponentType componentType, Class<T> classType);
}
