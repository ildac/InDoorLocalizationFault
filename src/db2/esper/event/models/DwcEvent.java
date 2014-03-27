package db2.esper.event.models;

import java.sql.Timestamp;

public class DwcEvent extends SensorEvent {

	private final String CATEGORY_ID = "door"; //TODO toglimi sono antiestetico!
	private final int RADIUS = 3;	// da capire se � da mettere o meno...
	
	public DwcEvent(Timestamp timestamp, int deviceID, boolean status, double x, double y) {
		super(timestamp, deviceID, status, x, y);
	}
/*
 * 
 * (non-Javadoc)
 * @see db2.esper.event.models.LocationEvent#toString()
 */
	@Override
	public String toString() {
		return "Dwc [CATEGORY_ID=" + CATEGORY_ID + ", RADIUS=" + RADIUS
				+ ", deviceID=" + deviceID + ", status=" + status + ", x=" + x
				+ ", y=" + y + ", timestamp=" + timestamp + "]";
	}
	
	
	
}
