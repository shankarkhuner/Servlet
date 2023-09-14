package model;

public class Address {

	private long pincode;
	private String city;
	private String country;
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", city=" + city + ", country=" + country + "]";
	}
	
	

	
}
