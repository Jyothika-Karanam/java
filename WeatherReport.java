import java.util.Random;
import java.util.Scanner;

public class WeatherReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] conditions = {"Sunny ☀️", "Cloudy ☁️", "Rainy 🌧️", "Stormy ⛈️", "Snowy ❄️"};
        
        System.out.println("=== WEATHER REPORT SIMULATOR ===");
        System.out.print("Enter your city: ");
        String city = sc.nextLine();

        // Generate random weather data
        String condition = conditions[rand.nextInt(conditions.length)];
        int temperature = rand.nextInt(41) - 10; // -10°C to 30°C
        int humidity = rand.nextInt(101); // 0% to 100%
        int windSpeed = rand.nextInt(51); // 0 to 50 km/h

        // Display report
        System.out.println("\n--- Weather Report for " + city + " ---");
        System.out.println("Condition: " + condition);
        System.out.println("Temperature: " + temperature + " °C");
        System.out.println("Humidity: " + humidity + "%");
        System.out.println("Wind Speed: " + windSpeed + " km/h");

        // Advice based on condition
        System.out.print("Advice: ");
        switch (condition) {
            case "Sunny ☀️" -> System.out.println("Wear sunglasses and stay hydrated!");
            case "Cloudy ☁️" -> System.out.println("Might be gloomy, but a nice walk is fine!");
            case "Rainy 🌧️" -> System.out.println("Carry an umbrella 🌂!");
            case "Stormy ⛈️" -> System.out.println("Better stay indoors, stay safe!");
            case "Snowy ❄️" -> System.out.println("Bundle up, it’s cold outside!");
        }
    }
}
