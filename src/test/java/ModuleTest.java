import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class ModuleTest {

    //Makes more sense to test setters and getters together as both are used in test either way

    @Test
    @DisplayName("Test that moduleName is correctly updated by setter and correctly returned by getter")
    void testSetAndGetModuleName() {
        //Create test module object
        Module testModule = new Module();

        //Assert that getModuleName returns null
        Assertions.assertNull(testModule.getModuleName());

        //Update module name using setter setModuleName()
        testModule.setModuleName("Software Engineering");

        //Assert that setter correctly updated value and that getter correctly returned value for module name
        Assertions.assertEquals("Software Engineering", testModule.getModuleName());
    }

    @Test
    @DisplayName("Test that moduleId is correctly updated by setter and correctly returned by getter")
    void testSetAndGetModuleId() {
        //Create test module object
        Module testModule = new Module();

        //Assert that getModuleID returns null
        Assertions.assertNull(testModule.getModuleID());

        //Update module name using setter setModuleID()
        testModule.setModuleID("CT417");

        //Assert that setter correctly updated value and that getter correctly returned value for module ID
        Assertions.assertEquals("CT417", testModule.getModuleID());
    }

    @Test
    @DisplayName("Test that array of students is correctly updated by setter and correctly returned by getter")
    void testSetAndGetStudents() {
        //Create test module object
        Module testModule = new Module();

        //Assert that getStudents returns null
        Assertions.assertNull(testModule.getStudents());

        //Create test array of students
        Student[] testStudents = new Student[2];

        //Test courses
        CourseProgramme[] testCourses = new CourseProgramme[2];
        testCourses[0] = new CourseProgramme();
        testCourses[1] = new CourseProgramme();

        //Test modules
        Module[] testModules = new Module[2];
        testModules[0] = new Module();
        testModules[1] = new Module();

        testStudents[0] = new Student("Ciara", 22, new Date(1999, Calendar.APRIL, 18), 12345, testCourses, testModules);
        testStudents[1] = new Student("Andrew", 26, new Date(1995, Calendar.JANUARY, 1), 24689, testCourses, testModules);

        //Update array of students with setter
        testModule.setStudents(testStudents);

        //Assert that setter correctly updated value of array of students
        //and that getter correctly returned array of students
        Assertions.assertEquals(testStudents, testModule.getStudents());
    }

    @Test
    @DisplayName("Test that array of courses is correctly updated by setter and correctly returned by getter")
    void testSetAndGetCourses() {
        //Create test module object
        Module testModule = new Module();

        //Assert that getCourses returns null
        Assertions.assertNull(testModule.getCourses());

        //Create test array of test courses
        CourseProgramme[] testCourses = new CourseProgramme[2];

        //Create test array of students and modules
        Module[] testModules = new Module[2];
        testModules[0] = new Module();
        testModules[1] = new Module();

        Student[] testStudents = new Student[2];
        testStudents[0] = new Student();
        testStudents[1] = new Student();

        //Create test start and end times for academic year
        DateTime testStartDate = new DateTime(2021, 9, 5, 0, 0);
        DateTime testEndDate = new DateTime(2022, 5, 20, 23,59);

        //Add test courses to array of test courses
        testCourses[0] = new CourseProgramme("Computer Science", testModules, testStudents, testStartDate, testEndDate);
        testCourses[1] = new CourseProgramme("Engineering", testModules, testStudents, testStartDate, testEndDate);

        //Update array of courses with setter
        testModule.setCourses(testCourses);

        //Assert that setter correctly updated value of array of courses
        //and that getter correctly returned array of courses
        Assertions.assertEquals(testCourses, testModule.getCourses());
    }



}
