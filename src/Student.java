
public class Student extends User {
    private String age;
    private String schoolName;
    private String grade;
    private String id;

    public Student() {
    }

    public Student(String id, String firstName, String lastName, String age, String schoolName, String grade) {
        super(firstName, lastName);
        this.age = age;
        this.schoolName = schoolName;
        this.grade = grade;
        this.id = id;
    }

    public String getAge() {
        return this.age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getGrade() {
        return this.grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
