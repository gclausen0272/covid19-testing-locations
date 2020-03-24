/**
 * 
 * @author gclau
 *location utils 
 */

public class LocationUtils {
	public static double getDistance(TestingLocation locationToTest, UserInfo user) {
//		System.out.println(Math.sqrt(Math.pow((locationToTest.getLat() - user.getUserLat()), 2.0)
//				+ Math.pow((locationToTest.getLng() - user.getUserLng()), 2.0)));
		return Math.sqrt(Math.pow((locationToTest.getLat() - user.getUserLat()), 2.0)
				+ Math.pow((locationToTest.getLng() - user.getUserLng()), 2.0));
	}
	public static int getZipDistance(TestingLocation locationToTest, UserInfo user) {
		try {
		return Math.abs(Integer.parseInt(locationToTest.getPostalCode())-user.getZip());
		}
		catch(Exception e) {
			return user.getZipDist();
		}
	}
	public static TestingLocation reset(double dist, UserInfo user, TestingLocation loc ) {
		if(dist<user.getDistance()) {
			user.setClosestLocation(loc);
			user.setDistance(dist);
		}
		return user.getClosestLocation();
	}
	//Math.abs(Integer.parseInt(locationToTest.getPostalCode())-user.getZip())
	public static TestingLocation compareZip(TestingLocation locationToTest, UserInfo user, int dist) {
		if(dist<user.getZipDist()) {
			user.setClosestLocationZip(locationToTest);
			user.setZipDist(dist);
		}
		return user.getClosestLocationZip();
	}
}
