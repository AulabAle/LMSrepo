import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> languages = Arrays.asList("spring","java","oop","php");

        List<String> intruders = getIntruders(languages, "php");

        for (String intruder : intruders) {
            System.out.println(intruder);
        }

    }

    public static List<String> getIntruders(List<String> names, String intruder){
        List<String> result = new ArrayList<String>();

        for (String name : names) {
            if(name.equals(intruder)){
                result.add(name);
            }
        }

        return result;
    }
}
