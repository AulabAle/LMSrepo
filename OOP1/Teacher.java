public class Teacher extends Person{

    private String subject;

    private static int maxSalary = 1100;

    public Teacher(String name, String surname, int age, String subject) {
        super(name, surname, age);
        this.subject = subject;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Ciao sono " + this.name + " " + this.surname + " ho " + this.age + " anni, e la materia che insegno è " + getSubject() + ", il salario massimo per tutti i docenti è " + maxSalary + " Euro");
        
    }


    public static void changeMaxSalary(int newSalary){
        maxSalary = newSalary;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    public boolean equals(Object obj){

        if(this == obj) return true;

        if(obj == null || this.getClass() != obj.getClass()) return false;
       
        Teacher other = (Teacher) obj;

        if(this.subject == other.subject ) return true;

        return false;
    }
    
}
