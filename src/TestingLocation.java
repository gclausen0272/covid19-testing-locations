

/**
 * 
 * @author grace Clausen
 * 
 *         creates and stores object info
 */

///FIXME if theres no one named the name 
public class TestingLocation {


	private String location_id;
	private String isHidden;
	private String isVerified;
	private String locationName;
	private String streetAddress;
	private String localityAddress;
	private String region;
	private String postalCode;
	private String lng;
	private String lat;
	private String phoneMain;
	private String appointmentPhone;
	private String contactUrlScreening;
	private String contactUrlSelfScreen;
	private String contactUrlTelemed;
	private String servType;
	private String hours;
	private String requestTest;
	private String thirdPartyTest;
	private String collecting;
	private String specCrit;
	private String testingCriteria;
	private String additionalInfo;
	private String dataSource;
	private String localAd;
	private String specificCriteria;
	private String appointments;

	// default constructor
	/**
	 * this is the default constructor, automatically sets the values
	 */
	/**
	 * constructor, sets the varibles in the object to the parameters accordingly
	 * 
	 * @param name
	 * @param rank
	 * @param year
	 * @param sex
	 * @param number
	 */
//	location_id,
//	is_hidden,
	// is_verified,
//	location_name,
//	location_address_street,
//	location_address_locality,
//	location_address_region,
//	location_address_postal_code,
//	location_longitude,
	// location_latitude,
//	location_contact_phone_main,
//	location_contact_phone_appointments,
//	location_contact_url_main,
//	location_contact_url_appointments,
//	location_contact_url_self_screening,
//	location_contact_url_telemedicine,
//	location_place_of_service_type,
//	location_hours_of_operation,
//	is_location_authorized_to_request_testing,
//	is_location_accepting_third_party_orders_for_testing,
//	is_location_collecting_specimens,
//	is_location_only_testing_patients_that_meet_criteria,
//	is_location_by_appointment_only,
	// location_specific_testing_criteria,
//	additional_information_for_patients,
//	data_source
	public TestingLocation(String location_id, String isHidden, String isVerified, String locationName,
			String streetAddress, String localityAddress, String region, String postalCode, String lng, String lat,
			String phoneMain, String appointmentPhone, String contactUrlScreening, String contactUrlSelfScreen,
			String contactUrlTelemed, String servType, String hours, String requestTest, String thirdPartyTest,
			String collecting, String specCrit, String testingCriteria, String ready, String localAd,
			String additionalInfo, String dataSource) {
		this.setLocation_id(location_id);
		this.setIsHidden(isHidden);
		this.setIsVerified(isVerified);
		this.locationName = locationName;
		this.setStreetAddress(streetAddress);
		this.setLocalityAddress(localityAddress);
		this.setRegion(region);
		this.setPostalCode(postalCode);
		this.lng = lng;
		this.lat = lat;
		this.setPhoneMain(phoneMain);
		this.setAppointmentPhone(appointmentPhone);
		this.setContactUrlScreening(contactUrlScreening);
		this.setContactUrlSelfScreen(contactUrlSelfScreen);
		this.setContactUrlTelemed(contactUrlTelemed);
		this.setServType(servType);
		this.setHours(hours);
		this.setRequestTest(requestTest);
		this.setThirdPartyTest(thirdPartyTest);
		this.setCollecting(collecting);
		this.setSpecCrit(specCrit);
		this.setTestingCriteria(testingCriteria);
		this.setAppointments(ready);
		this.setSpecificCriteria(localAd);
		this.additionalInfo = additionalInfo;
		this.setDataSource(dataSource);

	}

	public String toString() {
		return (this.locationName + " " + lat + " lat " + lng + " lng" + " test" + additionalInfo);
	}

	public void setLat(String lat) {
		this.lat = lat;
	}
	public double getLat() {
		return Double.parseDouble(this.lat);
	}
	public void setLng(String lng) {
		this.lng= lng;
	}
	public double getLng() {
		return Double.parseDouble(this.lng);
	}
	public String locationName() {
		return locationName;
	}

	public void locationName(String locationName) {
		this.locationName = locationName;
	}
	public String getLocation_id() {
		return location_id;
	}

	public void setLocation_id(String location_id) {
		this.location_id = location_id;
	}

	public String getIsHidden() {
		return isHidden;
	}

	public void setIsHidden(String isHidden) {
		this.isHidden = isHidden;
	}

	public String getIsVerified() {
		return isVerified;
	}

	public void setIsVerified(String isVerified) {
		this.isVerified = isVerified;
	}

	public String getStreetAddress() {
		return streetAddress;
	}

	public void setStreetAddress(String streetAddress) {
		this.streetAddress = streetAddress;
	}

	public String getLocalityAddress() {
		return localityAddress;
	}

	public void setLocalityAddress(String localityAddress) {
		this.localityAddress = localityAddress;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getPhoneMain() {
		return phoneMain;
	}

	public void setPhoneMain(String phoneMain) {
		this.phoneMain = phoneMain;
	}

	public String getAppointmentPhone() {
		return appointmentPhone;
	}

	public void setAppointmentPhone(String appointmentPhone) {
		this.appointmentPhone = appointmentPhone;
	}

	public String getContactUrlScreening() {
		return contactUrlScreening;
	}

	public void setContactUrlScreening(String contactUrlScreening) {
		this.contactUrlScreening = contactUrlScreening;
	}

	public String getContactUrlSelfScreen() {
		return contactUrlSelfScreen;
	}

	public void setContactUrlSelfScreen(String contactUrlSelfScreen) {
		this.contactUrlSelfScreen = contactUrlSelfScreen;
	}

	public String getContactUrlTelemed() {
		return contactUrlTelemed;
	}

	public void setContactUrlTelemed(String contactUrlTelemed) {
		this.contactUrlTelemed = contactUrlTelemed;
	}

	public String getServType() {
		return servType;
	}

	public void setServType(String servType) {
		this.servType = servType;
	}

	public String getHours() {
		return hours;
	}

	public void setHours(String hours) {
		this.hours = hours;
	}

	public String getRequestTest() {
		return requestTest;
	}

	public void setRequestTest(String requestTest) {
		this.requestTest = requestTest;
	}

	public String getThirdPartyTest() {
		return thirdPartyTest;
	}

	public void setThirdPartyTest(String thirdPartyTest) {
		this.thirdPartyTest = thirdPartyTest;
	}

	public String getCollecting() {
		return collecting;
	}

	public void setCollecting(String collecting) {
		this.collecting = collecting;
	}

	public String getSpecCrit() {
		return specCrit;
	}

	public void setSpecCrit(String specCrit) {
		this.specCrit = specCrit;
	}

	public String getTestingCriteria() {
		return testingCriteria;
	}

	public void setTestingCriteria(String testingCriteria) {
		this.testingCriteria = testingCriteria;
	}

	public String getDataSource() {
		return dataSource;
	}

	public void setDataSource(String dataSource) {
		this.dataSource = dataSource;
	}

	public String getLocalAd() {
		return localAd;
	}

	public void setLocalAd(String localAd) {
		this.localAd = localAd;
	}

	public String getSpecificCriteria() {
		return specificCriteria;
	}

	public void setSpecificCriteria(String specificCriteria) {
		this.specificCriteria = specificCriteria;
	}

	public String getAppointments() {
		return appointments;
	}

	public void setAppointments(String appointments) {
		this.appointments = appointments;
	}

}
