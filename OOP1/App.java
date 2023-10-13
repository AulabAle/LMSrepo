public class App {
    public static void main(String[] args) {
        
        Teacher teacher1 = new Teacher("Ale", "Leo", 35, "Java :''(");

        Student student1 = new Student("Roberto", "Sasso", 29, 6);

        teacher1.introduceYourself();
        student1.introduceYourself();

        Teacher.changeMaxSalary(900);
        Student.changeExtracurricularHours(6);

        teacher1.introduceYourself();
        student1.introduceYourself();

        teacher1.setSubject("Laravel :D");
        student1.setAverage(9);

        teacher1.introduceYourself();
        student1.introduceYourself();
    }
}
