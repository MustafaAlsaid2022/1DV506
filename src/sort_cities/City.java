package sort_cities;

import java.text.DecimalFormat;

public class City implements Comparable<City> {
	/** Decimal format to print leading zeros in zip code */
	static DecimalFormat zipFormat = new DecimalFormat("00000");
	/* declare fields */
	private String name;
	private int zipcode;

	/* constructor */
	public City(int zip, String name) {
		this.name = name;
		this.zipcode = zip;
	}
	/* Represent city and its zipcode */

	public String getName() { // represent name//
		return name;
	}

	public int getZipCode() { // represent zipcode//
		return zipcode;
	}

	public void setName(String name) { //update name//
		this.name = name;
	}

	public void setZipCode(int zipcode) { // update zipcode//
		this.zipcode = zipcode;
	}

	/* Represent city and its zipcode */
	public String toString() {
		return (City.zipFormat.format(this.zipcode) + " " + this.name);
	}

	/* For Ascending order */
	public int compareTo(City c1) {
		City c2 = (City) c1;
		if (getZipCode() > c2.getZipCode()) {
			return 1;
		} else if (getZipCode() < c2.getZipCode()) {
			return -1;
		} else {
			return 0;
		}
	}
}
