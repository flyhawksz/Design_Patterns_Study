package Observer.old_solve;

public class CurrentCondition {
	private float temperature;
	private float pressure;
	private float humidity;



	public CurrentCondition(){

	}

	public void update(float temperature, float pressure, float humidity){
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	public void display(){
		System.out.println("*** Temperature is :***" + temperature);
		System.out.println("*** Pressure is :***" + pressure);
		System.out.println("*** Humidity is :***" + humidity);
	}
}
