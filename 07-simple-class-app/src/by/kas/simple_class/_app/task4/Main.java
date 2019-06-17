package by.kas.simple_class._app.task4;

public class Main {

	public static void main(String[] args) {
		Train tr1 = new Train("Moscow", "12:00", 7);
		Train tr2 = new Train("Minsk", "09:45", 3);
		Train tr3 = new Train("Brest", "00:45", 11);
		Train tr4 = new Train("Adler", "01:45", 8);
		Train tr5 = new Train("Moscow", "10:30", 45);
		
		TrainSchedule Schedule = new TrainSchedule(5);
		
		Schedule.add(tr1);
		Schedule.add(tr2);
		Schedule.add(tr3);
		Schedule.add(tr4);
		Schedule.add(tr5);		

		System.out.println("Выод поезда по номеру");		
		Schedule.printTrain(11);
		System.out.println();		
		
		System.out.println("Рассписание без сортировки");
		Schedule.print();
		System.out.println();
		
		Schedule.sortByNumber();
		System.out.println("Рассписание по номеру поезда");
		Schedule.print();		
		System.out.println();		
		
		Schedule.sortByDestination();
		System.out.println("Рассписание по назначению");
		Schedule.print();		
		System.out.println();		
	}

}
