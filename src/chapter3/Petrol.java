package chapter3;

public class Petrol {
    private String stationLocation;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLiter;
    private double percentage;

    public Petrol(String stationLocation, String typeOfPetrol, int quantity, double pricePerLiter, int percentage) {
        this.stationLocation = stationLocation;


    }

    public void setName(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getName() {
        return stationLocation;
    }

    public void setType(String diesel) {
        typeOfPetrol = diesel;

    }

    public String getType() {
        return typeOfPetrol;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        pricePerLiter = price;
    }

    public double getPrice() {
        return pricePerLiter;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage/100;
    }

    public double getPercentage() {
        return percentage;
    }

    public double getPurchase() {


        return (quantity*pricePerLiter) - percentage;
    }
}
