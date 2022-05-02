package tddClass;

import chapter3.Petrol;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetrolPurchaseTest {
    @Test
    public void petrolLocationTest(){
        Petrol petrol = new Petrol("Lagos", "Diesel", 5, 100.00, 10);
        petrol.setName("Lagos");
        assertEquals("Lagos",petrol.getName());
    }
    @Test
    public void petrolTypeTest(){
        Petrol petrol = new Petrol("Lagos", "Diesel", 5, 100.00, 10);
        petrol.setType("Diesel");
        assertEquals("Diesel",petrol.getType());
    }
    @Test
    public void quantityTest(){
        Petrol petrol = new Petrol("Lagos", "Diesel", 5, 100.00, 10);
        petrol.setQuantity(5);
        assertEquals(5,petrol.getQuantity());
    }
    @Test
    public void pricePerLiterTest(){
        Petrol petrol = new Petrol("Lagos", "Diesel", 5, 100.00, 10);
        petrol.setPrice(100.00);
        assertEquals(100.00,petrol.getPrice());
    }
    @Test
    public void percentageTest(){
        Petrol petrol = new Petrol("Lagos", "Diesel", 5, 100.00, 10);
        petrol.setPercentage(10);
        assertEquals(0.1,petrol.getPercentage());
    }
    @Test
    public void purchaseTest(){
        Petrol petrol = new Petrol("Lagos", "Diesel", 5, 100.00, 10);
        petrol.setName("Lagos");
        petrol.setType("Diesel");
        petrol.setQuantity(5);
        petrol.setPrice(100.00);
        petrol.setPercentage(10);
        assertEquals(499.9,petrol.getPurchase());
    }
}
