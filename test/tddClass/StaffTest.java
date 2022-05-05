package tddClass;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class StaffTest {
    @Test
    public void staffTest(){
        Staff staff = new Staff ("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk");
        staff.setName("Teol");
        assertEquals("Teol",staff.getName());
    }
    @Test
    public void departmentTest(){
        Staff staff = new Staff ("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk");
        staff.setDepartment("Science");
        assertEquals("Science", staff.getDepartment());
    }
    @Test
    public void teachingTest(){
        Staff staff = new Staff ("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk");
        staff.setDuties("Teaching");
        assertEquals("Teaching", staff.getDuties());
    }
    @Test
    public void phoneNumberTest(){
        Staff staff = new Staff ("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk");
        staff.setPhoneNumber("01-099-08");
        assertEquals("01-099-08", staff.getPhoneNumber());
    }
    @Test
    public void homeAddresTest(){
        Staff staff = new Staff ("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk");
        staff.setHomeAddress("no 2 hee");
        assertEquals("no 2 hee", staff.getHomeAddress());
    }
    @Test
    public void gmailTest(){
        Staff staff = new Staff ("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk");
        staff.setGmail("st@dgmai.com");
        assertEquals("st@dgmai.com", staff.getGmail());
    }
    @Test
    public void uniformTest(){
        Staff staff = new Staff ("Teol", "Science", "Teaching", "01-099-08", "no 2 hee", "st@dgmai.com", "Reddk");
        staff.setUniform("Reddk");
        assertEquals("Reddk", staff.getUniform());
    }
}