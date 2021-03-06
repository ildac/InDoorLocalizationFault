package db2.esper.common;

public class SensorParsedData {
	
	private long timestamp = 0;
	private int deviceID = 0;
	private String zoneName = null;
	private String categoryName = null;
	private boolean status = false;
	private double x = 0;
	private double y = 0;
	
	public long getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}
	public int getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(int deviceID) {
		this.deviceID = deviceID;
	}
	public String getZoneName() {
		return zoneName;
	}
	public void setZoneName(String zoneName) {
		this.zoneName = zoneName;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "SensorParsedData [timestamp=" + timestamp + ", deviceID="
				+ deviceID + ", zoneName=" + zoneName + ", categoryName="
				+ categoryName + ", status=" + status + ", x=" + x + ", y=" + y
				+ "]";
	}
	
}
