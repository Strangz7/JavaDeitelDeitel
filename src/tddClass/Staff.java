package tddClass;

public class Staff {
    private String name;
    private String department;
    private String duties;
    private String phoneNumber;
    private String homeAddress;
    private String gMail;
    private String uniform;
    public Staff(String name, String department, String duties, String phoneNumber, String homeAddress, String gMail, String uniform) {
        this.name = name;
        this.department =department;
        this.duties =duties;
        this.phoneNumber = phoneNumber;
        this.homeAddress = homeAddress;
        this.gMail = gMail;
        this.uniform = uniform;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setDepartment(String department) {
      this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDuties(String duties) {
     this.duties = duties;
    }

    public String getDuties() {
        return duties;
    }

    public void setPhoneNumber(String phoneNumber) {
     this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setHomeAddress(String homeAddress) {
     this.homeAddress = homeAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setGmail(String gMail) {
     this.gMail = gMail;
    }

    public String getGmail() {
        return gMail;
    }

    public void setUniform(String uniform) {
        this.uniform  = uniform;
    }

    public String getUniform() {
        return uniform;
    }
}
