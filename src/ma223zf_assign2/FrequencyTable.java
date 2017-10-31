package ma223zf_assign2;

import java.util.Random;

public class FrequencyTable {

	public static void main(String[] args) {
		Random rand = new Random(); // random object//
		int[] frequency = new int[6];
		for (int i = 1; i <= 6000; i++) { // simulate rolling a dice 6000//
											
			int dice = 1 + rand.nextInt(6); // random number between 1 to 6//
			if (dice == 1) {
				frequency[0]++;
			}
			if (dice == 2) {
				frequency[1]++;
			}
			if (dice == 3) {
				frequency[2]++;
			}
			if (dice == 4) {
				frequency[3]++;
			}
			if (dice == 5) {
				frequency[4]++;
			}
			if (dice == 6) {
				frequency[5]++;
			}
		}
		System.out.println("Frequencies when rolling a dice 6000 times");
		for (int i = 0; i <= 5; i++) { // print the array values//
			System.out.println((i + 1) + ": " + frequency[i]);
		}
	}

}
