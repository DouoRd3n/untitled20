package com.javarush.task.task14.task1417;

public class Hrivnia extends Money {
    public Hrivnia(double amount) {
        super(amount);
    }


    @Override
    public String getCurrencyName() {
        return "UAN";
    }
}
