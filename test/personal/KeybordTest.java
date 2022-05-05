package personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KeybordTest {

    @Test
    public void getButtons() {
        Keyboard keybord = new Keyboard("keys","5 inches","purple","Dell");
        assertEquals("keys",keybord.getButtons());
    }

    @Test
    public void getSize() {
        Keyboard keybord = new Keyboard("keys","5 inches","purple","Dell");
        assertEquals("5 inches",keybord.getSize());
    }

    @Test
    public void getColour() {
        Keyboard keybord = new Keyboard("keys","5 inches","purple","Dell");
        assertEquals("purple", keybord.getColour());
    }

    @Test
    public void getName() {
        Keyboard keybord = new Keyboard("keys","5 inches","purple","Dell");
        assertEquals("Dell", keybord.getColour());
    }

    @Test
    public void power() {
        Keyboard keybord = new Keyboard("keys","5 inches","purple","Dell");
        keybord.setOn();
        keybord.setOn();
        keybord.setOn();
        assertTrue(keybord.isOn());
    }
}