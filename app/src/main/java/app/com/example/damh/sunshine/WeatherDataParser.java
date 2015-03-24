package app.com.example.damh.sunshine;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Daniel on 10/03/2015.
 */
public class WeatherDataParser {

    public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex) throws JSONException{
        double maxTemp = -1;
        try {
            JSONObject jsonObject = new JSONObject(weatherJsonStr);
            JSONArray days = jsonObject.getJSONArray("list");
            JSONObject dayInfo = days.getJSONObject(dayIndex);
            JSONObject temperatureInfo = dayInfo.getJSONObject("temp");
            maxTemp = temperatureInfo.getDouble("max");
        } catch (JSONException je){
            //Oops
        }
        return maxTemp;
    }

}
