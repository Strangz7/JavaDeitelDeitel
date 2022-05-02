package tddClass;

import chapter3.Car;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void carTest() {
        Car electricCar = new Car("Tesla", "1992", 200_000.00);
        electricCar.setName("Tesla");
        assertEquals("Tesla", electricCar.getName());
    }

    @Test
    public void yearTest() {
        Car electricCar = new Car("Tesla", "1992", 200_000.00);
        electricCar.setName("Tesla");
        electricCar.setYear("1992");
        assertEquals("1992", electricCar.getYear());
    }

    @Test
    public void priceTest() {
        Car electricCar = new Car("Tesla", "1992", 200_000.00);
        electricCar.setName("Tesla");
        electricCar.setYear("1992");
        electricCar.setPrice(200_000.00);
        assertEquals(200_000.00, electricCar.getPrice());
    }

    @Test
    public void negativePriceTest(){
        Car electricCar = new Car("Tesla", "1992", 200_000.00);
        electricCar.setName("Tesla");
        electricCar.setYear("1992");
        electricCar.setPrice(-200_000.00);
        assertEquals(0,electricCar.getPrice());
    }
    @Test
    public void doubleObject(){
        Car electricCar = new Car("Tesla", "1992", 200_000.00);
        electricCar.setPrice(200_000.00);
        assertEquals(200_000.00,electricCar.getPrice());
        Car car1 = new Car("Benz", "1899", 100_000.00);
        car1.setPrice(100_000.00);
        assertEquals(100_000.00,car1.getPrice());
    }
    @Test
    public void discountTest(){
        Car electricCar = new Car("Tesla", "1992", 200_000.00);
        electricCar.setPrice(200_000.00);
        electricCar.setDiscount(5);
        assertEquals(10_000.00,electricCar.getDiscount());
        Car car1 = new Car("Benz", "1899", 100_000.00);
        car1.setPrice(100_000.00);
        car1.setDiscount(7);
        assertEquals(70_000.00,car1.getDiscount());
    }
}