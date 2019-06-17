package by.kas.simple_class._app.task4;

/**
 * @author koral
 *
 */
public class Train {
	private String destination;
	private String departureTime;
	private int number;
	
	public Train ( String destination, String departureTime, int number ) {
		this.destination = destination;
		this.departureTime = departureTime;
		this.number = number;
	}

	public String getDestination() {
		return destination;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public int getNumber() {
		return number;
	}

	@Override
	public String toString() {
		return " number - " + number + ", destination - " + destination + ", departureTime - " + departureTime;
	}
}
