package personal;

public class PC {
    private Motherboard board;
    private Mouse mouse;
    private Keyboard keyboard;

    public Motherboard getBoard() {
        return board;
    }


    public Mouse getMouse() {
        return mouse;
    }


    public Keyboard getKeyboard() {
        return keyboard;
    }

    public PC(Motherboard board, Mouse mouse, Keyboard keyboard) {
        this.board = board;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
}
