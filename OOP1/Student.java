public class Student extends Person {
    private int average;

    private static int extracurricularHours = 8;

    public Student(String name, String surname, int age, int average) {
        super(name, surname, age);
        this.average = average;
    }

    @Override
    public void introduceYourself() {
        System.out.println("Ciao sono " + this.name + " " + this.surname + " ho " + this.age + " anni, e la mia media ad Aulab è " + getAverage() + " e le ore extracurriculari concesse agli studenti sono " + extracurricularHours);
        
    }

    public static void changeExtracurricularHours(int newExtracurricularHours){
        extracurricularHours = newExtracurricularHours;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public boolean equals(Object obj){

        if(this == obj) return true;

        if(obj == null || this.getClass() != obj.getClass()) return false;
       
        Student other = (Student) obj;
        
        if(this.average == other.average ) return true;

        return false;
    }
}
