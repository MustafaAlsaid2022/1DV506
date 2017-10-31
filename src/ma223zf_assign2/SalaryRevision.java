package ma223zf_assign2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class SalaryRevision {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> salaryList = new ArrayList<String>(); //store  string//									   
		ArrayList<Integer> salaries = new ArrayList<Integer>(); //store integer//										
		System.out.print("Provide salaries (and terminate input with 'X'):");
		String str = "";
		int sumSalary = 0; // initial value//
		double median;
		double gap;
		double average;

		while (!str.toUpperCase().equals("X")) { // if the user insert not X//
			str = scan.next();
			String strTemp = str.replaceAll("\\D", "");
			salaryList.add(strTemp);
		}
		salaryList.remove(salaryList.size() - 1); // remove X from ArrayList//
		Collections.sort(salaryList); // sort ArrayList values//

		for (int i = 0; i < salaryList.size(); i++) {
			int salary = Integer.parseInt(salaryList.get(i)); //convert to string integer//
			salaries.add(salary);
		}
		for (int i = 0; i < salaries.size(); i++) {
			sumSalary = sumSalary + salaries.get(i);
		}
		average = sumSalary / salaries.size();
		gap = salaries.get(salaries.size() - 1) - salaries.get(0);
		if (salaries.size() % 2 == 0) {
			// find media when number of salaries are even//
			median = (salaries.get((salaries.size() / 2) - 1) + salaries.get(salaries.size() / 2)) / 2;
		} else {
			// find media when number of salaries are odd//
			median = salaries.get((salaries.size() - 1) / 2);
		}
		System.out.println();
		System.out.println("Median: " + Math.round(median));
		System.out.println("Average: " + Math.round(average));
		System.out.println("Gap: " + Math.round(gap));
		while (str.toUpperCase().equals("X")) {
			System.out.print(" ");
			str = scan.nextLine();
		}
		scan.close();
	}

}
