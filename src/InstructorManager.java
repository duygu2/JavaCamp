public class InstructorManager extends UserManager {
    public InstructorManager() {
    }

    public void displayInfo(Instructor instructor) {
        System.out.println("Instructor Information;");
        System.out.println("Name:" + instructor.getFirstName());
        System.out.println("Last Name:" + instructor.getLastName());
        System.out.println("Lessons:" + instructor.getLessons());
    }
}
