import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

public class WeatherApiClient {

    public static void main(String[] args) {
        String apiKey = "YOUR API KEY"; 
        String city = "Mumbai";
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid=" + apiKey + "&units=metric";

        try {
            URL url = new URL(apiUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("GET");
            int responseCode = connection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                // Parse and display the JSON response
                JSONObject json = new JSONObject(response.toString());
                String weather = json.getJSONArray("weather").getJSONObject(0).getString("description");
                double temp = json.getJSONObject("main").getDouble("temp");
                int humidity = json.getJSONObject("main").getInt("humidity");

                System.out.println("Weather in " + city + ":");
                System.out.println("Description: " + weather);
                System.out.println("Temperature: " + temp + "°C");
                System.out.println("Humidity: " + humidity + "%");

            } else {
                System.out.println("GET request failed. HTTP Code: " + responseCode);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
