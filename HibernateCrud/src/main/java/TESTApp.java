
import dao.StudentDAO;
import model.Student;

public class TESTApp {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();

        // Create
        Student student = new Student("Sujay", "Sujay@example.com");
        studentDAO.saveStudent(student);

        Student fetchedStudent = studentDAO.getAllStudents().get(0);
        System.out.println("Fetched Student: " + fetchedStudent);


        fetchedStudent.setEmail("newemail@example.com");
        studentDAO.updateStudent(fetchedStudent);


        studentDAO.deleteStudent(fetchedStudent.getId());

        System.out.println("Operations completed successfully!");
    }
}