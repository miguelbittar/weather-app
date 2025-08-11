package org.example;
import java.io.File;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter city name: ");
        String city = scanner.nextLine();

        System.out.println("You entered: " + city);

        try {
            String weatherData = getWeatherData(city);
            System.out.println(weatherData);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static String getWeatherData(String city) throws Exception{
        String apiKey = Files.readString(Paths.get("api-key.txt")).trim();
        String encodedCityName = URLEncoder.encode(city, StandardCharsets.UTF_8);
        String apiUrl = "http://api.weatherapi.com/v1/current.json?key=" + apiKey + "&q=" + encodedCityName;

        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(apiUrl)).build();
        HttpClient client = HttpClient.newHttpClient();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }



}