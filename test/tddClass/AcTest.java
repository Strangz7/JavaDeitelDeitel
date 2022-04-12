package tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AcTest {

    @Test
    public void testForAc(){
        Ac lg = new Ac ();
        assertNotNull(lg);
    }

    @Test
    public void testThatAcIsOn(){
        Ac lg = new Ac();
        lg.isOn();
        assertTrue(lg.getisOn());
    }
    @Test
     public  void testThatAcIsOff(){
        Ac lg = new Ac();
        lg.isOn();
        lg.isOn();
        assertFalse(lg.getisOn());

    }
    @Test
    public void testForIncreaseTemperature(){
        Ac lg = new Ac();
        lg.isOn();
        lg.increaseTemperature();
        lg.increaseTemperature();
        assertEquals(18,lg.getTemperature());

    }
    @Test
    public void testForDecreaseTemperature(){
        Ac lg = new Ac();
        lg.isOn();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        lg.decreaseTemperature();
        assertEquals(16,lg.getTemperature());
    }
    @Test
    public void testForWhenIIncreaaseTemperatureBeyond30(){
        Ac lg = new Ac();
        lg.isOn();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        lg.increaseTemperature();
        assertEquals(30,lg.getTemperature());
    }


}