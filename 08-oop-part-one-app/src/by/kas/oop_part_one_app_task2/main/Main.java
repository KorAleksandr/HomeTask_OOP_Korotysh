package by.kas.oop_part_one_app_task2.main;

import by.kas.oop_part_one_app_task2.engine.EngineType;
import by.kas.oop_part_one_app_task2.wheel.Wheel;
import by.kas.oop_part_one_app_task2.wheel.WheelPosition;
import by.kas.oop_part_one_app_task2.wheel.WheelSeason;
import by.kas.oop_part_one_app_task2.wheel.WheelSize;

public class Main {

	public static void main(String[] args) {
		Car car = new Car( CarModel.JETTA, EngineType.BENZINE_110hp);
		CarLogic carLogic = new CarLogic();
		
		carLogic.printMark( car );
		
		CarCommandResult resultCommand = carLogic.drive(car);
		
		if ( resultCommand == CarCommandResult.CAR_COMMAND_NOT_FUEL ) {
			System.out.println( "The car needs to be filled" );
		}
		
		carLogic.tankFill(car, 60);
		System.out.println("In the car, " + car.getTankVolume() + " liters of gasoline");
		
		resultCommand = carLogic.drive(car);
		
		if ( resultCommand == CarCommandResult.CAR_COMMAND_OK ) {
			System.out.println( "The car went" );
		}
		
		System.out.println( car.toString() );
		
		Wheel wheel = new Wheel(WheelSize.R15_195_65, WheelSeason.SUMMER);
		carLogic.replaceWheel(car, wheel, WheelPosition.FRONT_LEFT);
		System.out.println( "Wheel replacement" );
		
		System.out.println( car.toString() );		
	}
}
