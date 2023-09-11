package day5.part3;

public class OwnObjectField {
}

class Student {
    String name;
    int age;
    String mayor;

    //address
    Address address;
}

class Address {
    private String streetName;
    private int streetNumber;
    private String cityName;
    private int postcode;

    public Address(String streetName, int streetNumber, String cityName, int postcode) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.cityName = cityName;
        this.postcode = postcode;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }
}


