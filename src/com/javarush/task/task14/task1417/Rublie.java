package com.javarush.task.task14.task1417;

public class Rublie extends Money{
    public Rublie(double amount) {
        super(amount);
    }



    @Override
    public String getCurrencyName() {
        return "RUB";
    }
}
