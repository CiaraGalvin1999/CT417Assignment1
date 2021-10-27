import org.checkerframework.checker.units.qual.C;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Calendar;
import java.util.Date;

public class CourseProgrammeTest {

    @Test
    @DisplayName("Test that courseName is correctly updated by setter and correctly returned by getter")
    void testSetAndGetCourseName() {
        //Create test CourseProgramme object
        CourseProgramme testCourse = new CourseProgramme();

        //Assert that getter returns null for course name
        Assertions.assertNull(testCourse.getCourseName());

        //Update courseName using setter
        testCourse.setCourseName("Computer Science");

        //Assert that setter correctly updated course name
        //and that getter correctly returns updated course name
        Assertions.assertEquals("Computer Science", testCourse.getCourseName());
    }

    @Test
    @DisplayName("Test that array of modules is correctly updated by setter and correctly returned by getter")
    void testSetAndGetModules() {
        //Create test CourseProgramme object
        CourseProgramme testCourse = new CourseProgramme();

        //Assert that getter returns null for array of modules
        Assertions.assertNull(testCourse.getModules());

        //Use setter to update array of modules for course
        //Must first create array of modules
        Module[] testModules = new Module[2];

        //Create array of test students
        Student[] testStudents = new Student[2];
        testStudents[0] = new Student();
        testStudents[1] = new Student();

        //Create array of test courses
        CourseProgramme[] testCourses = new CourseProgramme[2];
        testCourses[0] = new CourseProgramme();
        testCourses[1] = new CourseProgramme();

        //Add modules to array of modules
        testModules[0] = new Module("Software Engineering", "CT417", testStudents, testCourses);
        testModules[1] = new Module("Information Retrieval", "CT4101", testStudents, testCourses);

        //Set array of modules using setter
        testCourse.setModules(testModules);

        //Assert that modules for course have been correctly updated by setter
        //and that correct value is returned by getter
        Assertions.assertEquals(testModules, testCourse.getModules());
    }

    @Test
    @DisplayName("Test that array of students is correctly updated by setter and correctly returned by getter")
    void testSetAndGetStudents() {
        //Create test CourseProgramme object
        CourseProgramme testCourse = new CourseProgramme();

        //Assert that getter initially returns null for array of students
        Assertions.assertNull(testCourse.getStudents());

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

        //Set array of students for course using setter
        testCourse.setStudents(testStudents);

        //Assert that setter correctly updates array of students taking course
        //and that getter returns correct array of students taking course
        Assertions.assertEquals(testStudents, testCourse.getStudents());
    }

    @Test
    @DisplayName("Test that start date is correctly updated by setter and correctly returned by getter")
    void testSetAndGetStartDate() {
        //Create test CourseProgramme object
        CourseProgramme testCourse = new CourseProgramme();

        //Assert that getter initially returns null for start date
        Assertions.assertNull(testCourse.getStartDate());

        //Update start date with setter
        DateTime testStartDate = new DateTime(2021, 9, 5, 0, 0);
        testCourse.setStartDate(testStartDate);

        //Assert that start date is correctly updated by setter
        //and that start date is correctly returned by getter
        Assertions.assertEquals(testStartDate, testCourse.getStartDate());
    }

    @Test
    @DisplayName("Test that end date is correctly updated by setter and correctly returned by getter")
    void testSetAndGetEndDate() {
        //Create test CourseProgramme object
        CourseProgramme testCourse = new CourseProgramme();

        //Assert that getter initially returns null for end date
        Assertions.assertNull(testCourse.getEndDate());

        //Update end date with setter
        DateTime testEndDate = new DateTime(2022, 5, 20, 23,59);
        testCourse.setEndDate(testEndDate);

        //Assert that end date is correctly updated by setter
        //and that end date is correctly returned by getter
        Assertions.assertEquals(testEndDate, testCourse.getEndDate());
    }
}
