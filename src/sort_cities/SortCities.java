package sort_cities;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortCities {

	private static ArrayList<City> listcity = new ArrayList<City>(); // arraylist
																		// type
																		// of
																		// city//

	public static void main(String[] args) {
		/* read file by Scanner */
		try {
			File codes = new File("C:\\java_courses\\1DV506\\src\\ma223zf_assign4\\zip_codes.txt");
			Scanner scan = new Scanner(codes);
			/* add city object to arraylist */
			while (scan.hasNextLine()) {
				String st = scan.nextLine();
				int zipcode = Integer.parseInt(st.substring(0, 5));
				String name = st.substring(7, st.length());
				listcity.add(new City(zipcode, name));
			}
			scan.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		Collections.sort(listcity); // sort arraylist by implementing camparable
									// interface//
		System.out.println("number of cities: " + listcity.size());
		System.out.println(); // empty line//
		for (int i = 0; i < listcity.size(); i++) { // print sorted arraylist//
			System.out.println(listcity.get(i));
		}
	}
}