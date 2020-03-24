/**
 * 
 * @author gclau
 *location utils 
 */

public class LocationUtils {
	public static double getDistance(TestingLocation locationToTest, UserInfo user) {
		System.out.println(Math.sqrt(Math.pow((locationToTest.getLat() - user.getUserLat()), 2.0)
				+ Math.pow((locationToTest.getLng() - user.getUserLng()), 2.0)));
		return Math.sqrt(Math.pow((locationToTest.getLat() - user.getUserLat()), 2.0)
				+ Math.pow((locationToTest.getLng() - user.getUserLng()), 2.0));
	}
	public static TestingLocation reset(double dist, UserInfo user, TestingLocation loc ) {
		if(dist<user.getDistance()) {
			user.setClosestLocation(loc);
			user.setDistance(dist);
		}
		return user.getClosestLocation();
	}
}
