package tddClass;

public class Heart {
    private String name;
    private String firstName;
    private String lastName;
    private String month;
    private String day;
    private int year;
    private int currentYear;

//    public Heart(String firstName, String lastName, String month, String day, int year) {
//    }

    public Heart(String firstName, String lastName, String month, String day, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.month = month;
        this.day = day;
        this.year = year;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName =lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getMonth() {
        return month;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getDay() {
        return day;
    }

    public void birthYear(int year) {

        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setCurrentYear(int currentYear) {
        this.currentYear = currentYear;

    }

    public int getCurrentYear() {
        return currentYear;
    }

    public int getAge() {
        return currentYear - year;
    }

//    public void setName(String firstNam, String lastNam) {
//       String name = firstName + lastName;
//    }

    public String getName() {
        return name;
    }

    public void setName(String firstName , String lastName) {
        name = firstName + " "+ lastName;
    }
}
