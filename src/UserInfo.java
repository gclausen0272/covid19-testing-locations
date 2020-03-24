/**
 * stores the user information object
 * @author gclau
 *
 */

public class UserInfo {
	private double distance;
	private double userLng;
	private double userLat;
	private int zip;
	private int zipDist;
	private TestingLocation closestLocation;
	private TestingLocation closestLocationZip;


	public UserInfo(double lat, double lng, TestingLocation testingLocation, TestingLocation first, int zip2) {
		this.userLng = lng;
		this.userLat = lat;
		this.closestLocation = testingLocation;
		this.closestLocationZip = first;
		this.zip = zip2;
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

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getZipDist() {
		return zipDist;
	}

	public void setZipDist(int zipDist) {
		this.zipDist = zipDist;
	}

	public TestingLocation getClosestLocationZip() {
		return closestLocationZip;
	}

	public void setClosestLocationZip(TestingLocation closestLocationZip) {
		this.closestLocationZip = closestLocationZip;
	}

}
