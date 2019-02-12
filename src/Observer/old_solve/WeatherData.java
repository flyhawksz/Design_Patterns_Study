package Observer.old_solve;


public class WeatherData {
	private float temperature;
	private float humidity;
	private float pressure;

	private CurrentCondition mCurrentCondition;


	public WeatherData(CurrentCondition currentCondition){
		this.mCurrentCondition = currentCondition;

	}

	public float getTemperature(){
		return temperature;
	}

	public float getHumidity(){
		return humidity;
	}

	public float  getPressure(){
		return pressure;
	}

	public void dataChange(){
//		个人认为在类型内部可以直接用属性变量；外部才使用方法获取属性变量的值
//		mCurrentCondition.update(temperature, humidity, pressure);
		mCurrentCondition.update(getTemperature(), getHumidity(), getPressure());
	}

	public void setWeatherData(float mTemperature, float mHumidity, float mPressure){
		this.temperature = mTemperature;
		this.pressure = mPressure;
		this.humidity = mHumidity;

		dataChange();
	}


}
