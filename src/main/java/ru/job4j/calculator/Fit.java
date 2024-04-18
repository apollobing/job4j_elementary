package ru.job4j.calculator;

public class Fit {

    private static final short BASE_HEIGHT_MAN = 100;
    private static final short BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    public static double manWeight(short height) {
        double result = (height - BASE_HEIGHT_MAN) * WEIGHT_COEFFICIENT;
        return result;
    }

    public static double womanWeight(short height) {
        double result = (height - BASE_HEIGHT_WOMAN) * WEIGHT_COEFFICIENT;
        return result;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = Fit.manWeight(height);
        System.out.println("Man 187 is " + man);
        double woman = Fit.womanWeight(height);
        System.out.println("Woman 187 is " + woman);
    }
}
