package by.kas.oop_part_one_app_task2.main;

import java.util.ArrayList;
import java.util.List;

import by.kas.oop_part_one_app_task2.engine.Engine;
import by.kas.oop_part_one_app_task2.engine.EngineType;
import by.kas.oop_part_one_app_task2.wheel.Wheel;
import by.kas.oop_part_one_app_task2.wheel.WheelPosition;
import by.kas.oop_part_one_app_task2.wheel.WheelSeason;
import by.kas.oop_part_one_app_task2.wheel.WheelSize;

public class Car {
	private String mark;
	private CarModel model;
	private Engine engine;
	private ArrayList<Wheel> wheels;
	private final int maxTankVolume = 55;
	private int tankVolume = 0;
	private CarState state = CarState.CAR_IDLE;
	
	public Car ( CarModel model, EngineType type ) {
		engine = new Engine( type );
		wheels = new ArrayList<Wheel>();
		this.model = model;
		setMark( model );
		setWheels();
	}
	
	private void setMark (CarModel model) {
		switch ( model ) {
		case LAGUNA:
			mark = "Renault";
			break;

		case JETTA:
			mark = "Volkswagen";
			break;
			
		case MONDEO:
			mark = "Ford";
			break;			
			
		case CAMRY:
			mark = "Toyota";
			break;
			
		default:
			mark = "Unknown";
			this.model = CarModel.UNKNOWN;		
		}	
	}
	
	private void setWheels () {
		Wheel wheel = new Wheel( WheelSize.R15_195_65, WheelSeason.ALL_SEASON );
		wheel.setPosition(WheelPosition.FRONT_LEFT);
		wheels.add( wheel );
		
		wheel = new Wheel( WheelSize.R15_195_65, WheelSeason.ALL_SEASON );
		wheel.setPosition(WheelPosition.FRONT_RIGHT);
		wheels.add( wheel );
		
		wheel = new Wheel( WheelSize.R15_195_65, WheelSeason.ALL_SEASON );
		wheel.setPosition(WheelPosition.BACK_LEFT);
		wheels.add( wheel );				
		
		wheel = new Wheel( WheelSize.R15_195_65, WheelSeason.ALL_SEASON );
		wheel.setPosition(WheelPosition.BACK_RIGHT);
		wheels.add( wheel );						
	}

	public String getMark() {
		return mark;
	}

	public CarModel getModel() {
		return model;
	}
	
	public int getTankVolume() {
		return tankVolume;
	}
	
	public void setTankVolume( int fuel) {
		tankVolume += fuel;
	}		

	public int getMaxTankVolume() {
		return maxTankVolume;
	}

	public Engine getEngine() {
		return engine;
	}
	
	public List<Wheel> getWheels() {
		return wheels;
	}
	
	public void replaceWheel ( Wheel wheel, int index ) {
		wheels.set(index, wheel);
	}
	
	public CarState getState() {
		return state;
	}

	public void setState(CarState state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Car [mark=" + mark + ", model=" + model + ", engine=" + engine + ", wheels=" + wheels + "]";
	}
}
