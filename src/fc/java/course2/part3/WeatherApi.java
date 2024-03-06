package fc.java.course2.part3;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherApi {
    public static void main(String[] args) {
        String apiKey = "";  //가져와야함
        String city = "Seoul";
        String urlString = "https://api.openweathermap.org/data/2.5/weather?q=" + city + "&appid="  +
                apiKey + "&units=metric";

        try{
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setRequestProperty("Accept","application/json");

            int responseCode = connection.getResponseCode(); //200이 정상
            if(responseCode == 200){
                // 스트림(Stream = 입력,출력)의 연결
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while((inputLine=bufferedReader.readLine()) != null){
                    content.append(inputLine);
                }
                bufferedReader.close();
                System.out.println("content = " + content);
                JsonObject weatherData = JsonParser.parseString(content.toString()).getAsJsonObject();
                JsonObject mainData = weatherData.getAsJsonObject("main");
            }else {
//                오류
            }


        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
