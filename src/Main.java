public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setId("1");
        student.setFirstName("Duygu");
        student.setLastName("Orhan");
        student.setAge("20");
        student.setSchoolName("BANU");
        student.setGrade("2");
        Student student2 = new Student("2", "Leyla", "Matar", "19", "YTU", "2");
        Student student3 = new Student("3", "Nilay", "Besli", "20", "GTU", "2");
        StudentManager studentManager = new StudentManager();
        studentManager.displayInfo(student);
        Instructor instructor = new Instructor();
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setLessons("Java&React");
        InstructorManager instructorManager = new InstructorManager();
        instructorManager.displayInfo(instructor);
        User[] users = new User[]{student, student2, student3, instructor};
        UserManager userManager = new UserManager();
        userManager.addMultiple(users);
    }
}
