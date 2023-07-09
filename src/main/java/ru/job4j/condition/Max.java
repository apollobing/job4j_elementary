package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        return first >= second ? first : second;
    }

    public static int max(int first, int second, int third) {
        return max(first, second) >= third ? max(first, second) : third;
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(first, second, third) >= fourth ? max(first, second, third) : fourth;
    }

    public static void main(String[] args) {
        System.out.println(Max.max(41, 41));
        System.out.println(Max.max(3, 2, 1));
        System.out.println(Max.max(1, 99, 13, 8));
        System.out.println(Max.max(5, 5, 5, 5));
    }
}
