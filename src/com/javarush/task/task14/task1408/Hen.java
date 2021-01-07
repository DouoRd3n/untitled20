package com.javarush.task.task14.task1408;

public abstract class Hen {
   public abstract int getCountOfEggsPerMount();

    String getDescription(){
        return "я - курица";
    }
}
class RussianHen extends Hen{

    @Override
    public int getCountOfEggsPerMount() {
        return 35;
    }
    @Override
    String getDescription() {
        String s = super.getDescription() + " Моя страна - " + Country.RUSSIA.toString() + " Я несу " + getCountOfEggsPerMount() + " яиц в месяц." ;
        return s;
    }
}
class UkrainianHen extends Hen{

    @Override
    public int getCountOfEggsPerMount() {
        return 30;
    }


    String getDescription() {
        String s = super.getDescription() + " Моя страна - " + Country.UKRAINE.toString() + " Я несу " + getCountOfEggsPerMount() + " яиц в месяц." ;
        return s;
    }
}
class MoldavanHen extends Hen{

    @Override
    public int getCountOfEggsPerMount() {
        return 25;
    }
    @Override
    String getDescription() {
        String s = super.getDescription() + " Моя страна - " + Country.MOLDOVA.toString() + " Я несу " + getCountOfEggsPerMount() + " яиц в месяц." ;
        return s;
    }
}
class BelarusianHen extends Hen{

    @Override
    public int getCountOfEggsPerMount() {
        return 40;
    }
    @Override
    String getDescription() {
        String s = super.getDescription() + " Моя страна - " + Country.BELARUS.toString() + " Я несу " + getCountOfEggsPerMount() + " яиц в месяц." ;
        return s;
    }
}
