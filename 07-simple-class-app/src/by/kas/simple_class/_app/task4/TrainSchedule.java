package by.kas.simple_class._app.task4;

import java.util.Arrays;

public class TrainSchedule {
	private Train[] trains;
	private int[] sortBy;
	private int size = 0;
	private final int TRAIN_EMPTY = Integer.MAX_VALUE;
	
	public TrainSchedule(int size) {
		trains = new Train[size];
		sortBy = new int[size];
		
		for(int i = 0; i < sortBy.length; i++) {
			sortBy[i] = TRAIN_EMPTY;
		}
	}
	
	public boolean add( Train newTrain ) { // добавление поезда в расписание
		boolean result = false;
		
		for(int i = 0; i < sortBy.length; i++) {
			if ( sortBy[i] == TRAIN_EMPTY ) {
				trains[i] = newTrain;
				sortBy[i] = newTrain.getNumber();
				result = true;
				size++;
				break;
			}
		}
		
		return result;
	}
	
	public void sortByNumber( ) { // сортировка по номеру поезда
		Arrays.sort(sortBy);
	}
	
	public void sortByDestination( ) { // сортировка по пункту назначения
		String[] temp = new String[size];
		
		for(int i = 0; i < size; i++) {
			temp[i] = trains[i].getDestination() + trains[i].getDepartureTime();
		}
		
		Arrays.sort(temp);
		
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size; j++) {
				if ( true == temp[i].equals(trains[j].getDestination() + trains[j].getDepartureTime() ) )  {
					sortBy[i] = trains[j].getNumber();
				}				
			}
		}
	}	
	
	public void printTrain(int number) { // печать информации о поезде, по номеру маршрута
		String description = null;
		
		for(int i = 0; i < size; i++) {
			if ( trains[i].getNumber() == number ) {
				description = trains[i].toString();
				break;
			}
		}
		
		if ( description != null ) {
			System.out.println("Train" + description);
		} else {
			System.out.println("Train not exist");
		}
	}
	

	public void print() { // печать расписания
		for(int i = 0; i < sortBy.length; i++) {
			if ( sortBy[i] != TRAIN_EMPTY ) {
				printTrain(sortBy[i]);
			}
		}
	}
		
}
