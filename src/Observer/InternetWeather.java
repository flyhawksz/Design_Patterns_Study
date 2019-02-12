package Observer;


public class InternetWeather {
	public static void main(String[] args){
		CurrentConditions mCurrentConditions;
		ForecastWeather mForecastWeather;
		WeatherDataSet mWeatherDataSet;

		mCurrentConditions = new CurrentConditions();
		mForecastWeather = new ForecastWeather();
		mWeatherDataSet = new WeatherDataSet();

		mWeatherDataSet.registerObserver(mCurrentConditions);
		mWeatherDataSet.registerObserver(mForecastWeather);

		mWeatherDataSet.setWeatherData(30,150, 40);

	}

}
