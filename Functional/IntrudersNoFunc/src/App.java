import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<String> languages = Arrays.asList("spring","java","oop","php");

        // List<String> intruders = languages.stream().filter(name -> name.equals("php")).collect(Collectors.toList());

        // intruders.forEach(System.out::println);

        languages.stream()
                .filter(name -> name.equals("php"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    
}
