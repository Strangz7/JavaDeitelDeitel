package tddClass;

import javaAssignment.NonTeachingStaff;
import javaAssignment.TeachingStaff;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonTeachingStaffTest {
    NonTeachingStaff nonTeachingStaff ;
    @BeforeEach
    public void startWith(){
        nonTeachingStaff = new NonTeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
    }
    @Test
    public void nonTeachingStaffSalaryTest(){
        nonTeachingStaff.setName("Shade");
        nonTeachingStaff.setSalary(5_000_000);
        assertEquals(5_000_000, nonTeachingStaff.getSalary());
    }
    @Test
    public void staffTest(){
        nonTeachingStaff.setName("shade");
        assertEquals("shade",nonTeachingStaff.getName());
    }
    @Test
    public void departmentTest(){
        nonTeachingStaff.setDepartment("Cleaning");
        assertEquals("Cleaning", nonTeachingStaff.getDepartment());
    }
    @Test
    public void teachingTest(){
        NonTeachingStaff nonTeachingStaff = new NonTeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        nonTeachingStaff.setDuties("Teaching");
        assertEquals("Teaching", nonTeachingStaff.getDuties());
    }
    @Test
    public void phoneNumberTest(){
        NonTeachingStaff nonTeachingStaff = new NonTeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        nonTeachingStaff.setPhoneNumber("01-099-08");
        assertEquals("01-099-08", nonTeachingStaff.getPhoneNumber());
    }
    @Test
    public void homeAddresTest(){
        NonTeachingStaff nonTeachingStaff = new NonTeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        nonTeachingStaff.setHomeAddress("no 9 hee");
        assertEquals("no 9 hee", nonTeachingStaff.getHomeAddress());
    }
    @Test
    public void gmailTest(){
        NonTeachingStaff nonTeachingStaff = new NonTeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        nonTeachingStaff.setGmail("stdv@dgmai.com");
        assertEquals("stdv@dgmai.com", nonTeachingStaff.getGmail());
    }
    @Test
    public void uniformTest(){
        NonTeachingStaff nonTeachingStaff = new NonTeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        nonTeachingStaff.setUniform("Bklh");
        assertEquals("Bklh", nonTeachingStaff.getUniform());
    }

}
