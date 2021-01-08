package com.javarush.task.task14.task1409;

public class SuspensionBridge implements Bridge{
    private final int carsCount=7;

    @Override
    public int getCarsCount() {
        return carsCount;
    }
}
