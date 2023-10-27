import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {
        List<Person> people = Arrays.asList(
            new Person("Pippo", 27),
            new Person("Pluto", 27),
            new Person("Paperino", 27),
            new Person("Minnie", 27),
            new Person("Topolino", 27)
        );

        List<String> nameToFilter = Arrays.asList("Minnie","Topolino","Pippo");

        // List<String> result = people.stream().filter(person -> nameToFilter.contains(person.getName())).map(Person::getName).collect(Collectors.toList());
        
        // for (String string : result) {
        //     System.out.println(string);
        // }
        
        people.stream().filter(person -> nameToFilter.contains(person.getName())).collect(Collectors.toList()).forEach(person -> System.out.println(person.getName()));
    }
}
