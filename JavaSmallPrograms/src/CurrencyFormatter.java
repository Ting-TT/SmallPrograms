import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

// original problem: https://www.hackerrank.com/challenges/java-currency-formatter/problem

public class CurrencyFormatter {
    public static void main(String[] args) {
        System.out.println("Please enter your payment amount:");
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(payment);
        String india = NumberFormat.getCurrencyInstance(new Locale("en", "IN")).format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(payment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
