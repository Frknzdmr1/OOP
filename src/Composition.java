public class Composition {
    public static void main(String[] args) {

        Student student = new Student();
        student.setName("Joe Bloggs");
        student.setDateOfBirth("30/06/1998");
        student.setStudentHousing(true);

        student.setCourse(new Course());
        student.getCourse().setTitle("Computer Science");
        student.getCourse().setLevel("Undergraduate");
        student.getCourse().setStartDate("07/09/2021");

        System.out.println("Name: " +student.getName());
        System.out.println("DoB: " + student.getDateOfBirth());
        System.out.println("Housing: " + (student.hasStudentHousing() ? "Yes" : "No"));
        System.out.println("The Student " + student.getName()+ "is enrolled on the " + student.getCourse().getTitle()+ "course due start on " + student.getCourse().getStartDate());
    }
}
