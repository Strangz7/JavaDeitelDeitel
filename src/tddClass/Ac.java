package tddClass;

public class Ac {
    private boolean isOn;
    private int temperature = 16;




    public void isOn() {
        isOn = !isOn;
    }

    public boolean getisOn() {
        return isOn;
    }

    public void increaseTemperature() {
        if(temperature < 30)
        temperature++;
    }

    public int getTemperature() {
        return temperature;
    }

    public void decreaseTemperature() {
        if (temperature > 16)
        temperature--;
    }
}
