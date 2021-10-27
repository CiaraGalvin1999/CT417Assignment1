import org.joda.time.DateTime;

public class CourseProgramme {
    private String courseName;
    private Module[] modules;
    private Student[] students;
    private DateTime startDate;
    private DateTime endDate;

    //Constructors
    public CourseProgramme() {

    }
    public CourseProgramme(String courseName, Module[] modules, Student[] students, DateTime startDate, DateTime endDate) {
        this.courseName = courseName;
        this.modules = modules;
        this.students = students;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    //Setters
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setModules(Module[] modules) {
        this.modules = modules;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void setStartDate(DateTime startDate) {
        this.startDate = startDate;
    }
    public void setEndDate(DateTime endDate) {
        this.endDate = endDate;
    }

    //Getters
    public String getCourseName() {
        return courseName;
    }
    public Module[] getModules() {
        return modules;
    }
    public Student[] getStudents() {
        return students;
    }
    public DateTime getStartDate() {
        return startDate;
    }
    public DateTime getEndDate() {
        return endDate;
    }
}

