# Weather App

A simple Java console application that retrieves real-time weather information for any city worldwide.

## Features

- Fetch current weather data by city name
- Display detailed weather information including:
  - Current temperature and feels-like temperature
  - Weather conditions
  - Humidity levels
  - Wind speed
  - Atmospheric pressure
  - Last updated timestamp
- Error handling for invalid city names

## Technologies Used

- **Java 11+** (Native HTTP Client)
- **org.json** - JSON data manipulation
- **WeatherAPI** - External weather data service

## Prerequisites

- JDK 11 or higher
- org.json library (add to classpath)
- WeatherAPI API key

## Setup

1. Sign up at [WeatherAPI.com](https://www.weatherapi.com/) to get a free API key
2. Create an `api-key.txt` file in the project root directory
3. Add your API key to the file (key only, no extra line breaks)

## How to Run

1. Compile the project:
```bash
javac -cp ".:org.json.jar" org/example/WeatherApp.java
```

2. Run the application:
```bash
java -cp ".:org.json.jar" org.example.WeatherApp
```

3. Enter the city name when prompted

## Usage Example

```
Enter city name: São Paulo
You entered: São Paulo

Weather Information for São Paulo, Brazil
Last Updated: 2025-08-11 14:30
Current Temperature: 22.5°C
Feels Like: 24.1°C
Weather Condition: Partly cloudy
Humidity: 65%
Wind Speed: 12.0 km/h
Atmospheric Pressure: 1015.2 mb
```

## Project Structure

```
weather-app/
├── src/
│   └── org/
│       └── example/
│           └── WeatherApp.java
├── api-key.txt
└── README.md
```

## Error Handling
The application handles:
- Invalid city names (error code 1006)  
- General exceptions with error messages

## Limitations

- Requires internet connection
- Limited by WeatherAPI free tier quotas
- Displays current weather only (no forecasts)

