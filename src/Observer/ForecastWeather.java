package Observer;

public class ForecastWeather implements Observer, DisplayElement {

	private float temperature;
	private float pressure;
	private float humidity;


	@Override
	public void update(float temperature, float pressure, float humidity){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	@Override
	public void display(){
		System.out.println("***ForecastWeather Temperature is :***" + temperature);
		System.out.println("***ForecastWeather Pressure is :***" + pressure);
		System.out.println("***ForecastWeather Humidity is :***" + humidity);
		System.out.println("**************************************");
	}
}