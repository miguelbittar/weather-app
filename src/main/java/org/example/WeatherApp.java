package org.example;
import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name: ");
        String city = scanner.nextLine();

        System.out.println("You entered: " + city);
    }
}