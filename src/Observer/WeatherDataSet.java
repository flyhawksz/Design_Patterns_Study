package Observer;

import java.util.ArrayList;


public class WeatherDataSet implements Subject {
	private float temperature;
	private float humidity;
	private float pressure;

	private ArrayList<Observer> mObserver;

	public WeatherDataSet(){
		mObserver = new ArrayList<Observer>();
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

	public void setWeatherData(float mTemperature, float mHumidity, float mPressure){
		this.temperature = mTemperature;
		this.pressure = mPressure;
		this.humidity = mHumidity;

		dataChange();
	}

	public void dataChange(){
		notifyObserver();
	}


	@Override
	public void registerObserver(Observer obs){
		mObserver.add(obs);

	}

	@Override
	public void removeObserver(Observer obs){
		if(mObserver.contains(obs)){
			mObserver.remove(obs);
		}

	}

	@Override
	public void notifyObserver(){
//		for(int i = 0, len=mObserver.size();i < len; i++){
//		mObserver.get(i).update(getTemperature(), getPressure(), getHumidity());
//		}
		for(Observer observers : mObserver){
			observers.update(getTemperature(), getPressure(), getHumidity());
		}

	}

}
