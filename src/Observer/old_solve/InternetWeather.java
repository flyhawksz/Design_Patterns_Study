package Observer.old_solve;

public class InternetWeather {
	public static void main(String[] args){
		CurrentCondition currentCondition;
		WeatherData weatherData;
		currentCondition = new CurrentCondition();
		weatherData = new WeatherData(currentCondition);

		weatherData.setWeatherData(30, 150, 40);
	}
}
