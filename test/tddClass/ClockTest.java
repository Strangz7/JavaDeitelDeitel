package tddClass;

import chapter3.Clock;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClockTest {
    Clock clock;
    @BeforeEach
    public void startWith(){
         clock = new Clock(2, 2, 2);
    }


    @Test
    public void clockTest() {
        clock.setHour(2);
        assertEquals(2, clock.getHour());
    }

    @Test
    public void minuteTest() {
        clock.setMinute(2);
        assertEquals(2, clock.getMinute());
    }

    @Test
    public void secondTest() {
        clock.setSecond(0);
        assertEquals(0, clock.getSecond());
    }

    @Test
    public void testForValueOfHourIsMoreThan23() {
        clock.setHour(27);
        assertEquals(0, clock.getHour());
    }

    @Test
    public void testForValueOfMinuteIsMoreThan59() {
        clock.setMinute(62);
        assertEquals(0, clock.getMinute());
    }

    @Test
    public void testForValueOdSecondIsMoreThan59() {
        clock.setSecond(61);
        assertEquals(0, clock.getSecond());
    }

//    public void displayTime() {
//        clock.setHour(2);
//        clock.setMinute(2);
//        clock.setSecond(2);
//        clock.setDisplay(2, 2, 2);
//        assertEquals(2, 2, 2, clock.getDisplay());
//    }

    @Test
    public void displayTime(){
        clock.setHour(2);
        clock.setMinute(2);
        clock.setSecond(2);
        assertEquals("02:02:02",clock.getDisplayTime());
    }

}
