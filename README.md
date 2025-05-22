# Rest-API-Client

*COMPANY*: CODETECH IT SOLUTIONS

*NAME*: JANHAVI KISHOR MADIWALE

*INTERN ID*: CT04DK899

*DOMIAN*: JAVA PROGRAMMING

*DURATION*: 4 WEEKS

*MENTOR*: NEELA SANTOSH

# WeatherApiClient

A simple Java application that fetches and displays the current weather information for a specified city using the OpenWeatherMap API.

## Features

- Connects to the OpenWeatherMap API via HTTP GET request
- Parses JSON response to extract weather description, temperature (in Celsius), and humidity
- Displays weather information in the console

## Prerequisites

- Java Development Kit (JDK) 8 or higher installed
- Internet connection to access the OpenWeatherMap API
- An API key from [OpenWeatherMap](https://openweathermap.org/api) (free to sign up)

## Setup and Usage

1. **Get your API key:**

   Sign up at [OpenWeatherMap](https://openweathermap.org/api) and generate an API key.

2. **Edit the source code:**

   Replace the placeholder `"YOUR API KEY"` in `WeatherApiClient.java` with your actual API key:

   ```java
   String apiKey = "YOUR_API_KEY";
````

3. **Compile the program:**

   ```bash
   javac -cp .:json-20210307.jar WeatherApiClient.java
   ```

   > Note: This program uses the `org.json` library. Download the latest [JSON-java](https://github.com/stleary/JSON-java) JAR and include it in your classpath.

4. **Run the program:**

   ```bash
   java -cp .:json-20210307.jar WeatherApiClient
   ```

5. **Output:**

   The program prints the current weather description, temperature in Celsius, and humidity percentage for the specified city (default: Mumbai).

![Screenshot 2025-05-14 124437](https://github.com/user-attachments/assets/883dde9d-3b80-4814-87c3-be44d0212222)

## Customization

* To change the city, modify the `city` variable in the source code:

  ```java
  String city = "Mumbai";  // Change to any valid city name
  ```

* To change temperature units (e.g., Fahrenheit), update the `units` parameter in the API URL:

  ```java
  String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=imperial";
  ```

## Dependencies

* [org.json](https://github.com/stleary/JSON-java) — JSON parsing library

## Troubleshooting

* **HTTP request failed:** Make sure your API key is valid and you have an active internet connection.
* **JSON parsing errors:** Confirm that the API response structure hasn't changed or your API key is correct.
* **Classpath issues:** Ensure the JSON library JAR is correctly added to your classpath during compilation and runtime.

