package org.example;

public class Fraction {
    //Поля класса
    private int firstNumerator;
    private int firstDenominator;
    private int secondNumerator;
    private int secondDenominator;

    //Конструктор класса

    public Fraction(int firstNumerator, int firstDenominator, int secondNumerator, int secondDenominator) {
        this.firstNumerator = firstNumerator;
        this.firstDenominator = firstDenominator;
        this.secondNumerator = secondNumerator;
        this.secondDenominator = secondDenominator;
    }


    //Методы для получения и внесения данных
    public int getFirstNumerator() {
        return firstNumerator;
    }

    public void setFirstNumerator(int firstNumerator) {
        this.firstNumerator = firstNumerator;
    }

    public int getFirstDenominator() {
        return firstDenominator;
    }

    public void setFirstDenominator(int firstDenominator) {
        this.firstDenominator = firstDenominator;
    }

    public int getSecondNumerator() {
        return secondNumerator;
    }

    public void setSecondNumerator(int secondNumerator) {
        this.secondNumerator = secondNumerator;
    }

    public int getSecondDenominator() {
        return secondDenominator;
    }

    public void setSecondDenominator(int secondDenominator) {
        this.secondDenominator = secondDenominator;
    }

    //Методы для выполнения арфметических операций
    //Сложение
    private StringBuilder sum (int firstNumerator, int firstDenominator, int secondNumerator, int secondDenominator) {
        //Инициализация переменных для хранения промежуточных вычеслений
        int sumOfNumerators = firstNumerator + secondNumerator;
        int sumOfDenominators = firstNumerator + secondDenominator;

        //Формирование результата
        StringBuilder builder = new StringBuilder(String.valueOf(sumOfNumerators));

        return builder.append("/").append(sumOfDenominators);
    }

    //Вычитание
    private StringBuilder minus (int firstNumerator, int firstDenominator, int secondNumerator, int secondDenominator) {
        //Инициализация переменных для хранения промежуточных вычеслений
        int sumOfNumerators = firstNumerator - secondNumerator;
        int sumOfDenominators = firstNumerator - secondDenominator;

        //Формирование результата
        StringBuilder builder = new StringBuilder(String.valueOf(sumOfNumerators));

        return builder.append("/").append(sumOfDenominators);
    }

    //Умножение
    private StringBuilder multiply (int firstNumerator, int firstDenominator, int secondNumerator, int secondDenominator) {
        //Инициализация переменных для хранения промежуточных вычеслений
        int sumOfNumerators = firstNumerator * secondNumerator;
        int sumOfDenominators = firstNumerator * secondDenominator;

        //Формирование результата
        StringBuilder builder = new StringBuilder(String.valueOf(sumOfNumerators));

        return builder.append("/").append(sumOfDenominators);
    }

    //Деление
    private StringBuilder divide (int firstNumerator, int firstDenominator, int secondNumerator, int secondDenominator) {
        //Инициализация переменных для хранения промежуточных вычеслений
        int sumOfNumerators = firstNumerator / secondNumerator;
        int sumOfDenominators = firstNumerator / secondDenominator;

        //Формирование результата
        StringBuilder builder = new StringBuilder(String.valueOf(sumOfNumerators));

        return builder.append("/").append(sumOfDenominators);
    }
}
