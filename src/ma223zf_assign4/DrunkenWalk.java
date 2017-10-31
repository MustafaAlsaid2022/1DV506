package ma223zf_assign4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DrunkenWalk {

	public static void main(String[] args) {
		int countOfFell = 0; // Create a counter for falling walkers

		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter the size: ");
			int size = scan.nextInt();
			if (size <= 0) {

				/* Threw an exception if the size less than zero */
				throw new Exception("Size should be greater than zero!");
			}

			System.out.print("Enter the number of steps: ");
			int maxSteps = scan.nextInt();
			if (maxSteps <= 0)

				/* Threw an exception if the steps less than zero */
				throw new Exception("Numbe of steps should be greater than zero!");

			System.out.print("Enter the walks: ");
			int numOfDrunks = scan.nextInt();
			if (numOfDrunks <= 0)

				/*
				 * Threw an exception if the number of walkers is lees than zero
				 */
				throw new Exception("Numbe of walks should be greater than zero!");
			RndWalk drunk = new RandomWalk(maxSteps, size);

			for (int i = 0; i < numOfDrunks; i++) {

				/* Start a random walk */
				drunk.walk();

				/* Print out the number of steps and position. */

				/* Check number of fall walker */
				if (drunk.moreSteps()) {
					countOfFell++;

				}
				drunk.reset();

			}
			double persFall = ((float) countOfFell * 100 / (float) numOfDrunks);// Calculate
																				// the
																				// percentage
																				// of
																				// fell
																				// walkers.

			System.out.printf("Out of %d drunk people, %d (%.2f%s) fell into the water.", numOfDrunks, countOfFell,
					persFall, "%");

		}

		catch (InputMismatchException exc) {// Catch if the input miss match.
			exc.printStackTrace();

		} catch (Exception exc) {
			exc.printStackTrace();
			;
		}

		/* Close the scanner if/if not exception occurred */
		finally {

			scan.close();

		}
	}

}
