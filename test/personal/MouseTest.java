package personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MouseTest {

    @Test
    public void testForColour() {
        Mouse mice = new Mouse("black","sonic","4 inches","right");
        mice.setColour("black");
        assertEquals("black",mice.getColour());
    }

    @Test
    public void getName() {
        Mouse mice = new Mouse("black","sonic", "4 inches", "right");
        mice.setName("hp");
        assertEquals("hp",mice.getName());
    }
    @Test
    public void getSize() {
        Mouse mice = new Mouse("black","sonic", "4 inches", "right");
        mice.setSize("4 inces");
        assertEquals("4 inches", mice.getSize());
    }
    @Test
    public void getButton() {
        Mouse mice = new Mouse("black","sonic", "4 inches", "right");
        mice.setButton("Left");
        assertEquals("Left", mice.getButton());
    }

}