public class App {
    public static void main(String[] args) throws Exception {
        var sensors = new Sensor[] {
            new Sensor(37, 55),
            new Sensor(28, 55),
            new Sensor(44, 55),
            new Sensor(25, 55),
            new Sensor(24, 55),
        };

        System.out.println(getEverageTemp(sensors, (Object o) -> ((Sensor) o).getExternalTemp()));
    }

    public static <T> double getEverageTemp(T[] sensors, PropertyGetter pGetter){

        if(sensors == null){
            return 0;
        }

        double sum = 0;

        for (T s : sensors) {
            sum += pGetter.getProperty(s);
        }
        
        return (sum/sensors.length);
    }
}
