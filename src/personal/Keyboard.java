package personal;

public class Keyboard {
    private String buttons;
    private String size;
    private String colour;
    private String name;
    private boolean isOn;

    public Keyboard(String buttons, String size, String colour, String name) {
        this.buttons = buttons;
        this.size = size;
        this.colour = colour;
        this.name = name;
    }

    public String getButtons() {
        return buttons;
    }

    public void setButtons(String buttons) {
        this.buttons = buttons;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
       isOn = !isOn ;
    }

    public void setName(String name) {
        this.name = name;
    }
}
