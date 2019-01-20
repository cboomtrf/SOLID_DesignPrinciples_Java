/**
 * @author CBoom (cboom.trf@gmail.com)
 */
public class WeatherTracker {
    String currentConditions;
    MobileDevice phone;
    Emailer emailer;

    public WeatherTracker() {
        phone = new MobileDevice();
        emailer = new Emailer();
    }

    public void setCurrentConditions(String weatherDescription) {
        this.currentConditions = weatherDescription;
        if (weatherDescription == "rainy") {
            String alert = phone.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
        if (weatherDescription == "sunny") {
            String alert = emailer.generateWeatherAlert(weatherDescription);
            System.out.print(alert);
        }
    }
}
