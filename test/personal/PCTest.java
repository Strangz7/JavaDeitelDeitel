package personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PCTest {

    @Test
    public void getBoard() {
        Motherboard board = new Motherboard("7 inches", "8");
        Mouse mouse = new Mouse("black", "Dell", "2 kg","Right");
        Keyboard keybord = new Keyboard("keys","5 inches","purple","Dell");
        PC pc = new PC(board, mouse,keybord);
        pc.getBoard().setLength("22");
        assertEquals("22",pc.getBoard().getLength());
    }
    @Test
    public void getMouse() {
        Motherboard board = new Motherboard("7 inches", "8");
        Mouse mouse = new Mouse("black", "Dell", "2 kg","Right");
        Keyboard keybord = new Keyboard("keys","5 inches","purple","Dell");
        PC pc = new PC(board, mouse,keybord);
        pc.getMouse().setButton("Right");
        assertEquals("Right",pc.getMouse().getButton());
        pc.getMouse().setSize("2 kg");
        assertEquals("2 kg",pc.getMouse().getSize());
    }

    @Test
    public void getKeybord() {
          Motherboard board = new Motherboard("7 inches", "8");
          Mouse mouse = new Mouse("black", "Dell", "2 kg","Right");
          Keyboard keybord = new Keyboard("keys","5 inches","purple","Dell");
          PC pc = new PC(board, mouse,keybord);
          pc.getKeyboard().setOn();
          assertEquals(true,pc.getKeyboard().isOn());
          pc.getKeyboard().getColour();
          assertEquals("purple",pc.getKeyboard().getColour());
          pc.getKeyboard().getButtons();
          assertEquals("keys", pc.getKeyboard().getButtons());

    }
}