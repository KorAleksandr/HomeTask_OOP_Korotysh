package by.kas.oop_part_one_app_task2.wheel;

public class Wheel {
	private WheelSize size;
	private WheelSeason season;
	private WheelPosition position = WheelPosition.NOT_INSTALLED;
	
	public Wheel ( WheelSize size, WheelSeason season ) {
		this.size = size;
		this.season = season;
	}

	public void setPosition( WheelPosition position ) {
		this.position = position;
	}	
	
	public WheelSize getSize() {
		return size;
	}

	public WheelSeason getSeason() {
		return season;
	}

	public WheelPosition getPosition() {
		return position;
	}

	@Override
	public String toString() {
		return "Wheel [size=" + size + ", season=" + season + ", position=" + position + "]";
	}		
}
