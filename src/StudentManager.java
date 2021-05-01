public class StudentManager extends UserManager {
    public StudentManager() {
    }

    public void displayInfo(Student student) {
        System.out.println("Student Information;");
        System.out.println("id:" + student.getId());
        System.out.println("Name:" + student.getFirstName());
        System.out.println("Last Name:" + student.getLastName());
        System.out.println("Age:" + student.getAge());
        System.out.println("School:" + student.getSchoolName());
        System.out.println("Grade:" + student.getGrade());
    }
}