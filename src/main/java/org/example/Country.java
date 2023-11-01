package org.example;

import java.util.ArrayList;

public class Country {
    //Поля класса
    private String countryName;
    private String continentName;
    private String population;
    private String countryPhoneCode;
    private String capitalName;
    private ArrayList<String> cities;

    //Конструктор класса

    public Country(String countryName, String continentName, String population, String countryPhoneCode, String capitalName, ArrayList<String> cities) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.population = population;
        this.countryPhoneCode = countryPhoneCode;
        this.capitalName = capitalName;
        this.cities = cities;
    }

    //Методы для получения и внесния данных

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    public String getPopulation() {
        return population;
    }

    public void setPopulation(String population) {
        this.population = population;
    }

    public String getCountryPhoneCode() {
        return countryPhoneCode;
    }

    public void setCountryPhoneCode(String countryPhoneCode) {
        this.countryPhoneCode = countryPhoneCode;
    }

    public String getCapitalName() {
        return capitalName;
    }

    public void setCapitalName(String capitalName) {
        this.capitalName = capitalName;
    }

    public ArrayList<String> getCities() {
        return cities;
    }

    public void setCities(ArrayList<String> cities) {
        this.cities = cities;
    }
}
