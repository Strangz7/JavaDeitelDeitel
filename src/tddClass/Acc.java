package tddClass;

public class Acc {
private boolean isOn;
private int temperature = 16;
    public boolean getIsOn() {
        return isOn;
    }

    public void isOn() {
        isOn = !isOn;
    }

    public int getTemperature() {
       // temperature++;
        return temperature;
    }

    public void increaseTemperature() {
        if (temperature > 30)
        temperature++;
        else {
            temperature = 30;
        }
    }

    public void decreaseTemperature() {
        if (temperature>16)
        temperature --;
    }
}
