package tddClass;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TargetHeartRateCalculator {

//     Heart heart;
//    @BeforeEach
//    public  void  startWith(){
//        heart = new TargetHeartRateCalculator("Adebayo", "Steven", "February", "Tuesday", 2002);
//    }

    @Test
    public void name(){
        Heart heart = new Heart("Adebayo", "Steven", "February", "Tuesday", 2002);
        heart.setName("Adebayo", "Steven");
        assertEquals("Adebayo Steven", heart.getName());

    }
    @Test
    public void  heartRateTst(){
        Heart heart = new Heart("Adebayo", "Steven", "February", "Tuesday", 2002);
        heart.setFirstName("Adebayo");
        assertEquals("Adebayo", heart.getFirstName());
    }
    @Test
    public  void lastNameTest(){
        Heart heart = new Heart("Adebayo", "Steven", "February", "Tuesday", 2002);
        heart.setFirstName("Adebayo");
        heart.setLastName("Steven");
        assertEquals("Steven", heart.getLastName());
    }
    @Test
    public  void monthTest(){
        Heart heart = new Heart("Adebayo", "Steven", "February", "Tuesday", 2002);
        heart.setFirstName("Adebayo");
        heart.setLastName("Steven");
        heart.setMonth("February");
        assertEquals("February", heart.getMonth());
    }
    @Test
    public void dayTest(){
        Heart heart = new Heart("Adebayo", "Steven", "February", "Tuesday", 2002);
        heart.setFirstName("Adebayo");
        heart.setLastName("Steven");
        heart.setMonth("February");
        heart.setDay("Tuesday");
        assertEquals("Tuesday", heart.getDay());
    }
    @Test
    public void yearTest(){
        Heart heart = new Heart("Adebayo", "Steven", "February", "Tuesday", 2002);
        heart.setFirstName("Adebayo");
        heart.setLastName("Steven");
        heart.setMonth("February");
        heart.setDay("Tuesday");
        heart.birthYear(2002);
        assertEquals(2002, heart.getYear());
    }
    @Test
    public void currentYearTest(){
        Heart heart = new Heart("Adebayo", "Steven", "February", "Tuesday", 2002);
        heart.setFirstName("Adebayo");
        heart.setLastName("Steven");
        heart.setMonth("February");
        heart.setDay("Tuesday");
        heart.birthYear(2002);
        heart.setCurrentYear(2022);
        assertEquals(2022,heart.getCurrentYear());

    }
    @Test
    public void ageTest(){
        Heart heart = new Heart("Adebayo", "Steven", "February", "Tuesday", 2002);
        heart.setFirstName("Adebayo");
        heart.setLastName("Steven");
        heart.setMonth("February");
        heart.setDay("Tuesday");
        heart.birthYear(2002);
        heart.setCurrentYear(2022);
//        heart.setAge(20);
        assertEquals(20, heart.getAge());
    }



}