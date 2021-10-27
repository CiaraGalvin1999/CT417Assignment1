public class Module {
    private String moduleName;
    private String moduleID;
    private Student[] students;
    private CourseProgramme[] courses;

    //Constructors
    public Module() {

    }
    public Module(String moduleName, String moduleID, Student[] students, CourseProgramme[] courses) {
        this.moduleName = moduleName;
        this.moduleID = moduleID;
        this.students = students;
        this.courses = courses;
    }

    //Setters
    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
    public void setModuleID(String moduleID) {
        this.moduleID = moduleID;
    }
    public void setStudents(Student[] students) {
        this.students = students;
    }
    public void setCourses(CourseProgramme[] courses) {
        this.courses = courses;
    }

    //Getters
    public String getModuleName() {
        return moduleName;
    }
    public String getModuleID() {
        return moduleID;
    }
    public Student[] getStudents() {
        return students;
    }
    public CourseProgramme[] getCourses() {
        return courses;
    }
}
