import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        List<Person> people = Arrays.asList(
            new Person("Pippo", 27),
            new Person("Pluto", 27),
            new Person("Paperino", 27)
        );

        Person teacher = getTeacherName(people, "Ciccio");

        if(teacher != null){
            System.out.println("Hai selezionato: " + teacher.getName());
        }else{
            System.out.println("Non trovato!");
        }


    }

    public static Person getTeacherName(List<Person> p , String name){

        Person result = null;

        for (Person person : p) {
            if(name.equals(person.getName())){
                result = person;
            }
        }

        return result;

    }
}
