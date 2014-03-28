package db2.esper.event.models;

public class FaultEvent extends LocationEvent {
	
	private int sensorID;
	private boolean rise;
	
	public FaultEvent(double x, double y, long timestamp, int sensorID,
			boolean rise) {
		super(x, y, timestamp);
		this.sensorID = sensorID;
		this.rise = rise;
	}

	public int getSensorID() {
		return sensorID;
	}

	public boolean isRise() {
		return rise;
	}

	@Override
	public String toString() {
		return "FaultEvent [sensorID=" + sensorID + ", rise=" + rise + ", Position x="
				+ x + ", Position y=" + y + ", timestamp=" + timestamp + "]";
	}
	
	

}
