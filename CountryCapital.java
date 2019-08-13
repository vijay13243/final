package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CountryCapital {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// CODE START
		try {
			HashMap<String, String> countries;
			countries = new HashMap<>();
			countries.put("India", "Delhi");
			countries.put("China", "Beijing");
			countries.put("Oman", "Muscat");
			countries.put("France", "Paris");
			countries.put("Germany", "Berlin");

			int a = scan.nextInt();
			int n = 2 * a;
			String s[] = new String[n];
			for (int i = 0; i < n; i++) {
				s[i] = scan.next();
			}

			int option = scan.nextInt();
			String str = scan.next();

			for (int i = 0; i < a; i++) {
				countries.put(s[i], s[i + 1]);
			}

			if (option == 1) {
				String capital = CountryCapitala.getCapital(countries, str);
				if (capital == null) {
					System.out.println("Country not found");
				} else {
					System.out.println("Capital : " + capital);
				}

			} else if (option == 2) {
				String country = CountryCapitala.getCountry(countries, str);
				if (country == null) {
					System.out.println("Capital not found");
				} else {
					System.out.println("Country  : " + country);
				}
			} else {
				System.out.println("Invalid Option");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		// CODE END
	}
}

class CountryCapitala {

	// CODE HERE

	static String getCapital(HashMap<String, String> hm, String country) {
		for (Map.Entry m : hm.entrySet()) {

			boolean b = m.getKey().equals(country);
			if (b) {
				Object c = m.getValue();
				String d = (String) c;
				return d;
			}
		}

		return null;

	}

	static String getCountry(HashMap<String, String> hm, String capital) {
		for (Map.Entry m : hm.entrySet()) {

			Object b = m.getValue();
			String str = (String) b;
			boolean a = str.equalsIgnoreCase(capital);

			if (a) {
				Object c = m.getKey();
				String d = (String) c;
				return d;
			}
		}

		return null;

	}
}// CODE HERE


/*
 * Problem Statement: Find Capital and Country Create a class CountryCapital
 * with the following static methods:
 * 
 * getCapital(HashMap<String, String> , String ): String
 * getCountry(HashMap<String, String> , String ): String The first parameter to
 * both the methods is a HashMap containing country name as key and capital name
 * as value. getCapital method accepts country as second parameter(case
 * sensitive) and returns its capital from the HashMap getCountry method accepts
 * capital as second parameter(case insensitive) and returns its Country from
 * the HashMap Both the methods should return null, when capital/country is not
 * found in the HashMap Do the following in the main method of CountryCapitalApp
 * 
 * Accept 2n + 3 inputs from the console, where n is the number of Countries The
 * first input to the program is n, followed by the country names and the
 * capitals of n countries Next input is the option(choice), followed by the
 * country/capital name, based on the option For option 1: Input is country
 * name. Get the capital from the HashMap and display "Capital : xxxxxxx" If
 * Country is not found in HashMap, display "Country not found"
 * 
 * 
 * For option 2 Input is capital name. Get the country name from the HashMap and
 * display "Country : xxxxxxx" If capital is not found, display
 * "Capital not found"
 * 
 * For any other option - Display "Invalid Option" Example Sample Input: 2
 * Australia Canberra Srilanka Colombo 1 Australia
 * 
 * Expected Output: Capital : Canberra Sample Input: 2 Australia Canberra
 * Srilanka Colombo 1 Test
 * 
 * Expected Output: Country not found Sample Input: 3 Australia Canberra
 * Srilanka Colombo Oman Muscat 2 MUSCAT
 * 
 * Expected Output: Country : Oman Sample Input: 3 Australia Canberra Srilanka
 * Colombo Oman Muscat 2 musCAT
 * 
 * Expected Output: Country : Oman Sample Input: 2 Australia Canberra Srilanka
 * Colombo 6 Test
 * 
 * Expected Output: Invalid Option
 */