
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.io.*;

/**
 * 
 * @author Grace Clausen
 * 
 *         this program goes through the database parsing into object, then
 *         calculating distance before returning user values
 *
 */
public class LocationFinderMain {

	static final int NUMBER_OUT_OF_REST = 3000;

	// these are globally declared and accessed through out, they are objects that
	// signify the superlatives

	// FIXME change x thats not a variable name
	/**
	 * this creates the file and returns it as a string with all the values in it
	 * 
	 * @param x
	 * @param nameToFind
	 * @param sex
	 * @return a string of the values
	 * @throws FileNotFoundException
	 */
	public static Queue<TestingLocation> fileCreator(String fileName) throws FileNotFoundException {

		// this creates the file that will be used
		File file = new File(fileName);

		// this functions as a gate to end this program
		boolean endThis = true;
		Scanner scnr = new Scanner(file);
		Queue<TestingLocation> output = new LinkedList<TestingLocation>();
		String valueTocheck;

		// temporarily holds a value to check for a tie

		// holds list of unique values

		// while there is still stuff in the file it adds it to the string
		while (endThis) {
			try {

				// sets the value that will be checked
				valueTocheck = scnr.nextLine();
//				System.out.println(valueTocheck);
				if (true) {
					if (valueTocheck.contains("\"")) {
						ArrayList<Integer> indexes = new ArrayList<Integer>();
						for (int i = 0; i < valueTocheck.length(); i++) {
							if (valueTocheck.charAt(i) == '"') {
								indexes.add(i);
							}
						}
						while (indexes.size() > 0) {
							for (int i = indexes.get(0); i < indexes.get(1); i++) {
								if (valueTocheck.charAt(i) == ',') {
									StringBuilder o = new StringBuilder(valueTocheck);
									o.setCharAt(i, ' ');
									valueTocheck = o.toString();
								}
							}
							indexes.remove(0);
							indexes.remove(0);

						}
						if (valueTocheck.charAt(valueTocheck.length() - 1) == ','
								&& valueTocheck.charAt(valueTocheck.length() - 2) == ',') {
							if (valueTocheck.charAt(valueTocheck.length() - 1) == ',') {
								StringBuilder o = new StringBuilder(valueTocheck);
								o.setCharAt(valueTocheck.length() - 2, ' ');
								valueTocheck = o.toString();
							}
							// appends it to the output

						}
					}

					output.add(createCenter(valueTocheck));

				}

//				}

			} catch (NoSuchElementException e) {
				System.out.println("Ed");
				// if it goes out of bounds/ when it gets to the end, the while loop is ended
				endThis = false;
				scnr.close();

			}
		}
		return (output);

	}

	/**
	 * this function takes takes the values in file's raw string data and stores it
	 * as a queue of babies
	 * 
	 * @param nameOfInterest
	 * @param sex
	 * @param collectData2
	 * @return a queue of babies
	 * @throws FileNotFoundException
	 */
	public static Queue<TestingLocation> createTestingCenterQueue(Queue<TestingLocation> collectData2)
			throws FileNotFoundException {

		// creates the naming convention for the text file
		String fileToFind = "yob" + 1981 + ".txt";

		// stores as a string
		return (fileCreator(fileToFind));
	}

	public static TestingLocation createCenter(String tempString) {

		String location_id;
		String isVerified;
		String isHidden;
		String screening;
		String collecting;
		String locationName;
		String street;
		String locality;
		String region;
		String postalCode;
		String lat;
		String lng;
		String type;
		String phone;
		String url;
		String operation;
		String hours;
		String thirdPartyTesting;
		String selectiveTesting;
		String appointment;
		String phoneAppointments;
		String urlAppoint;
		String specCrit;
		String aditionInfo;
		String ready;
		String localAd;

		// creates the naming convention for the text file

		// stores as a string
		// if it has the name of interest we will be doing work on it
		// stores each of the individuals characters as strings using the .split
		// function and casts it as a list
		List<String> tempAry1 = Arrays.asList(tempString.split(",", tempString.length()));
		Queue<String> tempAry = new LinkedList<String>();
		tempAry.addAll(tempAry1);
		location_id = tempAry.remove();
		isVerified = tempAry.remove();
		isHidden = tempAry.remove();
		screening = tempAry.remove();
		collecting = tempAry.remove();
		locationName = tempAry.remove();
		street = tempAry.remove();
		locality = tempAry.remove();
		region = tempAry.remove();
		postalCode = tempAry.remove();
		lat = tempAry.remove();
		lng = tempAry.remove();
		type = tempAry.remove();
		phone = tempAry.remove();
		url = tempAry.remove();
		operation = tempAry.remove();
		hours = tempAry.remove();
		thirdPartyTesting = tempAry.remove();
		selectiveTesting = tempAry.remove();
		appointment = tempAry.remove();
		phoneAppointments = tempAry.remove();
		urlAppoint = tempAry.remove();
		specCrit = tempAry.remove();
		aditionInfo = tempAry.remove();
		ready = tempAry.remove();
		localAd = tempAry.remove();
		TestingLocation lo = new TestingLocation(location_id, isVerified, isHidden, screening, collecting, locationName,
				street, locality, region, postalCode, lat, lng, type, phone, url, operation, hours, thirdPartyTesting,
				selectiveTesting, appointment, phoneAppointments, urlAppoint, specCrit, aditionInfo, ready, localAd);

		// returns the queue
		return lo;
	}

	/**
	 * it's the main method
	 * 
	 * @param args
	 * @throws FileNotFoundException
	 */

	public static void main(String[] args) throws FileNotFoundException {

		Scanner scnnr = new Scanner(System.in);

		// this collects the baby names, i used a queue so that it would return it in
		// chronological order using fifo
		Queue<TestingLocation> collectData2 = new LinkedList<TestingLocation>();
		collectData2 = createTestingCenterQueue(collectData2);
		System.out.println("give lng");
		double lng = scnnr.nextDouble();
		System.out.println("give lat");
		double lat = scnnr.nextDouble();
		System.out.println("zip code?");
		int zip = scnnr.nextInt();
		TestingLocation first =  collectData2.remove();
		
		UserInfo info = new UserInfo(lat, lng, first, first, zip);
		info.setDistance(LocationUtils.getDistance(info.getClosestLocation(), info));
		info.setZipDist(LocationUtils.getZipDistance(info.getClosestLocation(), info));
		int x = collectData2.size();
		
		double tempDist;
		int tempZipDist;
		
		while (collectData2.size() > 0) {
			TestingLocation test = collectData2.remove();
			tempDist = LocationUtils.getDistance(test, info);
			LocationUtils.reset(tempDist, info, test);

			tempZipDist = LocationUtils.getZipDistance(test, info);
			info.setClosestLocationZip(LocationUtils.compareZip(test, info, tempZipDist));
			
			info.setClosestLocation(LocationUtils.reset(tempDist, info, test));
		}
		System.out.println("hello user, the closest testing location to you is " + info.getClosestLocation());
		System.out.println("the closest location by zip code is " +info.getClosestLocationZip());
		System.out.println(x);
		scnnr.close();

	}
}