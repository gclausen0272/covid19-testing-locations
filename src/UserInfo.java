/**
 * stores the user information object
 * @author gclau
 *
 */

public class UserInfo {
	private double distance;
	private double userLng;
	private double userLat;
	private TestingLocation closestLocation;

	public UserInfo(double lat, double lng, TestingLocation testingLocation) {
		this.userLng = lng;
		this.userLat = lat;
		this.closestLocation = testingLocation;
	}

	public double getDistance() {
		return distance;
	}

	public void setDistance(double distance) {
		this.distance = distance;
	}

	public double getUserLng() {
		return userLng;
	}

	public void setUserLng(double userLng) {
		this.userLng = userLng;
	}

	public double getUserLat() {
		return userLat;
	}

	public void setUserLat(double userLat) {
		this.userLat = userLat;
	}

	public TestingLocation getClosestLocation() {
		return closestLocation;
	}

	public void setClosestLocation(TestingLocation closestLocation) {
		this.closestLocation = closestLocation;
	}

}
