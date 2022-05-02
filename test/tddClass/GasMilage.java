package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GasMilage {
    @Test
    public void  milesDrivenest(){
        Milage milage = new Milage(120, 20);
        milage.setMiles(120);
        assertEquals(120, milage.getMiles());
    }
    @Test
    public  void gallonsUsedTest(){
        Milage milage = new Milage(120, 20);
        milage.setMiles(120);
        milage.setGallons(20);
        assertEquals(20,milage.getGallons());
    }
    @Test
    public void milesPerGalonsTest(){
        Milage milage = new Milage(120, 20);
        milage.setMiles(120);
        milage.setGallons(20);
//        milage.setMilesPerGalons();
        assertEquals(6,milage.getMilesPerGalons());
    }
}
