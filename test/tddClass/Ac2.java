package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Ac2 {
    @Test
    public void testThatAcCanBeCreated(){
        Acc ac = new Acc();
        assertNotNull(ac);
    }
    @Test
    public void testThatAcCanBeTurnedOn(){
        Acc ac = new Acc();
        ac.isOn();
        assertTrue(ac.getIsOn());
    }
    @Test
    public void  testThatAcCanBeTurnedOff(){
        Acc ac = new Acc();
        ac.isOn();
        ac.isOn();
        assertFalse(ac.getIsOn());
    }
    @Test
    public void testToIncreaseTemperaure(){
        Acc ac = new Acc();
        ac.isOn();
        ac.increaseTemperature();
        assertEquals(16,ac.getTemperature());
    }
    @Test
    public void testToDecreaseTemperature(){
        Acc ac = new Acc();
        ac.isOn();
        ac.increaseTemperature();
        ac.increaseTemperature();
        ac.decreaseTemperature();
        assertEquals(17,ac.getTemperature());
    }
//    @Test
//    public void testForTemperatureAbove30(){
//        Acc ac = new Acc();
//        ac.isOn();
//        ac.increaseTemperature();
//        assertEquals(30,ac.getTemperature());
//    }
//    @Test
//    public void testForTemperatureBelow30(){
//        Acc ac = new Acc();
//        ac.isOn();
//        ac.increaseTemperature();
//        ac.decreaseTemperature();
//        ac.decreaseTemperature();
//        assertEquals(16,ac.getTemperature());
    //}
}
