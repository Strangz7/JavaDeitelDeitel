package tddClass;

public class Milage {

    private int miles;
    private int galons;
    private int milesPerGalons;

    public Milage(int miles, int galons) {
        this.miles = miles;
        this.galons = galons;

    }

    public void setMiles(int miles) {
        this.miles = miles;
    }

    public int getMiles() {
        return miles;
    }

    public void setGallons(int galons) {
        this.galons = galons;
    }

    public int getGallons() {
        return galons;
    }

//    public void setMilesPerGalons() {
//        int milesPerGalons = miles / galons;
//    }

    public int getMilesPerGalons() {
        return  milesPerGalons = miles / galons;
    }
}
