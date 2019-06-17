package by.kas.oop_part_one_app_task2.main;

import java.util.List;

import by.kas.oop_part_one_app_task2.engine.Engine;
import by.kas.oop_part_one_app_task2.engine.EngineState;
import by.kas.oop_part_one_app_task2.wheel.Wheel;
import by.kas.oop_part_one_app_task2.wheel.WheelPosition;

public class CarLogic {
	
	public CarCommandResult drive( Car car ) {
		
		if ( car.getState() == CarState.CAR_DRIVE )
			return CarCommandResult.CAR_COMMAND_OK;
		
		if ( car.getTankVolume() == 0 ) 
			return CarCommandResult.CAR_COMMAND_NOT_FUEL;
		
		Engine engine = car.getEngine();
		if ( engine.getState() == EngineState.ENGINE_STOP )
			engine.setState(EngineState.ENGINE_WORK);
		
		car.setState(CarState.CAR_DRIVE);
		return CarCommandResult.CAR_COMMAND_OK;
	}
	
	public int tankFill( Car car, int numberOfLiters ) {
		int fuelLitersReceived = car.getMaxTankVolume() - car.getTankVolume();
		
		if ( fuelLitersReceived > numberOfLiters ) {
			fuelLitersReceived = numberOfLiters;
			car.setTankVolume( car.getTankVolume() + numberOfLiters );
			numberOfLiters = 0;			
		} else {
			car.setTankVolume( car.getTankVolume() + fuelLitersReceived );
			numberOfLiters -= fuelLitersReceived; 
		}
		
		return numberOfLiters;
	}
	
	public void printMark ( Car car) {
		System.out.println( car.getMark() + " " + car.getModel() );
	}
	
	public void replaceWheel ( Car car, Wheel wheel, WheelPosition position ) {
		List<Wheel> carWheels = car.getWheels();
		
		int i = 0;
		for ( Wheel wheelCar : carWheels ) {
			if ( wheelCar.getPosition() == position )
				break;

			i++;
		}
		
		wheel.setPosition( position );
		car.replaceWheel( wheel, i );
	}
}
