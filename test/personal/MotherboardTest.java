package personal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotherboardTest {

    @Test
    public void getSize() {
        Motherboard motherBoard = new Motherboard("7 inches", "8");
        assertEquals("7 inches", motherBoard.getSize());
    }

    @Test
    void getLength() {
        Motherboard motherBoard = new Motherboard("7 inches", "8");
        assertEquals("8", motherBoard.getLength());
    }
}