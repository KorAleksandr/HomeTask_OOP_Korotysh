package by.kas.oop_part_one_app_task2.engine;

public class Engine {
	private EngineType type;
	private int power = 0;
	private String typeFuel = "Unknown";
	private EngineState state = EngineState.ENGINE_STOP;
	
	public Engine ( EngineType type ) {
		this.type = type;
		
		switch ( type ) {
		case BENZINE_90hp:
			power = 90;
			
		case BENZINE_110hp:
			power = 110;
			
		case BENZINE_TSI_150hp:
			power = 150;
			typeFuel = "Benzine";
			break;
			
		case DIESEL_115hp:
			typeFuel = "Diesel";
			power = 115;
			break;
		
		default:
			this.type = EngineType.UNKNOWN;
		}
	}

	public EngineType getType() {
		return type;
	}

	public int getPower() {
		return power;
	}
	
	public String getTypeFuel() {
		return typeFuel;
	}
	
	public EngineState getState() {
		return state;
	}

	public void setState(EngineState state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Engine [type=" + type + ", power=" + power + "]";
	}
}
