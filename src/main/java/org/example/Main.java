package org.example;

public class Main {
    public static void main(String[] args) {
        // 1. Metod Testi: shouldWakeUp
        System.out.println("shouldWakeUp test:");
        System.out.println(shouldWakeUp(true, 1));  // true
        System.out.println(shouldWakeUp(false, 2)); // false
        System.out.println(shouldWakeUp(true, 8));  // false
        System.out.println(shouldWakeUp(true, -1)); // false

        // 2. Metod Testi: hasTeen
        System.out.println("\nhasTeen test:");
        System.out.println(hasTeen(9, 99, 19)); // true
        System.out.println(hasTeen(23, 15, 42)); // true
        System.out.println(hasTeen(22, 23, 34)); // false

        // 3. Metod Testi: isCatPlaying
        System.out.println("\nisCatPlaying test:");
        System.out.println(isCatPlaying(true, 10));  // false
        System.out.println(isCatPlaying(false, 36)); // false
        System.out.println(isCatPlaying(false, 30)); // true

        // 4. Metod Testi: area (dikdörtgen)
        System.out.println("\narea (dikdörtgen) test:");
        System.out.println(area(5.0, 4.0));  // 20.0
        System.out.println(area(-1.0, 4.0)); // -1

        // 5. Metod Testi: area (çember)
        System.out.println("\narea (çember) test:");
        System.out.println(area(5.0));       // 78.53975
        System.out.println(area(-1.0));      // -1
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {
        if (clock < 0 || clock > 23) {
            return false;
        }
        return isBarking && (clock < 8 || clock >= 20);
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {
        return (firstAge >= 13 && firstAge <= 19) ||
                (secondAge >= 13 && secondAge <= 19) ||
                (thirdAge >= 13 && thirdAge <= 19);
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {
        if (isSummer) {
            return temp >= 25 && temp <= 45;
        }
        return temp >= 25 && temp <= 35;
    }

    public static double area(double width, double height) {
        if (width < 0 || height < 0) {
            return -1;
        }
        return width * height;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1;
        }
        return radius * radius * Math.PI;
    }
}
