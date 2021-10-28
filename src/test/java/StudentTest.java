import com.google.errorprone.annotations.DoNotMock;
import org.checkerframework.checker.units.qual.C;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

//JUnit test for Student class
public class StudentTest {

    //TEST ALL SETTERS METHODS

    @Test
    @DisplayName("Test that Student setName() class sets student name correctly.")
    void testSetName() {
        //Create test student object
        Student testStudent = new Student();

        //First assert that student name is initially empty
        Assertions.assertNull(testStudent.getName());

        //Set name of student using setter method
        testStudent.setName("Ciara");

        //Assert that name of student has been updated to Ciara
        Assertions.assertEquals("Ciara", testStudent.getName());
    }

    @Test
    @DisplayName("Test that Student setAge() class sets student age correctly.")
    void testSetAge() {
        //Create test student object
        Student testStudent = new Student();

        //Assert that age is initially zero
        Assertions.assertEquals(0, testStudent.getAge());

        //Set student age using setter method
        testStudent.setAge(22);

        //Assert that age of student has been updated to 22
        Assertions.assertEquals(22, testStudent.getAge());
    }

    @Test
    @DisplayName("Test that Student setDob() class sets student date of birth correctly.")
    void testSetDob() {
        //Create test student object
        Student testStudent = new Student();

        //Assert that student dob is initially null
        Assertions.assertNull(testStudent.getDob());

        //Set the date of birth of the student using setter method
        Date testDob = new Date(1999, Calendar.APRIL, 18);
        testStudent.setDob(testDob);

        //Assert that student dob has been updated correctly
        Assertions.assertEquals(testDob, testStudent.getDob());
    }

    @Test
    @DisplayName("Test that Student setID setter method sets student ID correctly")
    void testSetID() {
        //Create test student object
        Student testStudent = new Student();

        //Assert that ID is initially null/zero
        Assertions.assertEquals(0, testStudent.getId());

        //Call setter method for student ID
        testStudent.setId(12345);

        //Assert that student ID is updated correctly
        Assertions.assertEquals(12345, testStudent.getId());
    }

    @Test
    @DisplayName("Tests that setUsername updates student username correctly")
    void testSetUsername() {
        //Create test student object
        Student testStudent = new Student();

        //Assert that username is initially null
        Assertions.assertNull(testStudent.getUsername());

        //Call setter method for student username
        testStudent.setUsername();

        //Assert that username is still null
        Assertions.assertNull(testStudent.getUsername());

        //Update age and name of student
        testStudent.setName("Andrew");
        testStudent.setAge(26);

        //Call setter method for student username
        testStudent.setUsername();

        //Assert that username is updated correctly
        Assertions.assertEquals("Andrew26", testStudent.getUsername());
    }

    @Test
    @DisplayName("Test that Student setCourses() class sets array of courses student is taking correctly.")
    void testSetCourses() {
        //Create test student object
        Student testStudent = new Student();

        //Assert that the array of courses the student is taking is initially empty
        Assertions.assertNull(testStudent.getCourses());

        //Create array of test courses
        CourseProgramme[] testCourses = new CourseProgramme[2];

        //Create test modules
        Module[] testModules = new Module[2];
        testModules[0] = new Module();
        testModules[1] = new Module();

        //Create test students
        Student[] testStudents = new Student[2];
        testStudents[0] = new Student();
        testStudents[1] = new Student();

        //Create test start and end times for academic year
        DateTime testStartDate = new DateTime(2021, 9, 5, 0, 0);
        DateTime testEndDate = new DateTime(2022, 5, 20, 23,59);

        //Add test courses to array of test courses
        testCourses[0] = new CourseProgramme("Computer Science", testModules, testStudents, testStartDate, testEndDate);
        testCourses[1] = new CourseProgramme("Engineering", testModules, testStudents, testStartDate, testEndDate);

        //Set the courses the student is taking using the setter method
        testStudent.setCourses(testCourses);

        //Assert that the courses that the student is taking is updated correctly
        Assertions.assertEquals(testCourses, testStudent.getCourses());
    }

    @Test
    @DisplayName("Test that Student setModules() class correctly sets array of modules student is taking correctly")
    void testSetModules() {
        //Create test student object
        Student testStudent = new Student();

        //Assert that the array of modules the student is taking is initially empty
        Assertions.assertNull(testStudent.getModules());

        //Create an array of test modules
        Module[] testModules = new Module[2];

        //Create array of test students
        Student[] testStudents = new Student[2];
        testStudents[0] = new Student();
        testStudents[1] = new Student();

        //Create array of test courses
        CourseProgramme[] testCourses = new CourseProgramme[2];
        testCourses[0] = new CourseProgramme();
        testCourses[1] = new CourseProgramme();

        testModules[0] = new Module("Software Engineering", "CT417", testStudents, testCourses);
        testModules[1] = new Module("Information Retrieval", "CT4101", testStudents, testCourses);

        //Update array of modules that student is taking using setter method
        testStudent.setModules(testModules);

        //Assert that the array of modules that student is taking is updated correctly
        Assertions.assertEquals(testModules, testStudent.getModules());
    }

    //TEST ALL GETTER METHODS
    @Test
    @DisplayName("Test that getter method for student name returns correct value")
    void testGetName() {
        //Create test student object and set student name
        Student testStudent = new Student();
        testStudent.setName("Ciara");

        //Assert that getter method for student name returns Ciara
        Assertions.assertEquals("Ciara", testStudent.getName());
    }

    @Test
    @DisplayName("Test that getter method for student age returns correct value")
    void testGetAge() {
        //Create test student object and set student age
        Student testStudent = new Student();
        testStudent.setAge(22);

        //Assert that getter method for student age returns 22
        Assertions.assertEquals(22, testStudent.getAge());
    }

    @Test
    @DisplayName("Test that getter method for student age returns correct value")
    void testGetDob() {
        //Create test student object and set student date of birth
        Student testStudent = new Student();

        Date dob = new Date(1999, Calendar.APRIL, 18);
        testStudent.setDob(dob);

        //Assert that getter method for student dob returns dob
        Assertions.assertEquals(dob, testStudent.getDob());
    }

    @Test
    @DisplayName("Test that getter method for student ID returns correct value")
    void testGetId() {
        //Create test student object and set student ID
        Student testStudent = new Student();
        testStudent.setId(246810);

        //Assert that getter method for student age returns 22
        Assertions.assertEquals(246810, testStudent.getId());
    }

    @Test
    @DisplayName("Test that getter method for student username returns null if student age is null")
    void testGetUsernameWhenAgeNull() {
        //Create test student object where name is set but age is not
        Student testStudent = new Student();
        testStudent.setName("Ciara");

        //Assert that getter method for student username returns null when age is null/
        Assertions.assertNull(testStudent.getUsername());
    }

    @Test
    @DisplayName("Test that getter method for student username returns null if student age is null")
    void testGetUsernameWhenNameNull() {
        //Create test student object where age is set but name is not
        Student testStudent = new Student();
        testStudent.setAge(22);

        //Assert that getter method for student username returns null when name is null
        Assertions.assertNull(testStudent.getUsername());
    }

    @Test
    @DisplayName("Test that getter method for student username returns name concatenated with age if student age and name have values")
    void testGetUsernameWhenValid() {
        //Create test student object where name is set but age is not

        //Create an array of test modules
        Module[] testModules = new Module[2];
        testModules[0] = new Module();
        testModules[1] = new Module();

        //Create array of test courses
        CourseProgramme[] testCourses = new CourseProgramme[2];
        testCourses[0] = new CourseProgramme();
        testCourses[1] = new CourseProgramme();

        Student testStudent = new Student("Ciara", 22, new Date(1999, Calendar.APRIL, 18), 12345, testCourses, testModules);

        //Assert that getter method for student username returns Ciara22 as both name and age have values
        Assertions.assertEquals("Ciara22", testStudent.getUsername());
    }

    @Test
    @DisplayName("Test that getter method for student courses returns correct array of courses")
    void testGetCourses() {
        //Create test student object and set array of courses
        Student testStudent = new Student();


        //Create array of test courses
        CourseProgramme[] testCourses = new CourseProgramme[2];

        //Create test modules
        Module[] testModules = new Module[2];
        testModules[0] = new Module();
        testModules[1] = new Module();

        //Create test students
        Student[] testStudents = new Student[2];
        testStudents[0] = new Student();
        testStudents[1] = new Student();

        //Create test start and end times for academic year
        DateTime testStartDate = new DateTime(2021, 9, 5, 0, 0);
        DateTime testEndDate = new DateTime(2022, 5, 20, 23,59);

        //Add test courses to array of test courses
        testCourses[0] = new CourseProgramme("Computer Science", testModules, testStudents, testStartDate, testEndDate);
        testCourses[1] = new CourseProgramme("Engineering", testModules, testStudents, testStartDate, testEndDate);
        testStudent.setCourses(testCourses);

        //Assert that the getter method returns correct array of courses
        Assertions.assertEquals(testCourses, testStudent.getCourses());
    }

    @Test
    @DisplayName("Test that getter method for student modules returns correct array of modules")
    void testGetModules() {
        //Create test student object and set array of modules
        Student testStudent = new Student();

        //Create an array of test modules
        Module[] testModules = new Module[2];

        //Create array of test students
        Student[] testStudents = new Student[2];
        testStudents[0] = new Student();
        testStudents[1] = new Student();

        //Create array of test courses
        CourseProgramme[] testCourses = new CourseProgramme[2];
        testCourses[0] = new CourseProgramme();
        testCourses[1] = new CourseProgramme();

        //Add modules to array
        testModules[0] = new Module("Software Engineering", "CT417", testStudents, testCourses);
        testModules[1] = new Module("Information Retrieval", "CT4101", testStudents, testCourses);

        //Update array of modules that student is taking
        testStudent.setModules(testModules);

        //Assert that the array of modules that is returned by getter method is correct
        Assertions.assertEquals(testModules, testStudent.getModules());
    }


}

