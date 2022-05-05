package tddClass;

import javaAssignment.TeachingStaff;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeachingStaffTest {
    @Test
    public void teachingStaffTest(){
        TeachingStaff teacher = new TeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        teacher.setName("Teol");
        teacher.setSalary(10_000_000);
        assertEquals(10_000_000, teacher.getSalary());
    }
    @Test
    public void staffTest(){
        TeachingStaff teacher = new TeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        teacher.setName("Teol");
        assertEquals("Teol",teacher.getName());
    }
    @Test
    public void departmentTest(){
        TeachingStaff teacher = new TeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        teacher.setDepartment("Science");
        assertEquals("Science", teacher.getDepartment());
    }
    @Test
    public void teachingTest(){
        TeachingStaff teacher = new TeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        teacher.setDuties("Teaching");
        assertEquals("Teaching", teacher.getDuties());
    }
    @Test
    public void phoneNumberTest(){
        TeachingStaff teacher = new TeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        teacher.setPhoneNumber("01-099-08");
        assertEquals("01-099-08", teacher.getPhoneNumber());
    }
    @Test
    public void homeAddresTest(){
        TeachingStaff teacher = new TeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        teacher.setHomeAddress("no 2 hee");
        assertEquals("no 2 hee", teacher.getHomeAddress());
    }
    @Test
    public void gmailTest(){
        TeachingStaff teacher = new TeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        teacher.setGmail("st@dgmai.com");
        assertEquals("st@dgmai.com", teacher.getGmail());
    }
    @Test
    public void uniformTest(){
        TeachingStaff teacher = new TeachingStaff("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk", 10_000_000);
        teacher.setUniform("Reddk");
        assertEquals("Reddk", teacher.getUniform());
    }

}
