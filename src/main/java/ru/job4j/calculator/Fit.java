package ru.job4j.calculator;

public class Fit {

    private static final short BASE_HEIGHT_MAN = 100;
    private static final short BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    public static double calculateManWeight(short height) {
        return (height - BASE_HEIGHT_MAN) * WEIGHT_COEFFICIENT;
    }

    public static double calculateWomanWeight(short height) {
        return (height - BASE_HEIGHT_WOMAN) * WEIGHT_COEFFICIENT;
    }

    public static void main(String[] args) {
        short height = 187;
        double manWeight = Fit.calculateManWeight(height);
        System.out.println("Ideal weight for a man with height 187 cm is " + manWeight + " kg");
        double womanWeight = Fit.calculateWomanWeight(height);
        System.out.println("Ideal weight for a woman with height 187 cm is " + womanWeight + " kg");
    }
}
