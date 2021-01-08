package com.javarush.task.task14.task1410;

/* 
Дегустация вин
*/

public class Solution {
    public static void main(String[] args) {
        getDeliciousDrink().taste();
        System.out.println(getWine().getHolideyName());
        System.out.println(getBubblyWine().getHolideyName());
        System.out.println(getWine().getHolideyName());
    }

    public static Drink getDeliciousDrink() {
return new Wine();
    }

    public static Wine getWine() {
return new Wine();
    }

    public static Wine getBubblyWine() {
return new BubblyWine();
    }
}
