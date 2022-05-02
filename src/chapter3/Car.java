package chapter3;

public class Car {
    private String car;
    private String year;
    private double price;

    public Car(String car, String year, double price) {

    }

    public void setName(String car) {
        this.car = car;

    }

    public String getName() {
        return car;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setPrice(double price) {
        if (price > 0)
            this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setDiscount(double discount) {
        discount = 0.05 * 200_000.00;

    }

    public double getDiscount() {
        double discount =  discount = 0.05 * 200_000.00;;
        return discount;
    }
}
