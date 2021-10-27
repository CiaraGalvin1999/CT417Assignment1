import java.util.Date;

public class Student {
    private String name;
    private int age;
    private Date dob;
    private long id;
    private String username;
    private CourseProgramme[] courses;
    private Module[] modules;

    //Constructor
    public Student() {

    }
    public Student(String name, int age, Date dob, long id, CourseProgramme[] courses, Module[] modules) {
        this.name = name;
        this.age = age;
        this.dob = dob;
        this.id = id;
        this.username = name.concat(Integer.toString(age));
        this.courses = courses;
        this.modules = modules;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public void setId(long id) {
        this.id = id;
    }
    public void setUsername() {
        //If student name or age hasn't been set, username cannot be created. Must stay as null
        if(name == null || age == 0) {
            username = null;
        }
        //Otherwise, create username by concatenating student name and student age
        else username = name.concat(Integer.toString(age));
    }
    public void setCourses(CourseProgramme[] courses) {
        this.courses = courses;
    }
    public void setModules(Module[] modules) {
        this.modules = modules;
    }

    //Getters
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return age;
    }
    public Date getDob() {
        return dob;
    }
    public long getId() {
        return id;
    }
    public String getUsername() {
        if(age == 0 || name == null) {
            return null;
        }
        else return (name.concat(Integer.toString(age)));
    }
    public CourseProgramme[] getCourses() {
        return courses;
    }

    public Module[] getModules() {
        return modules;
    }
}
