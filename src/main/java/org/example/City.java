package org.example;

//Task2
public class City {
    //Поля класса
    private String city;
    private String region;
    private String country;
    private String population;
    private String postCode;
    private String phoneCode;

    //Конструктор класса

    public City(String city, String region, String country, String population, String postCode, String phoneCode) {
        this.city = city;
        this.region = region;
        this.country = country;
        this.population = population;
        this.postCode = postCode;
        this.phoneCode = phoneCode;
    }

    //Методы для получения и занесения данных

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(String phoneCode) {
        this.phoneCode = phoneCode;
    }
}
