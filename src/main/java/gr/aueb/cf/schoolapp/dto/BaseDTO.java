package gr.aueb.cf.schoolapp.dto;

public abstract class BaseDTO {

    private String firstname;
    private String lastname;
    private String vat;
    private String fatherName;
    private String phoneNumber;
    private String email;
    private String street;
    private String streetNum;
    private String zipCode;
    private Integer cityId;

    public BaseDTO(){};

    public BaseDTO(Integer cityId, String email, String fatherName, String firstname, String lastname,
                   String phoneNumber, String street, String streetNum, String vat, String zipCode) {
        this.cityId = cityId;
        this.email = email;
        this.fatherName = fatherName;
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.street = street;
        this.streetNum = streetNum;
        this.vat = vat;
        this.zipCode = zipCode;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getVat() {
        return vat;
    }

    public void setVat(String vat) {
        this.vat = vat;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
