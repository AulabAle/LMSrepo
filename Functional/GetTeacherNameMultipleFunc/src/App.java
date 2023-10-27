import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Person> people = Arrays.asList(
            new Person("Pippo", 27),
            new Person("Pluto", 30),
            new Person("Paperino", 27)
        );

        Person teacher = people.stream()
                                .filter(person -> "Pluto".equals(person.getName()) && person.getAge() > 27)
                                .findAny()
                                .orElse(null);

        if(teacher != null){
            System.out.println("Hai selezionato: " + teacher.getName());
        }else{
            System.out.println("Non trovato!");
        }
    }
}
