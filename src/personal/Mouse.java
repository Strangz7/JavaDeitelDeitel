package personal;

public class Mouse {
    private String colour;
    private String name;
    private String size;
    private String button;

    public Mouse(String colour, String name, String size, String button) {
        this.colour = colour;
        this.name = name;
        this.size = size;
        this.button = button;
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

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }
}
