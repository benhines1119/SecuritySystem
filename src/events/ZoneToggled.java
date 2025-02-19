package events;

public class ZoneToggled extends SecurityEvent {
	private static ZoneToggled instance;
	private static int zoneNumber = 0;

	private ZoneToggled() {

	}

	public static ZoneToggled instance() {
		if (instance == null) {
			instance = new ZoneToggled();
		}
		return instance;
	}

	public int getZoneNumber() {
		return zoneNumber;
	}

	public void setZoneNumber(int zoneNumber) {
		this.zoneNumber = zoneNumber;
	}

}
