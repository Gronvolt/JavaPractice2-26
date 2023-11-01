package org.example;

//Task1
public class Human {
    //Поля класса
    private String name;
    private String lastName;
    private String fathersName;
    private String birthDate;
    private String phoneNumber;
    private String city;
    private String country;
    private String adress;

    //Конструктор класса
    public Human(String name, String lastName, String fathersName, String birthDate, String phoneNumber, String city, String country, String adress) {
        this.name = name;
        this.lastName = lastName;
        this.fathersName = fathersName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.country = country;
        this.adress = adress;
    }

    //Метод для получения данных из класса
    public String getName() {
        return name;
    }

    //Метод для внесения данных в класс
    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFathersName() {
        return fathersName;
    }

    public void setFathersName(String fathersName) {
        this.fathersName = fathersName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
